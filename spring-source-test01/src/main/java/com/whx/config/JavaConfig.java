package com.whx.config;

import com.whx.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public User user() {
		return new User("001", "嘻嘻哥");
	}

}
