package com.testing.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotation {
	@Test(invocationCount = 10,threadPoolSize = 3)
	public void test(){
		System.out.println("thread111111111");
		System.out.printf("thread ID:%s%n",Thread.currentThread().toString());
	}
}
