package com.mambodata.songr;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.Map;



import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc

class SongrApplicationTests {
	
	@Autowired
	private GreetingController controller;
	@Autowired
	private MockMvc mockMVC;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	@Test
	void testAlbumsPageDisplaysDamn() throws Exception {
		this.mockMVC.perform(get("/albums")).andExpect(content().string(containsString("Damn")));
		
	}
	
	

}
