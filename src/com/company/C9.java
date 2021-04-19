package com.company;

import java.util.Scanner;

public class C9 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);

        C9E2(scanner);
        C9E3(scanner);
        C9E4(scanner);
        C9E5(scanner);
        C9E6(scanner);
        C9E7(scanner);
        C9E8(scanner);
        C9E9(scanner);
        C9E10(scanner);
        C9E11(scanner);
        C9E12(scanner);
        C9E13(scanner);

        scanner.close();
        System.out.println("\nBye Bye");
    }

    public static void C9E2(Scanner scanner) {
        System.out.println("\n***** Start C9E2 *****");
        System.out.println("Enter 2 Numbers");
        System.out.print("A= ");
        int a = scanner.nextInt();
        System.out.print("B= ");
        int b = scanner.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(" " + i + " ");
            }
        } else if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.print(" " + i + " ");
            }
        } else {
            System.out.print(" " + a + " ");
        }

        System.out.println("***** End C9E2 *****");
    }

    public static void C9E3(Scanner scanner) {
        System.out.println("\n***** Start C9E3 *****");
        System.out.println("Enter N !");
        System.out.print("N= ");
        int n = scanner.nextInt();
        int sum = 1;

        for (int i = 2; i <= n; i++) {
            sum *= i;
        }
        System.out.println(String.format("The N ! = %d", sum));
        System.out.println("***** End C9E3 *****");
    }

    public static void C9E4(Scanner scanner) {
        System.out.println("\n***** Start C9E4 *****");
        System.out.println("Enter N ");
        System.out.print("N= ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 3; i <= n; i += 3) {
            sum += i;
        }
        System.out.println(String.format("The sum of dividers by 3 until N is  %d", sum));
        System.out.println("***** End C9E4 *****");
    }

    public static void C9E5(Scanner scanner) {
        System.out.println("\n***** Start C9E5 *****");
        System.out.println("Enter 99 Numbers ");
        int n;
        int sum = 0;

        for (int i = 1; i <= 99; i++) {
            System.out.print("N" + i + "= ");
            n = scanner.nextInt();
            if (i % 3 == 0) {
                sum += n;
            }
        }
        System.out.println(String.format("The sum of numbers in each 3rd position is  %d", sum));
        System.out.println("***** End C9E5 *****");
    }

    public static void C9E6(Scanner scanner) {
        System.out.println("\n***** Start C9E6 *****");
        System.out.println("Enter N ");
        System.out.print("N= ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += Math.pow(2, i);
        }
        System.out.println(String.format("The sum of numbers pow 2 by N is  %d", sum));
        System.out.println("***** End C9E6 *****");
    }

    public static void C9E7(Scanner scanner) {
        System.out.println("\n***** Start C9E7 *****");
        System.out.println("Enter N ");
        System.out.print("N= ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i * 2 + " ");
        }
        System.out.println();
        System.out.println("***** End C9E7 *****");
    }

    public static void C9E8(Scanner scanner) {
        System.out.println("\n***** Start C9E8 *****");
        System.out.println("Enter N ");
        System.out.print("N= ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 4; i <= n; i++) {

            if (i % 4 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(String.format("The sum of numbers divided by 4 or 7  is  %d", sum));
        System.out.println("***** End C9E8 *****");
    }

    public static void C9E9(Scanner scanner) {
        System.out.println("\n***** Start C9E9 *****");
        System.out.println("Enter X1,X2,INC ");
        System.out.print("X1= ");
        int x1 = scanner.nextInt();
        System.out.print("X2= ");
        int x2 = scanner.nextInt();
        System.out.print("INC= ");
        int n = scanner.nextInt();
        int y = 0;

        for (int i = x1; i <= x2; i+=n) {
            y = (int) Math.pow(i,2) +5;
            System.out.println(String.format("X1= %d, Y1= %d", i, y));
        }

        System.out.println("***** End C9E9 *****");
    }

    public static void C9E10(Scanner scanner) {
        System.out.println("\n***** Start C9E10 *****");
        int i;
        for (i = 15; i >= -10; i-=2) {
            System.out.print(" " +i+ " ");
        }

        System.out.print(i);

        System.out.println("***** End C9E10 *****");
    }

    public static void C9E11(Scanner scanner) {
        System.out.println("\n***** Start C9E11 *****");
        System.out.println("Enter 2 Numbers");
        System.out.print("A= ");
        int a = scanner.nextInt();
        System.out.print("B= ");
        int b = scanner.nextInt();

        for (int i = Math.min(a,b); i < Math.max(a,b); i++) {
                System.out.print(" " + i + " ");
            }
        for (int i = Math.max(a,b); i >= Math.min(a,b); i--) {
            System.out.print(" " + i + " ");
        }

        System.out.println("***** End C9E11 *****");
    }

    public static void C9E12(Scanner scanner) {
        System.out.println("\n***** Start C9E12 *****");
        System.out.println("Enter 100 Numbers ");
        int n;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print("N" + i + "= ");
            n = scanner.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(String.format("The sum of all even numbers is  %d", sum));
        System.out.println("***** End C9E12 *****");
    }

    public static void C9E13(Scanner scanner) {
        System.out.println("\n***** Start C9E13 *****");
        System.out.println("Enter 100 Numbers ");
        int n;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print("N" + i + "= ");
            n = scanner.nextInt();
            if (i % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(String.format("The sum of all numbers at even positions  is  %d", sum));
        System.out.println("***** End C9E13 *****");
    }

}
