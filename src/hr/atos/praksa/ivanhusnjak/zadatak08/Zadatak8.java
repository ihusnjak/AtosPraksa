package hr.atos.praksa.ivanhusnjak.zadatak08;
import java.util.Scanner;

public class Zadatak8 {
	public static void main(String... args) {
        int brojMj = 0;
        try (Scanner scanner = new Scanner(System.in)) {
			boolean flag;
			do {
			    System.out.println("Unesi koji mjesec želiš ispisati u prijestupnoj godini (od 1 do 12)");
			    String unos = scanner.next();
			    try {
			        brojMj = Integer.parseInt(unos);
			        if (brojMj > 0 && brojMj < 13) {
			            flag = false;
			        } else {
			            flag = true;
			        }
			    } catch (NumberFormatException e) {
			        System.out.println("Mora biti broj od 1 do 12");
			        flag = true;
			    }
			} while (flag);
		}
        if (brojMj == 2) {
            System.out.printf("  P  U  S  È  P  S  N \n  1  2  3  4  5  6  7 \n  8  9 10 11 12 13 14 \n 15 16 17 18 19 20 21 \n 22 23 24 25 26 27 28 \n 29");
        } else if (brojMj ==1 || brojMj == 3 || brojMj == 5 || brojMj == 7 || brojMj == 8 || brojMj == 10 || brojMj == 12) {
            System.out.printf("  P  U  S  È  P  S  N \n  1  2  3  4  5  6  7 \n  8  9 10 11 12 13 14 \n 15 16 17 18 19 20 21 \n 22 23 24 25 26 27 28 \n 29 30 31");
        } else {
            System.out.printf("  P  U  S  È  P  S  N \n  1  2  3  4  5  6  7 \n  8  9 10 11 12 13 14 \n 15 16 17 18 19 20 21 \n 22 23 24 25 26 27 28 \n 29 30");  
        }

    }
}
