import java.util.*;
public class BasicCal {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)){

        System.out.println("Welcome to Basic Calculator");
        System.out.println("***************************");
        System.out.print("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = sc.nextFloat();

        

        System.out.println("Enter the operation you want to perform: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int operation = sc.nextInt();

        
           
            switch (operation) {
                case 1 -> System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                case 2 -> System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
                case 3 -> System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
                case 4 -> System.out.println("The division of " + num1 + " and " + num2 + " is " + (num1 / num2));
                default -> System.out.println("Invalid operation. Please enter a valid operation!");
            }
    }
    // catch block to handle exceptions if the user enters a string or any other data type other than integer or float

    catch (Exception e){
        System.out.println("Invalid input. Please enter a valid number!");

    }
    
}
}


