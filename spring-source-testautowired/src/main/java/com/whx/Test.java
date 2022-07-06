package com.whx;

import com.whx.config.Config;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.AbstractRefreshableWebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.io.IOException;

@Component
public class Test {

	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.whx");
		context.refresh();

//		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
//		annotationConfigWebApplicationContext.scan("com.whx");
//		annotationConfigWebApplicationContext.refresh();


	}

}
