package com.testing.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
	public void stud(){
		System.out.println("这是student2的班级");
	}
}
