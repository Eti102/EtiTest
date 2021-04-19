package com.company;

import java.util.Scanner;

public class C5 {

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);

        C5E1(scanner);
        C5E2(scanner);
        C5E3(scanner);
        C5E4(scanner);
        C5E5(scanner);
        C5E6(scanner);

        scanner.close();
        System.out.println("\nBye Bye");
    }

    public static void C5E1(Scanner scanner){
        System.out.println("\n***** Start C5E1 *****");
        System.out.println("Enter 2 Numbers");
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.println(b>a ? "Growing":"");
        System.out.println("***** End C5E1 *****");
    }

    public static void C5E2(Scanner scanner){
        System.out.println("\n***** Start C5E2 *****");
        System.out.println("Enter 2 Numbers");
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.println(String.format("The big Number is %d",Math.max(a,b)));
        System.out.println("***** End C5E2 *****");
    }

    public static void C5E3(Scanner scanner){
        System.out.println("\n***** Start C5E3 *****");
        System.out.println("Enter Number");
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.println(String.format("This Number is %s",(a%2==0 ? "Even":"Odd")));
        System.out.println("***** End C5E3 *****");
    }

    public static void C5E4(Scanner scanner){
        System.out.println("\n***** Start C5E4 *****");
        System.out.println("Enter 2 Numbers");
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.println(String.format("Number A %s divide by B",(a%b==0 ? "is":"is not")));
        System.out.println(String.format("Number B %s divide by A",(b%a==0 ? "is":"is not")));
        System.out.println("***** End C5E4 *****");
    }

    public static void C5E5(Scanner scanner){
        System.out.println("\n***** Start C5E5 *****");
        System.out.println("Enter 2 Numbers");
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.println(String.format("The Minimum Number is %d",Math.min(a,b)));
        System.out.println(String.format("The Maximum Number is %d",Math.max(a,b)));
        System.out.println("***** End C5E5 *****");
    }

    public static void C5E6(Scanner scanner){
        System.out.println("\n***** Start C5E6 *****");
        System.out.println("Enter developer's Name & Salary");
        System.out.print("Name=");
        String name = scanner.next();
        System.out.print("Salary=");
        int s = scanner.nextInt();
        System.out.println(String.format("The new salary of %s is %.2f ",name,(s*1.1>6000?s*1.05:s*1.1)));
        System.out.println("***** End C5E6 *****");
    }
}
