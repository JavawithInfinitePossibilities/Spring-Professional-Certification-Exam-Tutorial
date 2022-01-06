package com.sid.tutorials.spring.module05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sid.tutorials.spring.module05.dao.ArticlesDao;

@Controller
public class IndexController {

    @Autowired
    private ArticlesDao articlesDao;

    @GetMapping({"/", "/index", "/home"})
    public String index(Model model) {
        model.addAttribute("articles", articlesDao.findAll());

        return "index";
    }
}
