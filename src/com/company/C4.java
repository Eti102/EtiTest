package com.company;

import java.util.Scanner;

public class C4 {

    public static void main(String[] args) {

        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);

        C4E1(scanner);
        C4E2(scanner);
        C4E3(scanner);
        C4E4(scanner);
        C4E5(scanner);
        C4E6(scanner);
        C4E7(scanner);
        C4E8(scanner);
        C4E9(scanner);
        C4E10(scanner);

        scanner.close();
        System.out.println("\nBye Bye");
    }
    public static void C4E1(Scanner scanner){
        System.out.println("\n***** Start C4E1 *****");
        System.out.println("Enter 3 Numbers");
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.print("c=");
        int c = scanner.nextInt();
        int sum = a+b+c;
        System.out.println(String.format("Sum is %d, Average is %.2f ", sum , sum*1.0/3));
        System.out.println("***** End C4E1 *****");
    }

    public static void C4E2(Scanner scanner){
        System.out.println("\n***** Start C4E2 *****");
        System.out.println("Enter Length and Width of rectangle");
        System.out.print("Length: ");
        int a = scanner.nextInt();
        System.out.print("Width: ");
        int b = scanner.nextInt();
        System.out.println(String.format("Area is %d, Perimeter is %d ", a*b , 2*(a+b)));
        System.out.println("***** End C4E2 *****");
    }

    public static void C4E3(Scanner scanner){
        System.out.println("\n***** Start C4E3 *****");
        System.out.println("Enter Depth & Diameter of a pot");
        System.out.print("Depth: ");
        int a = scanner.nextInt();
        System.out.print("Diameter: ");
        int b = scanner.nextInt();
        System.out.println(String.format("Pot's capacity is %.2f ", a*Math.pow((b/2),2)*Math.PI));
        System.out.println("***** End C4E3 *****");
    }

    public static void C4E4(Scanner scanner){
        System.out.println("\n***** Start C4E4 *****");
        System.out.println("Enter length of a movie");
        System.out.print("Length: ");
        int a = scanner.nextInt();
        System.out.println(String.format("The length of movie is %d hour(s) and %d minute(s)", a/60,a%60));
        System.out.println("***** End C4E4 *****");
    }

    public static void C4E5(Scanner scanner){
        System.out.println("\n***** Start C4E5 *****");
        System.out.println("Enter Number");
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.println(String.format("The right digit of %d is %d", a,a%10));
        System.out.println("***** End C4E5 *****");
    }

    public static void C4E6(Scanner scanner){
        System.out.println("\n***** Start C4E6 *****");
        System.out.println("Enter Number");
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.println(String.format("The 2nd right digit of %d is %d", a,(a%100)/10));
        System.out.println("***** End C4E6 *****");
    }

    public static void C4E7(Scanner scanner){
        System.out.println("\n***** Start C4E7 *****");
        System.out.println("Enter Number");
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.println(String.format("The Hundred digit of %d is %d", a,a/100));
        System.out.println("***** End C4E7 *****");
    }

    public static void C4E8(Scanner scanner){
        System.out.println("\n***** Start C4E8 *****");
        System.out.println("Enter Number");
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.println(String.format("The sum digit of %d is %d", a, (a/10)+(a%10)));
        System.out.println("***** End C4E8 *****");
    }

    public static void C4E9(Scanner scanner){
        System.out.println("\n***** Start C4E9 *****");
        System.out.println("Enter Number between 10 - 99");
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.println(String.format("The inverse number of %d is %d", a, (a/10)+(a%10)*10));
        System.out.println("***** End C4E9 *****");
    }

    public static void C4E10(Scanner scanner){
        System.out.println("\n***** Start C4E10 *****");
        System.out.println("Enter Number");
        System.out.print("a: ");
        float a = scanner.nextFloat();
        int b = (int) a;
        b+=2;
        b-=b%2;
        System.out.println(String.format("The bigger even number of %.2f is %d", a , b ));
        System.out.println("***** End C4E10 *****");
    }
}