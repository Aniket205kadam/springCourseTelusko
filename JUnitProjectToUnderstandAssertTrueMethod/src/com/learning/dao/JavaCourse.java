package com.learning.dao;

public class JavaCourse implements Course
{

	@Override
	public boolean coursePurchased() 
	{
		System.out.println("Java course purchased");
		System.out.println("Its not connecting to the DB that why get the result false");
		return false;
	}
}
