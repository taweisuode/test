package test;

import java.util.Vector;
class Box<T> {
	private T t;
	public T add(T t) {
		return t;
	}	
}
public class test {
	public static void main(String[] args) {
		Box box = new Box<String>();
		Box box2 = new Box<Integer>();
		System.out.println(box.add("aaaa"));
		System.out.println(box2.add(4));
		System.out.println(box.add("aaaa").getClass().getSimpleName());
		System.out.println(box2.add(4).getClass().getSimpleName());
	}
}
