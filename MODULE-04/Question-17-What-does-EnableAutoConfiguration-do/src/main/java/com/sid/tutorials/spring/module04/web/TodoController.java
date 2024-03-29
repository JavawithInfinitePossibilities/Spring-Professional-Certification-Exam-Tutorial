package com.sid.tutorials.spring.module04.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sid.tutorials.spring.module04.dao.TodoItemsDao;
import com.sid.tutorials.spring.module04.ds.TodoItem;

@Controller
public class TodoController {

	@Autowired
	private TodoItemsDao todoItemsDao;

	@GetMapping
	public String index(Model model) {

		model.addAttribute("todoItems", todoItemsDao.findAll());
		model.addAttribute("newTodoItem", new TodoItem());

		return "index";
	}

	@PostMapping("/add")
	public String add(@ModelAttribute TodoItem todoItem) {
		todoItemsDao.save(todoItem);

		return "redirect:/";
	}
}
