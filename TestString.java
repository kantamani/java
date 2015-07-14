	import java.util.*;

	public class TestString {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	FirstString s=new FirstString();
	System.out.println("Enter your string");
	String str;
	str=sc.nextLine();
	System.out.println("enter email address");
	String email=sc.nextLine();
	System.out.println("enter a string to reverse");
	String str1;
	str1=sc.nextLine();
	s.returnString(str);
	System.out.println();
	System.out.println("given"+email+"is"+s.validateEmail(email));
	System.out.println();
	s.reverseString(str1);
	}
	}