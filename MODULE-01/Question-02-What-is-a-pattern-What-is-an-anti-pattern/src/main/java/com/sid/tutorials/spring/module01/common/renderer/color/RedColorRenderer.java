package com.sid.tutorials.spring.module01.common.renderer.color;

import org.springframework.stereotype.Component;

@Component
public class RedColorRenderer implements FontColorRenderer {
	@Override
	public String render(String text) {
		return "<red-color>" + text + "</red-color>";
	}
}
