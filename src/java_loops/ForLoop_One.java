package java_loops;

public class ForLoop_One {

	public static void main(String[] args) {
		
		printEvenNumbers(0,2);
	}
	
	public static void printEvenNumbers(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.println("Even Number : "+i);
			}
		}
	}

}
