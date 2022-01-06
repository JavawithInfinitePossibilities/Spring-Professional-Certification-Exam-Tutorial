package com.sid.tutorials.spring.module01.common.renderer.color;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DefaultColorRenderer implements FontColorRenderer {
	@Override
	public String render(String text) {
		return "<default-color>" + text + "</default-color>";
	}
}
