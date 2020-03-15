package com.testing.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuitConfig {

	@BeforeSuite
	public void beforeSuite(){

		System.out.println("before suite run!");

	}
	@AfterSuite
	public void afterSuite(){

		System.out.println("after suite run");
	}
}
