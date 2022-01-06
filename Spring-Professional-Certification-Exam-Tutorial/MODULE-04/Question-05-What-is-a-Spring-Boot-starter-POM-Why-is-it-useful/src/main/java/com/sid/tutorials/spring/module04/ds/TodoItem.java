package com.sid.tutorials.spring.module04.ds;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class TodoItem {
	@Id
	@GeneratedValue
	private Integer id;
	@NotBlank(message = "task title is required")
	private String title;
}
