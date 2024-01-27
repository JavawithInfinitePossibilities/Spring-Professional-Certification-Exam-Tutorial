package com.sid.tutorials.spring.module01.stereotypes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module01.stereotypes.components.TaxCalculationComponent;
import com.sid.tutorials.spring.module01.stereotypes.dao.TaxRateDao;
import com.sid.tutorials.spring.module01.stereotypes.ds.Article;
import com.sid.tutorials.spring.module01.stereotypes.ds.TaxCalculation;
import com.sid.tutorials.spring.module01.stereotypes.ds.TaxInformation;
import com.sid.tutorials.spring.module01.stereotypes.ds.TaxRate;

@Service
public class TaxInformationService {

    @Autowired
    private TaxRateDao taxRateDao;
    @Autowired
    private TaxCalculationComponent taxCalculationComponent;

    public TaxInformation getTaxInformation(Article article) {
        TaxRate taxRate = taxRateDao.getTaxRate(article);

        TaxCalculation taxCalculation = taxCalculationComponent.calculateTax(article, taxRate);

        return new TaxInformation(article, taxCalculation);
    }
}
