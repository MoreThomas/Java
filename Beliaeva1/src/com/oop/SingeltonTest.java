package com.oop;
/**
 * Синглтон. Написати клас, організований за шаблоном Singleton. 
 * Проілюструвати звернення до методів екземпляру цього класу.
 * @author Julia
 *
 */
public class SingeltonTest {

	public static void main(String[] args) {
		MySingelton singl = MySingelton.getInstMySingelton();
		System.out.println(singl);
	}

}
