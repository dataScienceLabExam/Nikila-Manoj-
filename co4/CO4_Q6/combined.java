package co4;

import java.util.Scanner;

public class combined {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the lower limit of range");
	    int x = sc.nextInt();
	    System.out.println("Enter the Upper limit of range");
	    int y = sc.nextInt();
	    Runnable r = new fibannoci(x,y);
	    Thread obj1 = new Thread(r);
	    obj1.start();
	    Runnable p = new even(x,y);
	    Thread obj2 = new Thread(p);
	    obj2.start();
	    }
}
