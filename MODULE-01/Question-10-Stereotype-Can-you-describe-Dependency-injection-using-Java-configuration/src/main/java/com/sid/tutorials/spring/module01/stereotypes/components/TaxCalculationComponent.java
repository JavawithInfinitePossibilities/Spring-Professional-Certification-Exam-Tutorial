package com.sid.tutorials.spring.module01.stereotypes.components;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.stereotypes.ds.Article;
import com.sid.tutorials.spring.module01.stereotypes.ds.TaxCalculation;
import com.sid.tutorials.spring.module01.stereotypes.ds.TaxRate;

@Component
public class TaxCalculationComponent {

    public TaxCalculation calculateTax(Article article, TaxRate taxRate) {
        return new TaxCalculation();
    }
}
