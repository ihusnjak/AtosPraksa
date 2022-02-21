package hr.atos.praksa.ivanhusnjak.zadatak12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zadatak12 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/hr/atos/praksa/ivanhusnjak/zadatak12/rijeci.txt");
        try (Scanner scanner = new Scanner(file)) {
            ArrayList<String> sveRijeci = new ArrayList<>();
            while (scanner.hasNext()) {
                sveRijeci.add(scanner.next());
            }
            Collections.sort(sveRijeci);
            List<String> razlicite = sveRijeci.stream().distinct().collect(Collectors.toList());
            System.out.println("U datoteci " + file.getName() + " nalaze se sljedece rijeci:");
            System.out.println("------------------------ \nRijec (broj ponavljanja) \n------------------------");
            for (String rijec : razlicite) {
                int counter = 0;
                for (String rijecIzSvih : sveRijeci) {
                    if (rijec.equals(rijecIzSvih)) {
                        counter++;
                    }
                }
                System.out.println(rijec + " (" + counter + ")");
            }
            System.out.println("------------------------");
        }
    }
}
