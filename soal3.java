package com.mycompany.pbotugas3;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan nilai n (n >= 0): ");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("masukan tidak valid! n harus >= 0");
        } else if (n == 0) {
            System.out.println("0! = 1");
        } else {
            long hasil = 1;
            String tampilan = n + "! = ";
            
            int i = n;
            while (i >= 1) {
                hasil *= i;
                tampilan += i;
                if (i > 1) {
                    tampilan += "*";
                }
                i--;
            } 
            
            tampilan += "=" + hasil;
            System.out.println(tampilan);
        }
        
        input.close();
    }
}