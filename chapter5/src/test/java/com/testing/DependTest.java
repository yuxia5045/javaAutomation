package com.testing;

import org.testng.annotations.Test;

public class DependTest {
	@Test
	public void test1(){
		System.out.println("test1");
		throw new RuntimeException(); //test1失败时，最终的结果时test1 failed,test2 ignored;
	}
	@Test(dependsOnMethods = "test1")
	public void test2(){
		System.out.println("test2");
	}
}
