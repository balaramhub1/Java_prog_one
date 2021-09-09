package java_basic;

public class Earth {
	
	public static void main(String args[]) {
		Human tom;
		tom=new Human();
		tom.age=5;
		tom.eyeColor="blue";
		tom.heightInInches=72;
		tom.name="Tom Hanks";
		
		tom.speak();
		
		Human joe=new Human();
		joe.age=36;
		joe.eyeColor="green";
		joe.name="Joe Greens";
		joe.heightInInches=68;
		
		joe.speak();
		
		Human human1=new Human();
		Human human2=new Human();
		Human human3=new Human();
		
		human1.speak();
		human2.speak();
		human3.speak();
		
		Human human4=new Human("Ram", 32, 76, "Black");

		human4.speak();
	}

}
