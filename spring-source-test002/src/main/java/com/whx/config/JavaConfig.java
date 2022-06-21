package com.whx.config;

import com.whx.model.ProxyModel;
import com.whx.model.User;
import org.springframework.context.annotation.*;

@ComponentScan(basePackages = {"com.whx.model"})
@Configuration
public class JavaConfig {
	@Bean
	public User user() {
		return new User("001", "嘻嘻哥");
	}
//
	@Bean
	@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
	public ProxyModel proxyModel() {
		return new ProxyModel();
	}

}
