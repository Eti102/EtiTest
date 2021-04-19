package com.company;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        System.out.println("Enter Matrix Number");
        System.out.print("N= ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enjoy your magic matrix...... ");

        for (int i = 1; i <=n-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " +j+ " ");
            }
            for (int j = i; j <= n-1; j++) {
                System.out.print(" " +i+ " ");
            }
            for (int j = i + 1; j <= n-1; j++) {
                System.out.print(" " +i+ " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(" " +j+ " ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            System.out.print(" " +i+ " ");
        }
        for (int i = n-1; i >=1 ; i--) {
            System.out.print(" " +i+ " ");
        }
        System.out.println();
        for (int i = n-1; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " +j+ " ");
            }
            for (int j = i; j <= n-1; j++) {
                System.out.print(" " +i+ " ");
            }
            for (int j = i + 1; j <= n-1; j++) {
                System.out.print(" " +i+ " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(" " +j+ " ");
            }
            System.out.println();
        }

    }
}
