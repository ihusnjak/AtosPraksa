package hr.atos.praksa.ivanhusnjak.zadatak13;

public class Zadatak13 implements Vehicle {
    public static void main(String[] args) {
        Zadatak13 bike = new Zadatak13();
        bike.increaseSpeed();
        bike.decreaseSpeed();
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Increasing speed ...");

    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Decreasing speed ...");

    }
}

