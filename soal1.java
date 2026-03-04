package com.mycompany.pbotugas3;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nilai n (n >= 1): ");
        int n = input.nextInt();
        
        if (n >= 1) {
            System.out.println("bilangan dari 1 sampai " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                if (i < n) System.out.print(", ");
            }
            System.out.println();
        } else {
            System.out.println("input tidak valid!, n harus >= 1");
        }
        
        input.close();
    }
}
