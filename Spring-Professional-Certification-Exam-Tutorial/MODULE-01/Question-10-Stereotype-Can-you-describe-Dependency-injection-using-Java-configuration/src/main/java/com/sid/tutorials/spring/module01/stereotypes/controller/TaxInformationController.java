package com.sid.tutorials.spring.module01.stereotypes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sid.tutorials.spring.module01.stereotypes.ds.Article;
import com.sid.tutorials.spring.module01.stereotypes.ds.TaxInformation;
import com.sid.tutorials.spring.module01.stereotypes.service.TaxInformationService;

@Controller
public class TaxInformationController {

    @Autowired
    private TaxInformationService taxInformationService;

    public void printTaxInformation(Article article) {
        TaxInformation taxInformation = taxInformationService.getTaxInformation(article);

        String formattedTaxInformation = String.format("%s %s",
                taxInformation.getArticle().getName(),
                taxInformation.getTaxCalculation().getTaxValue()
        );

        System.out.println(formattedTaxInformation);
    }
}
