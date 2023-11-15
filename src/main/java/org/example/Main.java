package org.example;
import java.util.Scanner;

    class Calculator {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double num1, num2;
            char operator;
            double result;

            while (true) {
                System.out.println("Enter a number:");
                while (!input.hasNextDouble()) {
                    System.out.println("Invalid number, re-enter:");
                    input.next();
                }
                num1 = input.nextDouble();

                System.out.println("Enter an operator (+, -, *, /): ");
                operator = input.next().charAt(0);
                while (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                    System.out.println("Invalid operator. Please enter (+, -, *, /): ");
                    operator = input.next().charAt(0);
                }
                    System.out.println("Enter a number:");
                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid number, re-enter:");
                        input.next();
                    }
                    num2 = input.nextDouble();


                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;

                        case '-':
                            result = num1 - num2;
                            break;

                        case '*':
                            result = num1 * num2;
                            break;

                        case '/':
                            result = num1 / num2;
                            break;

                        default:
                            System.out.println("Invalid operator");
                            return;
                    }

                    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

                    System.out.println("Do you want to continue? (y/n)");
                    char choice = input.next().charAt(0);

                    if (choice == 'n') {
                        break;
                    }
                }
            }
        }
