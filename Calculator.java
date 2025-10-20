import java.util.*;
import java.util.Scanner;


public class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operation;
        int n1;
        int n2;
        boolean exit = true;
        while(exit){
            System.out.println("Operations you can perform are: \n1)Addition \n2)Subtraction \n3)Multiplication \n4)Division\n5)Exit");
            System.out.println("Enter the operation number you want to perform: ");
            operation = scanner.nextInt();
            if(operation == 5) {
                exit = false;
                break;
            }
            System.out.println("Enter the two numbers: ");
            System.out.println("Number 1: ");
            n1=scanner.nextInt();
            System.out.println("Number 2: ");
            n2=scanner.nextInt();

            switch(operation){
                case 1:
                    int add = n1+n2;
                    System.out.println("Addition: "+add);
                    break;
                case 2:
                    int sub = n1 - n2;
                    System.out.println("Subtraction: "+sub);
                    break;
                case 3:
                    int mul = n1 * n2;
                    System.out.println("Multiplication: "+mul);
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    } else {
                        System.out.println("Division: " + (n1 / n2));
                    }
                default:
                    System.out.println("Invalid number try\n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division\n5 to Exit");
                    break;
                }
            }
        System.out.println("Calculator has Ended Successfully!!");
        }
}


