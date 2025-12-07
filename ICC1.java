package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int jumlah = in.nextInt();
        String kata = in.next();
        int kelompok = 1;
        for (int i = 1; i < jumlah; i++) {
            if (kata.charAt(i) != kata.charAt(i - 1)) {
                kelompok++;
            }
        }
        System.out.println(kelompok);
    }

}
