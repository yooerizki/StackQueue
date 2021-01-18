package keg1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner msk = new Scanner(System.in);
        Keg1 keg = new Keg1();

        System.out.println("Masukkan Bilangan Desimal : ");
        int input = msk.nextInt();
        keg.setStack(input);
        keg.push(input);
        System.out.println("Hasil Conversi Ke Biner");
        System.out.println(keg.pop());

    }

}
