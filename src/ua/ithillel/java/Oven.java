package ua.ithillel.java;

public class Oven extends Multicooker {

    private String oven = super.name + " " + super.serial;

    public Oven(String name, String serial) {
        super(name, serial);
    }

    void initTimer(int time) {
        System.out.println(" Поставьте таймер " + time + " для печи " + oven);

    }

    void cook() {
        System.out.println(oven + " Готовит еду ");
    }
}