package hr.atos.praksa.ivanhusnjak.zadatak10;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Zadatak10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> filesWithPhrase = new ArrayList<>();
            System.out.println("Unesi putanju direktorija za pretraživanje:");
            String putanja = scanner.nextLine();
            System.out.println("Unesi frazu za pretraživanje:");
            String fraza = scanner.nextLine();


            File dir = new File(putanja);
            
            if(!dir.exists()) {
                System.out.println("Nije direktorij!!! Pokreni ponovno program");
                System.exit(0);
            } 

            File[] files = dir.listFiles();
            for(File file : files) {
                if (file.isFile() && file.getName().contains(".csv") || file.getName().contains(".txt")) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        if(reader.readLine().contains(fraza)) {
                            filesWithPhrase.add(file.getName());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            
            System.out.println("U ovim fajlovima je pronaðena fraza:" + filesWithPhrase.toString());
        }


    }
}
