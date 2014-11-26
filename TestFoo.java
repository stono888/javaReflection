package com.srie.test;

public class TestFoo {

	public static void main(String[] args) {
		Foo foo = new Foo();
		Class class1 = Foo.class;
		Class class2 = foo.getClass();
		Class class3 = null;
		try {
			class3 = Class.forName("com.srie.test.Foo");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(class1==class2);
		System.out.println(class2==class3);
		try {
			Foo foo2 = (Foo)class3.newInstance();
			foo2.print();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
class Foo{
	void print(){
		System.out.println("Foo");
	}
}