package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
