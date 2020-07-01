package com.deepsingh44.blogspot.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//step 1: create a class.
//step 2: implements servlet interface 
//step 3: override all the methods of servlet interface
public class First implements Servlet {

	@Override
	public void destroy() {
		System.out.println("destroy");

	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getservletconfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getservletin");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init");

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("services....");
	}

}
