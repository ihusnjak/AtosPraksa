package hr.atos.praksa.ivanhusnjak.zadatak04;
import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] anArray = new int[5];
            boolean flag;
            String s;
            for (int i = 0; i < anArray.length; i++) {
                do {
                    System.out.println("Unesi " + (i + 1) + ". broj:" );
                    s = scanner.next();
                    try {
                        anArray[i] = Integer.parseInt(s);
                        flag = false;
                    }
                    catch(NumberFormatException e) {
                        System.out.println("Unesi cjelobrojnu vrijednost!");
                        flag = true;
                    }
                } while(flag);
            }
            for(int i = 0; i < anArray.length; i++) {
                if(anArray[i] % 2 == 0) {
                    System.out.println(anArray[i] + " je paran broj");
                } else  {
                    System.out.println(anArray[i] + " je neparan broj");
                }
                if(anArray[i] % 3 == 0) {
                    System.out.println(anArray[i] + " je višekratnik od 3");
                }
                if(anArray[i] % 5 == 0) {
                    System.out.println(anArray[i] + " je višekratnik od 5");
                }
                if(anArray[i] % 11 == 0) {
                    System.out.println(anArray[i] + " je višekratnik od 11");
                }
            }
        }
    }
}
