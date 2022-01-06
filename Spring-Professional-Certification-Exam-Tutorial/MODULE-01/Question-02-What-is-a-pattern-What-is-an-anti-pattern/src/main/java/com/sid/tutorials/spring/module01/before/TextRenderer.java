package com.sid.tutorials.spring.module01.before;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module01.common.renderer.Renderer;
import com.sid.tutorials.spring.module01.common.renderer.color.FontColorRenderer;
import com.sid.tutorials.spring.module01.common.renderer.style.FontStyleRenderer;
import com.sid.tutorials.spring.module01.common.renderer.weight.FontWeightRenderer;

@Service("beforeTextRenderer")
public class TextRenderer {

	private final FontStyleRenderer fontStyleRenderer;
	private final FontColorRenderer fontColorRenderer;
	private final FontWeightRenderer fontWeightRenderer;

	public TextRenderer(@Autowired FontStyleRenderer fontStyleRenderer, @Autowired FontColorRenderer fontColorRenderer,
			@Autowired FontWeightRenderer fontWeightRenderer) {
		this.fontStyleRenderer = fontStyleRenderer;
		this.fontColorRenderer = fontColorRenderer;
		this.fontWeightRenderer = fontWeightRenderer;
	}

	public void render(String text) {
		String renderedText = applyRendering(text, fontStyleRenderer, fontColorRenderer, fontWeightRenderer);
		System.out.println(renderedText);
	}

	public String applyRendering(String text, Renderer... renderers) {
		for (Renderer renderer : renderers) {
			text = renderer.render(text);
		}
		return text;
	}
}
