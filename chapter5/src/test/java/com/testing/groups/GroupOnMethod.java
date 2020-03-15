package com.testing.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {
	@Test(groups = "server")
	public void test1(){
		System.out.println("这是服务端测试方法1111111");
	}
	@Test(groups = "server")
	public void test2(){
		System.out.println("这是服务端测试方法22222");
	}
	@Test(groups = "client")
	public void test3(){
		System.out.println("这是客户端测试方法333333");
	}
	@BeforeGroups("server")
	public void beforeGroupOnServer(){
		System.out.println("这是服务端组运行之前的测试******");
	}
	@AfterGroups("server")
	public void afterGroupOnServer(){
		System.out.println("这是服务端组运行之h的测试**********");
	}
	@BeforeGroups("client")
	public void beforeGroupOnClient(){
		System.out.println("这是客户端组运行之前的测试！！！！！！");
	}
	@AfterGroups("client")
	public void afterGroupOnClient(){
		System.out.println("这是客户端组运行之h的测试！1!!!!!!");
	}
}
