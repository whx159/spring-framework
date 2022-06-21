package com.whx.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

//@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProxyModel {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
