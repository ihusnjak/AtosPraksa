package hr.atos.praksa.ivanhusnjak.zadatak11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Prva tri broja na odreðenom jeziku \nOdaberi jezik:\n 1.)En \n 2.)De \n 3.)Fr");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    Properties propEn = new Properties();
                    FileInputStream inEn = new FileInputStream("src/hr/atos/praksa/ivanhusnjak/zadatak11/en.properties");
                    propEn.load(inEn);
                    System.out.println(propEn.getProperty("jedan"));
                    System.out.println(propEn.getProperty("dva"));
                    System.out.println(propEn.getProperty("tri"));
                    System.out.println("Ovako pišemo prva tri broja na engleskom jeziku!");
                    inEn.close();
                    break;
                case 2:
                    Properties propDe = new Properties();
                    FileInputStream inDe = new FileInputStream("src/hr/atos/praksa/ivanhusnjak/zadatak11/de.properties");
                    propDe.load(inDe);
                    System.out.println(propDe.getProperty("jedan"));
                    System.out.println(propDe.getProperty("dva"));
                    System.out.println(propDe.getProperty("tri"));
                    System.out.println("Ovako pišemo prva tri broja na njemaèkom jeziku!");
                    inDe.close();
                    break;
                case 3:
                    Properties propFr = new Properties();
                    FileInputStream inFr = new FileInputStream("src/hr/atos/praksa/ivanhusnjak/zadatak11/fr.properties");
                    propFr.load(inFr);
                    System.out.println(propFr.getProperty("jedan"));
                    System.out.println(propFr.getProperty("dva"));
                    System.out.println(propFr.getProperty("tri"));
                    System.out.println("Ovako pišemo prva tri broja na francuskom jeziku!");
                    inFr.close();
                    break;

            }
        }
    }
}
