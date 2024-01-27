package com.sid.tutorials.spring.module04.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public String index(TodoItem todoItem, Model model) {

		model.addAttribute("todoItems", todoItemsDao.findAll());
		model.addAttribute("newTodoItem", new TodoItem());

		return "index";
	}

	@PostMapping("/add")
	public String add(@Valid @ModelAttribute TodoItem todoItem, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return index(todoItem, model);
		} else {
			todoItemsDao.save(todoItem);
			return "redirect:/";
		}
	}
}
