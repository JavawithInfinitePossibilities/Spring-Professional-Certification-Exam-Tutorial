package com.sid.tutorials.spring.module04.dao;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.spring.module04.ds.TodoItem;

public interface TodoItemsDao extends CrudRepository<TodoItem, Integer> {
}
