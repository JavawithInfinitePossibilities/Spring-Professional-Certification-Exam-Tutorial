package com.sid.tutorials.spring.module03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.sid.tutorials.spring.module04.Runner;
import com.sid.tutorials.spring.module04.service.NameService;
import com.sid.tutorials.spring.module04.storage.DbStorageService;
import com.sid.tutorials.spring.module04.storage.FileStorageService;
import com.sid.tutorials.spring.module04.web.TodoController;

@SpringBootTest(classes = Runner.class)
@AutoConfigureMockMvc
@WebMvcTest(TodoController.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	/*
	 * @Autowired private NameService nameService;
	 */
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private NameService nameService;

	@MockBean
	private DbStorageService dbStorageService;
	@MockBean
	private FileStorageService fileStorageService;

	@Test
	void test() throws Exception {
		/* System.out.println(nameService.getName()); */
		when(nameService.getName()).thenReturn("Test");
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/hello")).andReturn();
		assertEquals("Hello Test", mvcResult.getResponse().getContentAsString());
	}
}
