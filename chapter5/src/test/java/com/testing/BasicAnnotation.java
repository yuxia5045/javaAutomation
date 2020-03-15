package com.testing;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {
	@Test
	public void testcase1(){
		System.out.print("this is a test");
	}

	@BeforeMethod
	public void testcase2(){
		System.out.print("this is a test");
	}

}
