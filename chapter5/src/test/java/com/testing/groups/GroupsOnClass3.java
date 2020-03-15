package com.testing.groups;

import org.testng.annotations.Test;

@Test(groups ="teacher")
public class GroupsOnClass3 {
	public void teacher(){
		System.out.println("这是teachers");
	}
}

