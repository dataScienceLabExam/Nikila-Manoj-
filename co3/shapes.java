package co3;
import java.util.Scanner;
public class shapes {
	

	    // int a1,b1,c1;
	    // shapes(int l,int b, int h){
	    //     a1=l;
	    //     b1=b;
	    //     c1=h;
	    //}
	    void area(int r1){
	        double Area_val = 3.14*r1*r1;
	        System.out.println("\nArea of Circle  = "+Area_val);
	    }
	    void area(int a1,int b1){
	        int Area_val = a1*b1;
	        System.out.println("\nArea of Rectangle = "+Area_val);
	    }
	    void area(int a1,int b1,int c1){
	        int Area_val = a1*b1*c1;
	        System.out.println("\nArea of Cuboid  = "+Area_val);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("\nEnter the Length");
	        int l = sc.nextInt();
	        System.out.println("Enter the Breath");
	        int b = sc.nextInt();
	        System.out.println("Enter the Height");
	        int h = sc.nextInt();
	        System.out.println("Enter the Radius");
	        int r = sc.nextInt();
	        shapes obj1 = new shapes();
	        obj1.area(r);
	        obj1.area(l,b);
	        obj1.area(l,b,h);
	    }

	
}
