package com.example.demo;

import com.example.demo.Dto.UserInputDto;
import nonapi.io.github.classgraph.utils.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.engine.TestExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockHttpServletRequestDsl;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.util.AssertionErrors.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(
		webEnvironment = SpringBootTest.WebEnvironment.MOCK
)

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@ContextConfiguration
@AutoConfigureMockMvc
class RegistrationApplicationTests{

	@Autowired
	protected MockMvc mvc;
	@Autowired
	private WebApplicationContext webApplicationContext;

	@BeforeEach
	public void setup() throws Exception {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
	}

	@Test
	public void getHomePage () throws Exception{
		this.mvc.perform(MockMvcRequestBuilders.get("/"))
				.andExpect(status().isOk());

	}

	@Test
	public void saveUser () throws  Exception {
		UserInputDto userInputDto = new UserInputDto();
		userInputDto.setName("Danis");

		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
				.post("/user/")
				.content("{ \"name\": \"QWERTY\"}")
				.contentType(MediaType.APPLICATION_JSON_VALUE);
		mvc.perform(builder)
				.andExpect(status().isCreated());
	}

}
