package com.company;

import java.util.Scanner;

public class C6 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);

        C6E1(scanner);
        C6E2(scanner);
        C6E3(scanner);
        C6E4(scanner);
        C6E5(scanner);

        scanner.close();
        System.out.println("\nBye Bye");
    }

    public static void C6E1(Scanner scanner) {
        System.out.println("\n***** Start C6E1 *****");
        System.out.println("Enter Number");
        System.out.print("a=");
        int a = scanner.nextInt();
        if (a == 0)
            System.out.println("This Number is equal Zero");
        else
            System.out.println(String.format("This Number is %s", a > 0 ? "Positive" : "Negative"));
        System.out.println("***** End C6E1 *****");
    }

    public static void C6E2(Scanner scanner) {
        System.out.println("\n***** Start C6E2 *****");
        System.out.println("Enter 3 Numbers");
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.print("c=");
        int c = scanner.nextInt();
        if (Math.max(a, b) == b && Math.max(b, c) == c)
            System.out.println("Increasing Numbers");

        System.out.println("***** End C6E2 *****");
    }

    public static void C6E3(Scanner scanner) {
        System.out.println("\n***** Start C6E3 *****");
        System.out.println("Enter 3 Numbers");
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.print("c=");
        int c = scanner.nextInt();
        System.out.println(String.format("The Maximum Number is %d", Math.max(a, Math.max(b, c))));

        System.out.println("***** End C6E3 *****");
    }

    public static void C6E4(Scanner scanner) {
        System.out.println("\n***** Start C6E4 *****");
        System.out.println("Enter Number between 1 - 9999");
        System.out.print("a=");
        int a = scanner.nextInt();
        if (a / 1000 > 0)
            System.out.println("This number has 4 digits");
        else if (a / 100 > 0)
            System.out.println("This number has 3 digits");
        else if (a / 10 > 0)
            System.out.println("This number has 2 digits");
        else
            System.out.println("This number has 1 digit");

        System.out.println("***** End C6E4 *****");
    }

    public static void C6E5(Scanner scanner) {
        System.out.println("\n***** Start C6E5 *****");
        System.out.println("Enter developer's Name & Salary");
        System.out.print("Name=");
        String name = scanner.next();
        System.out.print("Salary=");
        int s = scanner.nextInt();
        float tax = (float) (23_000 * 0.1);

        if (s > 23_000 && s <= 46_000)
            tax += (float) ((s - 23_000) * 0.2);
        else if (s > 46_000 && s <= 120_000)
            tax += (float) ((23_000) * 0.2 + (s - 46_000) * 0.3);
        else if (s > 120_000 && s <= 220_000)
            tax += (float) ((23_000) * 0.2 + (74_000) * 0.3 + (s - 120_000) * 0.4);
        else if (s > 220_000)
            tax += (float) ((23_000) * 0.2 + (74_000) * 0.3 + (100_000) * 0.4 + (s - 220_000) * 0.5);

        System.out.println(String.format("%s need to pay tax : %.2f", name, tax));
        System.out.println("***** End C6E5 *****");
    }
}
