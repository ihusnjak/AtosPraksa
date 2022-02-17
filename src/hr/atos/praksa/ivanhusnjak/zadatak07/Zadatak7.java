package hr.atos.praksa.ivanhusnjak.zadatak07;
import java.util.Scanner;

public class Zadatak7 {
	public static void main(String[] args) {
        int start = 0;
        int stop = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            System.out.println("Unesi poèetak intervala (prirodni broj):");
            String unos = scanner.next();
            try {
                start = Integer.parseInt(unos);
                if (start > 0) {
                    flag = false;
                } else {
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Mora biti prirodni broj!");
                flag = true;
            }
        } while (flag);
        do {
            System.out.println("Unesi kraj intervala (prirodni broj):");
            String unos = scanner.next();
            try {
                stop = Integer.parseInt(unos);
                if (start > 0) {
                    flag = false;
                } else {
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Mora biti prirodni broj!");
                flag = true;
            }
        } while (flag);
        if (start > stop) {
            int helper = start;
            start = stop;
            stop = helper;
        }
        for (int i = start; i <= stop; i++) {
            if (i % 6 == 0) {
                counter++;
            }
        }
        if (counter == 1) {
            System.out.println("Izmeðu intervala " + start + " i " + stop + " ima " + counter + " broj djeljiv sa 6");
        } else if (counter < 5) {
            System.out.println("Izmeðu intervala " + start + " i " + stop + " ima " + counter + " broja djeljiva sa 6");
        } else {
            System.out.println("Izmeðu intervala " + start + " i " + stop + " ima " + counter + " brojeva djeljivih sa 6");
        }
    }
}
