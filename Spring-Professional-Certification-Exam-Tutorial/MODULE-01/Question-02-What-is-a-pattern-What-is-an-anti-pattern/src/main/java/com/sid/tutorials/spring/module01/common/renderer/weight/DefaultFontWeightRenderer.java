package com.sid.tutorials.spring.module01.common.renderer.weight;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DefaultFontWeightRenderer implements FontWeightRenderer {
	@Override
	public String render(String text) {
		return "<default-weight>" + text + "</default-weight>";
	}
}
