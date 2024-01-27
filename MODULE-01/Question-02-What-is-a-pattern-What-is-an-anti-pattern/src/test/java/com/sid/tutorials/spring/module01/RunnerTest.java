package com.sid.tutorials.spring.module01;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module01.before.TextRenderer;
import com.sid.tutorials.spring.module01.common.renderer.color.DefaultColorRenderer;
import com.sid.tutorials.spring.module01.common.renderer.color.RedColorRenderer;
import com.sid.tutorials.spring.module01.common.renderer.style.DefaultFontStyleRenderer;
import com.sid.tutorials.spring.module01.common.renderer.weight.BoldFontWeightRenderer;
import com.sid.tutorials.spring.module01.common.renderer.weight.DefaultFontWeightRenderer;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Disabled
	@Test
	void test1() {
		TextRenderer renderer = context.getBean(TextRenderer.class);
		renderer.render("Default Rendering");
	}

	@Disabled
	@Test
	void test2() {
		TextRenderer renderer = context.getBean(TextRenderer.class);
		String rendering = renderer.applyRendering("Red Color Rendering", new DefaultFontStyleRenderer(),
				new RedColorRenderer(), new DefaultFontWeightRenderer());
		System.out.println(rendering);
	}

	@Test
	void test3() {
		TextRenderer renderer = context.getBean(TextRenderer.class);
		String rendering = renderer.applyRendering("Bold Rendering", new DefaultFontStyleRenderer(),
				new DefaultColorRenderer(), new BoldFontWeightRenderer());
		System.out.println(rendering);
	}
}
