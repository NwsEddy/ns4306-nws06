package week03.slot03;

import week02.slot01.Cat;

public class TestPerson {

	public static void main(String[] args) {
		Person person1 = new Person("Jailani", 3);
		Cat cat1 = new Cat("ABC", 50, 50);
		person1.adopt(cat1);
		
		person1.adopt(new Cat("DEF", 50, 50));
		
		System.out.println(person1);
		
		person1.disown("DEF");
		System.out.println(person1);
		
		Person person2 = new Person("Rahman");
		person2.adopt("GHI", 50, 60);
		System.out.println(person2);
		
		Person person3 = new Person(4);
		System.out.println(person3);
	}
	
}





