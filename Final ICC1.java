package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int peserta = in.nextInt();
        int titik = in.nextInt();

        int[] staminaPeserta = new int[peserta];
        for (int i = 0; i < peserta; i++) {
            staminaPeserta[i] = in.nextInt();
        }

        int[] tinggiTitik = new int[titik];
        for (int i = 0; i < titik; i++) {
            tinggiTitik[i] = in.nextInt();
        }

        int n = 0;
        int staminaAkhir = 0;

        for (int i = 0; i < titik; i++) {
            if (i == 0 || tinggiTitik[i] != tinggiTitik[i - 1]) {
                staminaAkhir += Math.abs(tinggiTitik[i] - (i == 0 ? 0 : tinggiTitik[i - 1]));
            } else {
                n++;
            }
        }

        int stamina = staminaPeserta[0];

        if (staminaAkhir > stamina) {
            System.out.println("ALL");
        } else if (staminaAkhir <= stamina && stamina > 0) {
            System.out.println(n);
        } else {
            System.out.println(-1);
        }
    }

}
