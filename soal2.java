package com.mycompany.pbotugas3;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan batas awal (angka): ");
        int batasAwal = input.nextInt();
        
        System.out.print("masukan batas akhir (angka): ");
        int batasAkhir = input.nextInt();
        
        int count = 0;
        System.out.print("bilangan ganjil antara " + batasAwal + " dan " + batasAkhir + ": ");
        
        int i = batasAwal;
        while (i <= batasAkhir) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        } 
        
        System.out.println();
        System.out.println("banyak bilangan ganjil: " + count);
        
        input.close();
    }
}