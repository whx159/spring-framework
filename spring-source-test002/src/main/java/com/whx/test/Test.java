package com.whx.test;

import com.whx.config.JavaConfig;
import com.whx.model.ProxyModel;
import com.whx.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		ProxyModel proxyModel = (ProxyModel) context.getBean("proxyModel");
		String name = proxyModel.getName();
		System.out.println(user.toString());

	}

}
