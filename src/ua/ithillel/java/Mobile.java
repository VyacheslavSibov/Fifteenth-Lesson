package ua.ithillel.java;

public class Mobile extends Phone {

    private int simCount;
    protected boolean isDisplayOn;
    protected String phone = super.name + " " + super.serial;

    public Mobile(String name, String serial, int simCount) {
        super(name, serial);
        this.simCount = simCount;
    }

    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }

    public boolean isDisplayOn() {
        return isDisplayOn;
    }

    public void setDisplayOn(boolean displayOn) {
        isDisplayOn = displayOn;
    }

    void powerOn() {
        String phone = super.name + " " + super.serial;
        System.out.println(" Включите телефон " + phone + " Зажав кнопку ON");
        System.out.println(phone + " Телефон включен ");
        this.isDisplayOn = true;
    }

    void powerOff() {
        System.out.println(" Выключите телефон " + phone + " Зажав кнопку OFF");
        System.out.println(phone + " Телефон отключен ");
        this.isDisplayOn = false;
    }

    void call() {
        if (!this.isDisplayOn) {
            System.out.println(" Абонент вне зоны " + phone + " перезвоните позже ");
            this.powerOn();
        }
        System.out.println(" Возьмите " + phone + " Зайдите в контакты " +
                " Выберите контакт и позвоните " );
        if (this.simCount > 1) {
            System.out.println(" Выберите карту для звонка ");
        }
    }
}
