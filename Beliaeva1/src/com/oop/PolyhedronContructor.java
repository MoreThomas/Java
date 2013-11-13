package com.oop;
/**
 * Багатогранні конструктори. 
 * Створити клас MyClass з полем a, 
 * яке може ініціалізуватися значеннями за замовченням. 
 * Передбачити два конструктори: без аргументів, 
 * а також з одним аргументом,  який встановлює поле в задане значення. 
 * Кожний конструктор має виводити своє повідомлення, 
 * але обидва вони мають виводити на екран інформацію про значення поля.
 * @author Julia
 *
 */
public class PolyhedronContructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyClass class1 = new MyClass();
		MyClass class2 = new MyClass("Batman");
	}

}
