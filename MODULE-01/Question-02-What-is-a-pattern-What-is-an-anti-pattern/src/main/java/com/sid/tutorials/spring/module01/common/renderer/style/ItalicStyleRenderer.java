package com.sid.tutorials.spring.module01.common.renderer.style;

import org.springframework.stereotype.Component;

@Component
public class ItalicStyleRenderer implements FontStyleRenderer {
	@Override
	public String render(String text) {
		return "<italic-style>" + text + "</italic-style>";
	}
}
