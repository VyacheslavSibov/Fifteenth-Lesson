package ua.ithillel.java;

public abstract class Phone extends AbstractDevice {

    public Phone(String name, String serial) {
        super(name, serial);
    }

    abstract void call();
}
