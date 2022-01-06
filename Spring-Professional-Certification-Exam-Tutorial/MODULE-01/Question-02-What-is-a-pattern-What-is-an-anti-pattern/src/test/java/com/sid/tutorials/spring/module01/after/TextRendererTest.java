package com.sid.tutorials.spring.module01.after;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module01.Runner;
import com.sid.tutorials.spring.module01.after.TextRenderer.TextRendererBuilder;
import com.sid.tutorials.spring.module01.common.renderer.color.RedColorRenderer;
import com.sid.tutorials.spring.module01.common.renderer.weight.BoldFontWeightRenderer;

@SpringBootTest(classes = Runner.class)
class TextRendererTest {

	@Autowired
	ApplicationContext context;

	@Disabled
	@Test
	void test1() {
		TextRenderer renderer = context.getBean(TextRenderer.class);
		renderer.render("Default after Rendering");
	}

	@Test
	void test2() {
		TextRendererBuilder builder = context.getBean(TextRendererBuilder.class);
		TextRenderer redRenderer = builder.withFontColorRenderer(new RedColorRenderer()).build();
		redRenderer.render("Red Color Rendering");
		builder = context.getBean(TextRendererBuilder.class);
		TextRenderer boldRenderer = builder.withFontWeightRenderer(new BoldFontWeightRenderer()).build();
		boldRenderer.render("Bold Rendering");
	}

}
