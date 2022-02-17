package hr.atos.praksa.ivanhusnjak.zadatak05;
import java.util.Scanner;

public class Zadatak5 {
	public static void main(String[] args) {
        int start = 0;
        int stop = 0;
        int counter = 0;
        String s;
        boolean flag = false;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("Unesi poèetak intervala: (manji od 10)");
                s = scanner.next();
                try {
                    start = Integer.parseInt(s);
                    if (start < 10) {
                        flag = false;
                    } else {
                        flag = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Poèetak intervala mora biti manji od 10");
                    flag = true;
                }
            } while (flag);
            do {
                System.out.println("Unesi kraj intervala: (veæi od 100)");
                s = scanner.next();
                try {
                    stop = Integer.parseInt(s);
                    if (stop > 100) {
                        flag = false;
                    } else {
                        flag = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Kraj intervala mora biti veæi od 100");
                    flag = true;
                }
            } while (flag);
        }
        for (int i = start; i < stop; i++) {
            if (i <= 18) {
                counter += 4;
            } 
            if (i > 18) {
                counter -= 1;
            } 
            if (i % 20 == 0) {
                continue;
            }
            if (i >= 75) {
                System.out.println("Vrijednost brojaèa je: " + counter);
                break;
            }

        }
    }
}
