package hr.atos.praksa.ivanhusnjak.zadatak14;

public class IntegralCalculator {
    int numRectangles;
    double t1;
    double t2;

    public IntegralCalculator(int numRectangles, double t1, double t2) {
        this.numRectangles = numRectangles;
        this.t1 = t1;
        this.t2 = t2;
    }

    public void calculateIntegral(TrigFunkcija trigFunkcija) {
        double rectangleWidth = 0d;
        double middle = 0d;
        double y = 0d;
        double ySum = 0d;
        double Surface = 0d;
        double x = 0d;
        double t = t2 - t1;
        rectangleWidth = t / numRectangles;
        middle = rectangleWidth / 2;

        for(int i = 0; i < numRectangles; i++) {
            x = t1 + middle + rectangleWidth * i;
            switch(trigFunkcija.name) {
                case "sinus":
                y = trigFunkcija.a * Math.sin(x) + trigFunkcija.b;
                break;
                case "kosinus":
                y = trigFunkcija.a * Math.cos(x) + trigFunkcija.b;
                break;
                case "tangens":
                y = trigFunkcija.a * Math.tan(x) + trigFunkcija.b;
                break;
                case "kotangens":
                y = trigFunkcija.a * Math.cos(x) / Math.sin(x) + trigFunkcija.b;
                break;
            }
            ySum += y;
        }
        Surface = ySum * rectangleWidth;
        System.out.println("Povrsina ispod krivulje opisane funkcijom y=f(x)=A*funk(x)+B s " + trigFunkcija.name + "om je: " + Surface);
    }
}
