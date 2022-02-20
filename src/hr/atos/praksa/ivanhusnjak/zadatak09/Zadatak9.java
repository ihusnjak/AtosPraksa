package hr.atos.praksa.ivanhusnjak.zadatak09;

import java.util.Scanner;
import java.util.ArrayList;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        ArrayList<Integer> racuni = new ArrayList<>();
        ArrayList<Integer> racuniAprox = new ArrayList<>();

        while (counter < 13) {
            System.out.println("Unesi raèun za " + counter + ".mj:");
            racuni.add(Integer.valueOf(scanner.nextLine()));
            counter++;
        }

        zaokruziRacun(racuni, racuniAprox);
        printGraf(racuniAprox);

    }

    public static ArrayList<Integer> zaokruziRacun(ArrayList<Integer> racuni, ArrayList<Integer> racuniAprox) {
        for (Integer racun : racuni) {
            if (racun >= 0 && racun < 501) {
                racuniAprox.add(0);
            } else if (racun > 500 && racun < 1501) {
                racuniAprox.add(1000);
            } else if (racun > 1500 && racun < 2501) {
                racuniAprox.add(2000);
            } else if (racun > 2500 && racun < 3501) {
                racuniAprox.add(3000);
            } else if (racun > 3500 && racun < 4001) {
                racuniAprox.add(4000);
            } else if (racun > 4000) {
                racuniAprox.add(4500);
            }
        }
        return racuniAprox;
    }

    public static void printGraf(ArrayList<Integer> racuniAprox) {
        int[] ordinate = { 5000, 4500, 4000, 3500, 3000, 2500, 2000, 1500, 1000, 500, 0 };
        for (int j = 0; j < ordinate.length; j++) {
            if (ordinate[j] % 500 == 0 && ordinate[j] % 1000 == 0)
                System.out.printf("%4s |", ordinate[j]);
            else
                System.out.printf("     |");
            for (int i = 0; i < 12; i++) {
                if (racuniAprox.get(i).intValue() == ordinate[j]) {
                    System.out.print(" x ");
                } else {
                    System.out.print("   ");
                }

            }

            System.out.println();
        }
        System.out.println("      -- -- -- -- -- -- -- -- -- -- -- --");
        System.out.println("       1  2  3  4  5  6  7  8  9 10 11 12");
    }
}
