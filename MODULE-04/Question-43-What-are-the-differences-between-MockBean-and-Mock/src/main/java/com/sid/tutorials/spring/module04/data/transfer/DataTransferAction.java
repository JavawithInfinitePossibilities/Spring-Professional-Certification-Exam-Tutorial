package com.sid.tutorials.spring.module04.data.transfer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module04.data.layer.FtpDataLayer;
import com.sid.tutorials.spring.module04.data.layer.HttpDataLayer;
import com.sid.tutorials.spring.module04.ds.Person;

import lombok.Setter;

@Component
@Setter
public class DataTransferAction {

	@Autowired
	FtpDataLayer ftpDataLayer;
	@Autowired
	HttpDataLayer httpDataLayer;

	public void transfer() {
		List<Person> personData = ftpDataLayer.getData();
		httpDataLayer.saveData(personData);
	}
}
