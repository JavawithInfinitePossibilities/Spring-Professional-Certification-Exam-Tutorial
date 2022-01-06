package com.sid.tutorials.spring.module02.beans;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module02.annotation.Sanitize;

@Component
public class TransactionHistoryServiceClient {
    public void saveTransactionData(String identifier, String data, @Sanitize String privateKey) {
        System.out.println(
                String.format(
                        "Sending data, identifier = [%s], data = [%s], privateKey = [%s]",
                        identifier, data, privateKey
                )
        );
    }
}
