package com.sid.tutorials.spring.module01.after;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module01.common.renderer.Renderer;
import com.sid.tutorials.spring.module01.common.renderer.color.DefaultColorRenderer;
import com.sid.tutorials.spring.module01.common.renderer.color.FontColorRenderer;
import com.sid.tutorials.spring.module01.common.renderer.style.DefaultFontStyleRenderer;
import com.sid.tutorials.spring.module01.common.renderer.style.FontStyleRenderer;
import com.sid.tutorials.spring.module01.common.renderer.weight.DefaultFontWeightRenderer;
import com.sid.tutorials.spring.module01.common.renderer.weight.FontWeightRenderer;

@Service("afterTextRenderer")
public class TextRenderer {

	private final FontStyleRenderer fontStyleRenderer;
	private final FontColorRenderer fontColorRenderer;
	private final FontWeightRenderer fontWeightRenderer;

	private TextRenderer(@Autowired FontStyleRenderer fontStyleRenderer, @Autowired FontColorRenderer fontColorRenderer,
			@Autowired FontWeightRenderer fontWeightRenderer) {
		this.fontStyleRenderer = fontStyleRenderer;
		this.fontColorRenderer = fontColorRenderer;
		this.fontWeightRenderer = fontWeightRenderer;
	}

	void render(String text) {
		String renderedText = applyRendering(text, fontStyleRenderer, fontColorRenderer, fontWeightRenderer);
		System.out.println(renderedText);
	}

	private String applyRendering(String text, Renderer... renderers) {
		for (Renderer renderer : renderers) {
			text = renderer.render(text);
		}
		return text;
	}

	@Component
	@Scope("prototype")
	public static class TextRendererBuilder {
		private FontStyleRenderer fontStyleRenderer = new DefaultFontStyleRenderer();
		private FontColorRenderer fontColorRenderer = new DefaultColorRenderer();
		private FontWeightRenderer fontWeightRenderer = new DefaultFontWeightRenderer();

		public TextRendererBuilder withFontStyleRenderer(FontStyleRenderer fontStyleRenderer) {
			this.fontStyleRenderer = fontStyleRenderer;
			return this;
		}

		public TextRendererBuilder withFontColorRenderer(FontColorRenderer fontColorRenderer) {
			this.fontColorRenderer = fontColorRenderer;
			return this;
		}

		public TextRendererBuilder withFontWeightRenderer(FontWeightRenderer fontWeightRenderer) {
			this.fontWeightRenderer = fontWeightRenderer;
			return this;
		}

		public TextRenderer build() {
			return new TextRenderer(fontStyleRenderer, fontColorRenderer, fontWeightRenderer);
		}
	}
}
