package com.seenu;

class Calculator{
	public int add(int a ,int b) {return a+b;}
	public int add(int a,int b,int c) {return a+b+c;}
}
class test{
	public static void main(String[]args) {
		Calculator c = new Calculator();
		System.out.println(c.add(123, 4564));
		System.out.println(c.add(234, 55675, 6368387));
	}
}
