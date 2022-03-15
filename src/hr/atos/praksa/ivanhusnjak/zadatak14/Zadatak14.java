package hr.atos.praksa.ivanhusnjak.zadatak14;

public class Zadatak14 {
    public static void main(String[] args) {
        double a = 1d;
        double b = 2d;
        double t1 = 1d;
        double t2 = 3d;
        int numRectangles = 150;

        Sinus sinus = new Sinus(a, b);
        Kosinus kosinus = new Kosinus(a, b);
        Tangens tangens = new Tangens(a, b);
        Kotangens kotangens = new Kotangens(a, b);

        IntegralCalculator iC = new IntegralCalculator(numRectangles, t1, t2);

        iC.calculateIntegral(sinus);
        iC.calculateIntegral(kosinus);
        iC.calculateIntegral(tangens);
        iC.calculateIntegral(kotangens);
    }
}

