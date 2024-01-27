package com.sid.tutorials.spring.module04.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	private Logger logger = LoggerFactory.getLogger(TodoController.class);

	@Autowired
	private TodoItemsDao todoItemsDao;

	@GetMapping
	public String index(Model model) {
		logger.trace("TRACE Message");
		logger.debug("DEBUG Message");
		logger.info("INFO Message");
		logger.warn("WARN Message");
		logger.error("ERROR Message");
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
