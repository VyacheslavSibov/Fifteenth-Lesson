package ua.ithillel.java;

public class DialPhone extends Phone implements Caller {

    private boolean hasAnswerPhone;
    private String phone = super.name + " " + super.serial;

    public boolean isHasAnswerPhone() {
        return hasAnswerPhone;
    }

    public void setHasAnswerPhone(boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DialPhone(String name, String serialNumber, boolean hasAnswerPhone) {
        super(name, serialNumber);
        this.hasAnswerPhone = hasAnswerPhone;
    }

    public void powerOn() {
        String phone = super.name + " " + super.serial;
        System.out.println(" Включите " + phone + " Телефон работает ");
        System.out.println(phone + " Телефон работает ");
    }

    public void powerOff() {
        System.out.println(" Возьмите " + phone + " и выключите его ");
        System.out.println(phone + " Телефон выключен ");
    }

    @Override
    public void call() {
        System.out.println(" Возьмите " + phone + " Наберите номер ");
    }

    public void autoAnswer() {
        System.out.println(" Вам звонят " + phone );
        if (this.hasAnswerPhone) {
            System.out.println(phone + " Абонент не взял трубку оставьте голосовое сообщение после сигнала ");
        } else {
            System.out.println(" У вас пропущенный звонок " + phone);
        }
    }
}