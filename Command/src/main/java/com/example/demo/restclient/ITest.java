package com.example.demo.restclient;

public interface ITest {

	public int oper(int x, int y);
	public default String hi()
	{
		return "hi";
	}
}
