package com.sid.tutorials.spring.module01.stereotypes.dao;

import org.springframework.stereotype.Repository;

import com.sid.tutorials.spring.module01.stereotypes.ds.Article;
import com.sid.tutorials.spring.module01.stereotypes.ds.TaxRate;

@Repository
public class TaxRateDao {
    public TaxRate getTaxRate(Article article) {
        return new TaxRate();
    }
}
