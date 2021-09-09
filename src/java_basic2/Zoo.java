package java_basic2;

public class Zoo {

	public static void main(String[] args) {
		Animal animal1=new Animal(12,"Male",23);
		animal1.eat();
		animal1.sleep();
		
		Bird bird1=new Bird(3,"F",10);
		bird1.fly();
		bird1.sleep();
		bird1.eat();
		
		Fish fish1=new Fish(2,"M",5);
		fish1.swim();
		
		Animal animal2=new Fish(4,"F",9);
		//animal2.swim();
		animal2.eat();
		animal2.sleep();
	}

}
