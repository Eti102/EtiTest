package com.company;

import java.util.Scanner;

public class C7 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);

        C7E1(scanner);
        C7E2(scanner);
        C7E3(scanner);
        C7E4(scanner);
        C7E5(scanner);

        scanner.close();
        System.out.println("\nBye Bye");
    }

    public static void C7E1(Scanner scanner) {
        System.out.println("\n***** Start C7E1 *****");
        System.out.println("Enter 3 Numbers");
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.print("c=");
        int c = scanner.nextInt();

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a;
        if (b > min && b < max)
            mid = b;
        if (c > min && c < max)
            mid = c;

        System.out.println(String.format("The Increasing order of Numbers is %d,%d,%d", min, mid, max));
        System.out.println("***** End C7E1 *****");
    }

    public static void C7E2(Scanner scanner) {
        System.out.println("\n***** Start C7E2 *****");
        System.out.println("Enter your grade");
        System.out.print("grade=");
        int a = scanner.nextInt();
        String eval;
        if (a < 55)
            eval = "Not Enough";
        else if (a <= 64)
            eval = "Enough";
        else if (a <= 74)
            eval = "Almost Good";
        else if (a <= 84)
            eval = "Good";
        else if (a <= 94)
            eval = "Very Good";
        else
            eval = "Excellent";
        System.out.println(String.format("Your evalution grade is %s", eval));

        System.out.println("***** End C7E2 *****");
    }

    public static void C7E3(Scanner scanner) {
        System.out.println("\n***** Start C7E3 *****");
        System.out.println("Enter the coefficients of the equations");
        System.out.print("A=");
        int a = scanner.nextInt();
        System.out.print("B=");
        int b = scanner.nextInt();
        System.out.print("C=");
        int c = scanner.nextInt();
        System.out.print("D=");
        int d = scanner.nextInt();
        System.out.print("E=");
        int e = scanner.nextInt();
        System.out.print("F=");
        int f = scanner.nextInt();

        int den,numX,numY;
        den = (a*e) - (b*d);
        if (den ==0)
            System.out.println("Equation has no solution");
        else
        {
            numX = (c*e)-(b*f);
            numY = (a*f)-(c*d);
            System.out.println(String.format("X = %.2f , Y = %.2f",(numX*1.0)/den,(numY*1.0)/den));
        }
        System.out.println("***** End C7E3 *****");
    }

    public static void C7E4(Scanner scanner) {
        System.out.println("\n***** Start C7E4 *****");
        System.out.println("Enter Year");
        System.out.print("Year=");
        int year = scanner.nextInt();

        if (isLeapYear(year))
            System.out.println("This is Leap year");
        else
            System.out.println("This is regular year");

        System.out.println("***** End C7E4 *****");
    }

    public static void C7E5(Scanner scanner) {
        System.out.println("\n***** Start C7E5 *****");
        System.out.println("Enter Year & Month");
        System.out.print("Year=");
        int year = scanner.nextInt();
        System.out.print("Month=");
        int month = scanner.nextInt();

        int days = 31;
        switch(month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                if (isLeapYear(year))
                    days = 29;
                break;
        }

        System.out.println(String.format("Year %d is %s, Month %d has %d days.",year, isLeapYear(year)?"Leap":"Regular",month, days));
        System.out.println("***** End C7E5 *****");
    }

    public static boolean isLeapYear(Integer year){
        return (year % 4 == 0 && year % 100 > 0) || year % 400 == 0;
    }

}
