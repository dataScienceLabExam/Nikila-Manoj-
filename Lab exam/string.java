package exam2030;
import java.util.Scanner;
public class string{

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string :");
		str=sc.nextLine();
		System.out.println("\n....The string handling functions....\n");
		System.out.println("string length:"+str.length());
		System.out.println("LOWERCASE : "+str.toLowerCase());
	    System.out.println("UPPERCASE : "+str.toUpperCase());
	    System.out.println("String ends with a : "+str.endsWith("a"));
		System.out.println("character position:"+str.charAt(6));
		System.out.println("string replaced:"+str.replace("hello","hi"));
			
	}

}
