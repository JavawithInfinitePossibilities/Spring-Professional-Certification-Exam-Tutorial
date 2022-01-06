package com.sid.tutorials.spring.module01.common.renderer.weight;

import org.springframework.stereotype.Component;

@Component
public class BoldFontWeightRenderer implements FontWeightRenderer {
	@Override
	public String render(String text) {
		return "<bold-weight>" + text + "</bold-weight>";
	}
}
