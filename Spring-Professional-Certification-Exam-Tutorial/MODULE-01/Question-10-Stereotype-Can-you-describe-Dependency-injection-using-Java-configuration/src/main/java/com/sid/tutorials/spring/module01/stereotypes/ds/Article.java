package com.sid.tutorials.spring.module01.stereotypes.ds;

public class Article {
	private int id;

	public Article(int id) {
		this.id = id;
	}

	public String getName() {
		return "Article-" + id;
	}
}
