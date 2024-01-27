package com.sid.tutorials.spring.module01.common.renderer.style;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DefaultFontStyleRenderer implements FontStyleRenderer {
	@Override
	public String render(String text) {
		return "<default-style>" + text + "</default-style>";
	}
}
