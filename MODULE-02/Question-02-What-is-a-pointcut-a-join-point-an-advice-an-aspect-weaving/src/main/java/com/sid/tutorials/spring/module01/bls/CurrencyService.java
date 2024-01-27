package com.sid.tutorials.spring.module01.bls;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.annotations.InTransaction;
import com.sid.tutorials.spring.module01.annotations.Secured;
import com.sid.tutorials.spring.module01.ds.CurrencyId;

@Component("currency_service")
@Secured
public class CurrencyService {
    @InTransaction
    public float getExchangeRate(String from, String to) {
        return 0f;
    }

    public float getExchangeRate(String from, String to, int multiplier) {
        return 0f;
    }

    public String getCurrencyLongName(CurrencyId currencyId) {
        return null;
    }

    public String getCurrencyCountryName(CurrencyId currencyId) {
        if (currencyId == CurrencyId.USD)
            return "USA";
        else
            throw new IllegalArgumentException("test");
    }
}
