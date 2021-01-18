package xample;

import java.util.Scanner;
//import java.io.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Program konversi ke biner dari desimal");
        Scanner msk = new Scanner(System.in);
        System.out.print("Masukan Nilai Desimal :");
        int bil = msk.nextInt();
        tumpukan bn = new tumpukan(10);
        int n = bil;
        while (bil > 0) {
            n = bil % 2;

            if (n > 0) {
                bn.push(1);
            } else
                bn.push(0);

            bil = bil / 2;

        }
        System.out.print("Hasil Konvert Desimal Ke Biner : ");
        while (!bn.isEmpty()) {
            long nilai = bn.pop();
            System.out.print(nilai);
            System.out.print(" ");

        }

        System.out.println(" ");

    }
}
