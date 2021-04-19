package com.company;

import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);

        C10E1(scanner);
        C10E2(scanner);
        C10E3(scanner);
        C10E4(scanner);
        C10E5(scanner);

        scanner.close();
        System.out.println("\nBye Bye");
    }

    public static void C10E1(Scanner scanner) {
        System.out.println("\n***** Start C10E1 *****");
        System.out.println("Enter 100 Numbers");
        System.out.print("N1= ");
        int a = scanner.nextInt();
        int b = a;
        Boolean isInc = true;

        for (int i = 2; i <= 100; i++) {
            System.out.print("N" + i + "= ");
            a = scanner.nextInt();
            if (a >= b) {
                b = a;
            } else {
                isInc = false;
                break;
            }
        }

        if (isInc)
            System.out.println("The Numbers are sorted ascending");
        else
            System.out.println("The Numbers are NOT sorted ascending");

        System.out.println("***** End C10E1 *****");
    }

    public static void C10E2(Scanner scanner) {
        System.out.println("\n***** Start C10E2 *****");
        System.out.println("Enter 1000 Numbers");
        System.out.print("N1= ");
        int a = scanner.nextInt();
        int sum = a;
        Boolean isFound = false;

        for (int i = 2; i <= 1000; i++) {
            System.out.print("N" + i + "= ");
            a = scanner.nextInt();
            if (sum == a) {
                isFound = true;
                break;
            } else {
                sum += a;
            }
        }

        if (isFound)
            System.out.println(String.format("The sum is found %d,a"));
        else
            System.out.println("The sum is NOT found");

        System.out.println("***** End C10E2 *****");
    }

    public static void C10E3(Scanner scanner) {
        System.out.println("\n***** Start C10E3 *****");
        System.out.println("Enter 365 Temperature cards ");
        int a;
        Boolean isOK = true;

        for (int i = 1; i <= 365; i++) {
            System.out.print("N" + i + "= ");
            a = scanner.nextInt();
            if (a < -5 || a > 40) {
                isOK = false;
                break;
            }
        }

        if (isOK)
            System.out.println("The Temperature are valid");
        else
            System.out.println("The Temperature are NOT valid");

        System.out.println("***** End C10E3 *****");
    }

    public static void C10E4(Scanner scanner) {
        System.out.println("\n***** Start C10E4 *****");
        System.out.println("Enter Votes ");
        int a, i;
        int c1 = 0, c2 = 0, c3 = 0;
        Boolean isVeto = false;

        for (i = 1; i <= 170; i++) {
            System.out.print("V" + i + "= ");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    c1++;
                case 2:
                    c2++;
                case 3:
                    c3++;
                case 4: {
                    isVeto = true;
                    break;
                }
            }
        }

        if (isVeto)
            System.out.println(String.format("The Veto was vote by city at index %d", i));
        else
            System.out.println(String.format("Vote counters : Pos = %d, Neg =%d, Avoid = %d", c1, c2, c3));

        System.out.println("***** End C10E4 *****");
    }

    public static void C10E5(Scanner scanner) {
        System.out.println("\n***** Start C10E5 *****");
        System.out.println("Enter 1000 Numbers ");
        int a;
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for (int i = 1; i <= 1000; i++) {
            System.out.print("N" + i + "= ");
            a = scanner.nextInt();
            if (a < 1000) {
                sum1 += a;
                continue;
            }
            if (a >= 1000 && a < 2000) {
                sum2 += a;
                continue;
            }

            sum3 += a;
        }

        System.out.println(String.format("total sum : SUM1 = %d, SUM2 =%d, SUM3 = %d", sum1, sum2, sum3));

        System.out.println("***** End C10E5 *****");
    }


}
