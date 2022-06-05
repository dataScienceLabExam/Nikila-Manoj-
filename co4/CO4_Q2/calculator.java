package co4;
import co4.operations.add;
import co4.operations.divide;
import co4.operations.multiply;
import co4.operations.subtract;

import java.util.Scanner;

public class calculator {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the First Number");
	        int a = sc.nextInt();
	        System.out.println("Enter the Second Number");
	        int b = sc.nextInt();
	        System.out.println("......ARITHMETIC OPERATIONS ON THE GIVEN NUMBERS......\n");
	        add obj1 =new add();
	        obj1.cal(a,b);
	        subtract obj2 =new subtract();
	        obj2.cal(a,b);
	        multiply obj3 = new multiply();
	        obj3.cal(a,b);
	        divide obj4 = new divide();
	        obj4.cal(a,b);
	    }
}
