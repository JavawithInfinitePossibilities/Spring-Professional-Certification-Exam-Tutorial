package com.sid.tutorials.spring.module04;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.spring.module04.data.layer.FtpDataLayer;
import com.sid.tutorials.spring.module04.data.layer.HttpDataLayer;
import com.sid.tutorials.spring.module04.data.transfer.DataTransferAction;
import com.sid.tutorials.spring.module04.ds.Person;

@SpringBootTest(classes = Runner.class)
public class DataTransferActionMockitoInjectTest {

	private static final List<Person> PERSON_LIST = Arrays.asList(new Person(98, "Test1"), new Person(99, "Test2"));

	@InjectMocks
	private DataTransferAction dataTransferAction;
	@Mock
	private FtpDataLayer ftpDataLayer;
	@Mock
	private HttpDataLayer httpDataLayer;

	@Test
	public void shouldTransferDataFromFtpToHttp() {
		when(ftpDataLayer.getData()).thenReturn(PERSON_LIST);
		dataTransferAction.transfer();
		verify(httpDataLayer).saveData(PERSON_LIST);
	}
}