package java_strings;

public class StringsOne {

	public static void main(String[] args) {

		String a ="hello World";
		System.out.println("Value of a is : "+a);
		
		System.out.println("*************************************************");
		
		char[] b=a.toCharArray();
		
		System.out.println(b);
		
		for(int i=0;i<b.length;i++) {
			System.out.println(i+"th element is : "+b[i]);
		}
		
		System.out.println("*************************************************");
		
		String str="ABCDEFG";
		
		String str2=str.substring(2);
		System.out.println("STR2 is : "+str2);
		System.out.println("*************************************************");
		
		String str3=str.substring(3, 5);
		System.out.println("STR3 is : "+str3);
		System.out.println("*************************************************");
		
		str3=str.substring(3, 7);
		System.out.println("STR3 is : "+str3);
		System.out.println("*************************************************");
	
		CharSequence str4=str.subSequence(3, 5);
		System.out.println("CharSequence STR4 is : "+str4);
	}

}
