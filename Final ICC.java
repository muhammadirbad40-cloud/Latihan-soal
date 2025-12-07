package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        if (m > n) {
            System.out.println(0);
            return;
        }

        int base = n / m;
        int sisa = n % m;

        for (int i = 0; i < m; i++) {
            if (i < sisa) {
                System.out.print((base + 1) + " ");
            } else {
                System.out.print(base + " ");
            }

        }
        System.out.println("");
    }

}
