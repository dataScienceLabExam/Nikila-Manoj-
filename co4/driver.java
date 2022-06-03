package co4;
import co4.graphics.circle;
import co4.graphics.rectangle;
import co4.graphics.square;
import co4.graphics.triangle;
import java.util.Scanner;

public class driver {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        circle obj1 = new circle();
	        rectangle obj2 = new rectangle();
	        square obj3 = new square();
	        triangle obj4 = new triangle();
	                System.out.println(" MAIN MENU\n  \n1)Circle   \n2)Rectangle   \n3)Square  \n4)Triangle  \nChoose any  from the options below: ");
	                choice = sc.nextInt();
	                switch (choice) {
	                    case 1:
	                        obj1.area();
	                        break;
	                    case 2:
	                        obj2.area();
	                        break;
	                    case 3:
	                        obj3.area();
	                        break;
	                    case 4:
	                        obj4.area();
	                    default:
	                        break;
	                }

	        }
}
