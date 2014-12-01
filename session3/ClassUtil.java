package com.srie.test;

import java.lang.reflect.Method;

public class ClassUtil {

	/**
	 * print class message, including methods, parameters
	 * 
	 * @param obj
	 */
	public static void printClassMessage(Object obj) {
		Class c = obj.getClass();
		System.out.println("Class name:" + c.getName());
		/*
		 * Method�࣬��������
		 * getMethods()�������public�ĺ�������������̳ж�����
		 * getDeclaredMethods()������и����Լ��ķ��������ʷ���Ȩ��
		 */
		Method [] ms = c.getMethods();//c.getDeclaredMethods();
		for(int i=0;i<ms.length;i++){
			//�����ķ���ֵ���͵�������
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName() + " ");
			//����������
			System.out.print(ms[i].getName()+"(");
			//��ȡ��������--->�õ����ǲ����б�����͵�������
			Class[] paramType = ms[i].getParameterTypes();
			for (Class class1 : paramType) {
				System.out.print(class1.getName() + ",");
			}
			System.out.println(")");
		}
	}
}
