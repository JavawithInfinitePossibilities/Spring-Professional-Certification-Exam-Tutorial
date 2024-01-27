package com.sid.tutorials.spring.module01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module01.bls.AlternativeCurrenciesRepository;
import com.sid.tutorials.spring.module01.bls.CurrenciesRepository;
import com.sid.tutorials.spring.module01.bls.CurrencyService;
import com.sid.tutorials.spring.module01.ds.CurrencyId;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		CurrencyService currencyService = context.getBean(CurrencyService.class);
        CurrenciesRepository currenciesRepository = context.getBean(CurrenciesRepository.class);
        AlternativeCurrenciesRepository alternativeCurrenciesRepository = context.getBean(AlternativeCurrenciesRepository.class);

        currencyService.getExchangeRate("EUR", "USD");
        currencyService.getExchangeRate("EUR", "USD", 100);
        currencyService.getCurrencyLongName(CurrencyId.EUR);
        try {
            currencyService.getCurrencyCountryName(CurrencyId.EUR);
        } catch (Exception e) {
            // ignored on purpose
        }
        currencyService.getCurrencyCountryName(CurrencyId.USD);
        currenciesRepository.getCurrenciesCount();
        alternativeCurrenciesRepository.getCurrenciesCount();
	}

}
