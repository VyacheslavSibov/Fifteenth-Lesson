package ua.ithillel.java;

public class Cooker extends Multicooker {

    private String cooker = super.name + " " + super.serial;

    public Cooker(String name, String serial) {
        super(name, serial);
    }

    void switchProgram(int number) {
        System.out.println(" Программа переключается на программу: " + number + " для " + cooker);
    }

    void cook() {
        System.out.println(cooker + " Готовит еду ");
    }
}
