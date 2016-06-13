package example1;

import java.util.Scanner;

class Person{
	String name;
	int age = 1;
	
	public void Person(String name , int age){
		
		this.name = name;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Application {
	
	public static void main (String [] args){
		
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		p.setAge(i);
		
		System.out.println(i);
		
	}
	

}
