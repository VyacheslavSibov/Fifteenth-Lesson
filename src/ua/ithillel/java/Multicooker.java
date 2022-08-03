package ua.ithillel.java;

public abstract class Multicooker extends AbstractDevice {

    private String cooker = super.name + " " + super.serial;

    public Multicooker(String name, String serial) {
        super(name, serial);
    }

    void powerOn() {
        String cooker = super.name + " " + super.serial;
        System.out.println(" Включите в розетку" + cooker );
        System.out.println(" Нажмите кнопку " + "\"ON\"" );
        System.out.println(cooker + " Включен");
    }

    void powerOff() {
        System.out.println(cooker + " Нажмите кнопку" + "\"OFF\"" +
                 " На " + cooker);
        System.out.println(cooker + " Выключена ");

    }

    abstract void cook();
}
