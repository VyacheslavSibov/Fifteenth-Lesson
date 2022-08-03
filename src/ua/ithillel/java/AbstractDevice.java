package ua.ithillel.java;

public abstract class AbstractDevice {
    protected String name;
    protected String serial;

    public AbstractDevice(String name, String serial) {
        this.name = name;
        this.serial = serial;
        this.powerOn();
    }

    abstract void powerOn();

    abstract void powerOff();
}