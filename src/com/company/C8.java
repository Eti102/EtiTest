package com.company;

import java.util.Scanner;

public class C8 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);

        C8E1(scanner);
        C8E2(scanner);
        C8E3(scanner);
        C8E4(scanner);
        C8E5(scanner);
        C8E6(scanner);
        C8E7(scanner);
        C8E8(scanner);
        C8E9(scanner);
        C8E10(scanner);
        C8E11(scanner);
        C8E12(scanner);
        C8E13(scanner);
        C8E14(scanner);
        C8E15(scanner);
        C8E16(scanner);
        C8E17(scanner);
        C8E18(scanner);
        C8E19(scanner);
        C8E21(scanner);
        C8E22(scanner);
        C8E23(scanner);
        C8E24(scanner);
        C8E25(scanner);
        scanner.close();
        System.out.println("\nBye Bye");
    }

    public static void C8E1(Scanner scanner) {
        System.out.println("\n***** Start C8E1 *****");
        System.out.println("Enter Top Number");
        System.out.print("Top=");
        int top = scanner.nextInt();
        int index = 1;
        while (index <= top) {
            System.out.print(String.format("%4d", index));
            index++;
        }
        System.out.println();
        System.out.println("***** End C8E1 *****");
    }

    public static void C8E2(Scanner scanner) {
        System.out.println("\n***** Start C8E2 *****");
        System.out.println("Enter 2 Numbers");
        System.out.print("A=");
        int a = scanner.nextInt();
        System.out.print("B=");
        int b = scanner.nextInt();

        int index = Math.min(a, b);
        while (index <= Math.max(a, b)) {
            System.out.print(String.format("%4d", index));
            index++;
        }
        System.out.println();
        System.out.println("***** End C8E2 *****");
    }

    public static void C8E3(Scanner scanner) {
        System.out.println("\n***** Start C8E3 *****");
        System.out.println("Enter Number");
        System.out.print("A=");
        int a = scanner.nextInt();

        int index = 0;
        while (index <= a) {
            if (index % 2 == 0)
                System.out.print(String.format("%4d", index));
            index++;
        }
        System.out.println();
        System.out.println("***** End C8E3 *****");
    }

    public static void C8E4(Scanner scanner) {
        System.out.println("\n***** Start C8E4 *****");
        System.out.println("Enter 2 Numbers");
        System.out.print("Max=");
        int max = scanner.nextInt();
        System.out.print("Den=");
        int den = scanner.nextInt();

        int index = 0;
        while (index <= max) {
            System.out.print(String.format("%4d", index));
            index += den;
        }
        System.out.println();
        System.out.println("***** End C8E4 *****");
    }

    public static void C8E5(Scanner scanner) {
        System.out.println("\n***** Start C8E5 *****");
        System.out.println("Enter Numbers");
        System.out.print("Num=");
        int num = scanner.nextInt();
        int sum = 0;

        while (num != -99) {
            sum += num;
            System.out.print("Num=");
            num = scanner.nextInt();
        }
        System.out.println();
        System.out.println(String.format("The sum of numbers is %d", sum));
        System.out.println("***** End C8E5 *****");
    }

    public static void C8E6(Scanner scanner) {
        System.out.println("\n***** Start C8E6 *****");
        System.out.println("Enter Numbers");
        System.out.print("Num=");
        int num = scanner.nextInt();
        int sum = 0, count = 0;

        while (num != 0) {
            sum += num;
            count++;
            System.out.print("Num=");
            num = scanner.nextInt();
        }
        System.out.println();
        if (count == 0)
            System.out.println("There are not valid numbers");
        else
            System.out.println(String.format("The average of numbers is %.2f", (float) sum / count));
        System.out.println("***** End C8E6 *****");
    }

    public static void C8E7(Scanner scanner) {
        System.out.println("\n***** Start C8E7 *****");
        System.out.println("Enter Numbers");
        System.out.print("Num=");
        int num = scanner.nextInt();
        int max = num;

        while (num > 0) {
            System.out.print("Num=");
            num = scanner.nextInt();
            max = Math.max(max, num);
        }
        System.out.println();
        System.out.println(String.format("The maximum number is %d", max));
        System.out.println("***** End C8E7 *****");
    }

    public static void C8E8(Scanner scanner) {
        System.out.println("\n***** Start C8E8 *****");
        System.out.println("Enter Numbers");
        System.out.print("Num=");
        int num = scanner.nextInt();
        int min = num;

        while (num > 0) {
            System.out.print("Num=");
            num = scanner.nextInt();
            min = Math.min(min, num);
        }
        System.out.println();
        System.out.println(String.format("The minimum number is %d", min));
        System.out.println("***** End C8E8 *****");
    }

    public static void C8E9(Scanner scanner) {
        System.out.println("\n***** Start C8E9 *****");
        System.out.println("Enter 100 Numbers");
        System.out.print("Num1 = ");
        int num = scanner.nextInt();
        int max = num;
        int index = 1;
        int pos = 1;
        while (index <= 99) {
            index++;
            System.out.print("Num" + index + " = ");
            num = scanner.nextInt();
            if (num > max) {
                pos = index;
                max = num;
            }
        }
        System.out.println();
        System.out.println(String.format("The Index of max number is %d", pos));
        System.out.println("***** End C8E9 *****");
    }

    public static void C8E10(Scanner scanner) {
        System.out.println("\n***** Start C8E10 *****");
        System.out.println("Enter Number");
        System.out.print("Num= ");
        int num = scanner.nextInt();

        while (num > 9) {
            num /= 10;
        }
        System.out.println();
        System.out.println(String.format("The left digit is %d", num));
        System.out.println("***** End C8E10 *****");
    }

    public static void C8E11(Scanner scanner) {
        System.out.println("\n***** Start C8E11 *****");
        System.out.println("Enter Number");
        System.out.print("Num= ");
        int num = scanner.nextInt();
        System.out.println();
        System.out.println(String.format("The number has %d digit(s)", calDigitsInNumber(num)));
        System.out.println("***** End C8E11 *****");
    }

    public static void C8E12(Scanner scanner) {
        System.out.println("\n***** Start C8E12 *****");
        System.out.println("Enter Number");
        System.out.print("Num= ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 9) {
            sum += num % 10;
            num /= 10;
        }
        sum += num;
        System.out.println();
        System.out.println(String.format("The sum of digit(s) is ", sum));
        System.out.println("***** End C8E12 *****");
    }

    public static void C8E13(Scanner scanner) {
        System.out.println("\n***** Start C8E13 *****");
        System.out.println("Enter Number & digit");
        System.out.print("Num= ");
        int num = scanner.nextInt();
        System.out.print("Digit= ");
        int digit = scanner.nextInt();
        int count = 0;
        if (num == digit)
            System.out.println("The digit appears 1 time in number");

        while (num > 9) {
            if (num % 10 == digit)
                count++;
            num /= 10;
        }
        System.out.println();
        System.out.println(String.format("The digit appears %d time(s) in the number ", count));
        System.out.println("***** End C8E13 *****");
    }

    public static void C8E14(Scanner scanner) {
        System.out.println("\n***** Start C8E14 *****");
        System.out.println("Enter Number ");
        System.out.print("Num= ");
        int num = scanner.nextInt();
        System.out.println();
        System.out.println(String.format("The reversed number is ", getReversedNum(num)));
        System.out.println("***** End C8E14 *****");
    }

    public static void C8E15(Scanner scanner) {
        System.out.println("\n***** Start C8E15 *****");
        System.out.println("Enter Number ");
        System.out.print("Num= ");
        int num = scanner.nextInt();
        System.out.println();
        System.out.println(String.format("This number %s ", num == getReversedNum(num) ? "is Palindrome" : "is NOT Palindrome"));
        System.out.println("***** End C8E15 *****");
    }

    public static void C8E16(Scanner scanner) {
        System.out.println("\n***** Start C8E16 *****");
        System.out.println("Enter 2 Numbers ");
        System.out.print("a= ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();
        int sum = 0;
        while (b > 0) {
            sum += a;
            b--;
        }
        System.out.println();
        System.out.println(String.format("a*b= %d ", sum));
        System.out.println("***** End C8E16 *****");
    }

    public static void C8E17(Scanner scanner) {
        System.out.println("\n***** Start C8E17 *****");
        System.out.println("Enter 2 Numbers ");
        System.out.print("a= ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();
        if (b == 0) {
            System.out.println("The Pow of a by b is 1");
            System.out.println("***** End C8E17 *****");
            return;
        }
        int sum = a;
        b--;
        while (b > 0) {
            sum *= a;
            b--;
        }
        System.out.println();
        System.out.println(String.format("The Pow of a by b is %d ", sum));
        System.out.println("***** End C8E17 *****");
    }

    public static void C8E18(Scanner scanner) {
        System.out.println("\n***** Start C8E18 *****");
        System.out.println("Enter 2 Numbers ");
        System.out.print("a= ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int div = 0;

        while (max >= min) {
            max -= min;
            div++;
        }
        System.out.println();
        System.out.println(String.format("a/b = %d, a%b = %d ", div, max));
        System.out.println("***** End C8E18 *****");
    }

    public static void C8E19(Scanner scanner) {
        System.out.println("\n***** Start C8E19 *****");
        System.out.println("Enter Number ");
        System.out.print("A= ");
        int a = scanner.nextInt();
        int sum = 1;

        while (a > 1) {
            sum *= a;
            a--;
        }
        System.out.println();
        System.out.println(String.format("A! is %d ", sum));
        System.out.println("***** End C8E19 *****");
    }

    public static void C8E21(Scanner scanner) {
        System.out.println("\n***** Start C8E21 *****");
        System.out.println("Enter index ");
        System.out.print("index= ");
        int index = scanner.nextInt();
        int a = 1, b = 1, pos = index;

        while (pos > 2) {
            a += b;
            b = a - b;
            pos--;
        }
        System.out.println();
        System.out.println(String.format("The value of index %d is %d ", index, a));
        System.out.println("***** End C8E21 *****");
    }

    public static void C8E22(Scanner scanner) {
        System.out.println("\n***** Start C8E22 *****");
        System.out.println("Enter value");
        System.out.print("value= ");
        int value = scanner.nextInt();
        int a = 1, b = 1;

        while (a <= value) {
            a += b;
            b = a - b;
        }
        System.out.println();
        System.out.println(String.format("The Fibonacci number greater than %d is %d ", value, a));
        System.out.println("***** End C8E22 *****");
    }

    public static void C8E23(Scanner scanner) {
        System.out.println("\n***** Start C8E23 *****");
        System.out.println("Enter Number");
        System.out.print("num= ");
        int num = scanner.nextInt();
        int div = 1;

        System.out.print("The dividers of num are : ");
        while (div <= Math.sqrt(num)) {
            if (num % div == 0) {
                System.out.print(" " + num / div + " ");
                System.out.print(" " + div + " ");
            }
            div++;
        }
        System.out.println();
        System.out.println("***** End C8E23 *****");
    }

    public static void C8E24(Scanner scanner) {
        System.out.println("\n***** Start C8E24 *****");
        System.out.println("Enter 2 Numbers");
        System.out.print("A= ");
        int a = scanner.nextInt();
        System.out.print("B= ");
        int b = scanner.nextInt();

        if (Math.max(a, b) % Math.min(a, b) == 0) {
            System.out.println("The Maximum divider of A & B is " + Math.min(a, b));
            System.out.println("***** End C8E24 *****");
            return;
        }
        int div = Math.min(a, b);
        while (div > 0) {
            if (a % div == 0 && b % div == 0) {
                break;
            }
            div--;
        }
        System.out.println();
        System.out.println("The Maximum divider of A & B is " + div);
        System.out.println("***** End C8E24 *****");
    }

    public static void C8E25(Scanner scanner) {
        System.out.println("\n***** Start C8E25 *****");
        System.out.println("Enter 2 Numbers");
        System.out.print("A= ");
        int a = scanner.nextInt();
        System.out.print("B= ");
        int b = scanner.nextInt();

        int div = 1;
        if (a > b) {
            div = -1;
        }
        while (a!=b) {
            System.out.print(" " + a + " ");
           a+=div;
        }
        System.out.print(a);
        System.out.println("***** End C8E25 *****");
    }


    public static int calDigitsInNumber(Integer num) {
        int count = 1;
        while (num > 9) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int getReversedNum(Integer num) {
        int digits = calDigitsInNumber(num);
        int newNum = 0;
        digits--;
        while (num > 9) {
            newNum += (num % 10) * Math.pow(10, digits);
            num /= 10;
            digits--;
        }
        return newNum + num;
    }
}
