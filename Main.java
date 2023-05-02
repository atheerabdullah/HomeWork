import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Atheer's world!");

        //1- Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
        int num1 = 125;
        int num2 = 24;

        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("The rustle of gather of two numbers : " + "" + sum);
        System.out.println("The rustle of subtract of two numbers : " + "" + subtract);
        System.out.println("The rustle of multiply of two numbers : " + "" + multiply);
        System.out.println("The rustle of divide of two numbers : " + "" + divide);
        System.out.println("The rustle of remainder of two numbers : " + "" + remainder);


        //2 - Write a Java program to convert a given string into lowercase.
        String statement = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        System.out.println(statement.toLowerCase());

        //3.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
        Scanner reader3 = new Scanner(System.in);
        System.out.println("Enter your courses , then enter your seat :");

        String coursesName = reader3.nextLine();
        int seatNumber = reader3.nextInt();
        int findIndex = coursesName.charAt(2);

        System.out.println("the name of course  = " + coursesName + " and the character at position 2 is " +
                (char) findIndex);


    /*4- Write a Java program to accept a number and check the number is even or not.
     Prints 1 if the number is even or 0 if the number is odd. (use if-statement)*/

        Scanner reader4 = new Scanner(System.in);
        System.out.println(" Enter your number");
        int num = reader4.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " your number is even");
        else
            System.out.println(num + " your number  is odd");

        //5.Write a program that checks the role of the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your role: ");
        String role = scanner.next();

        if (role.equals("admin")) {
            System.out.println("Welcome admin!");
        } else if (role.equals("superuser")) {
            System.out.println("Welcome superuser!");
        } else if (role.equals("user")) {
            System.out.println("Welcome user!");
        } else {
            System.out.println("Unknown role, please try again later.");
        }

        //6.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
        Scanner reader6 = new Scanner(System.in);
        System.out.println("Enter your numbers  :");
        int firstNum = reader6.nextInt();
        int secondNum = reader6.nextInt();
        int thirdNum = reader6.nextInt();
        int sumNum = firstNum + secondNum;

        if (sumNum == thirdNum) {
            System.out.println("The sum of " + firstNum + " and " + secondNum + " is equal to " + thirdNum);
        } else {
            System.out.println("The sum of " + firstNum + " and " + secondNum + "not equal to them ");
        }

        //7- Take three numbers from the user and print the greatest number.
        Scanner reader7 = new Scanner(System.in);
        System.out.println("Enter your numbers  :");
        int firstNumb = reader7.nextInt();
        int secondNumb = reader7.nextInt();
        int thirdNumb = reader7.nextInt();
        int greatest;

        if (firstNumb > secondNumb && firstNumb > thirdNumb) {
            greatest = firstNumb;
        } else if (secondNumb > thirdNumb) {
            greatest = secondNumb;
        } else {
            greatest = thirdNumb;
        }
        System.out.println("The greatest number is: " + greatest);
    }
}

