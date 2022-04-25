package co2;
import java.util.Scanner;
public class String_man {
	 public static void main(String[] args) {
	        System.out.println("Enter The String");
	        Scanner sc = new Scanner(System.in);
	        String str1 = sc.nextLine();
	        System.out.println("Length of String = "+str1.length());
	        System.out.println("Character at First position  = "+str1.charAt(1));
	        System.out.println("String Contains 'java' sequence :"+str1.contains("java"));
	        System.out.println("String ends with e : "+str1.endsWith("e"));
	        System.out.println("Replace'java' with 'python' : "+str1.replaceAll("java","python"));
	        System.out.println("LOWERCASE : "+str1.toLowerCase());
	        System.out.println("UPPERCASE : "+str1.toUpperCase());
	}
}
