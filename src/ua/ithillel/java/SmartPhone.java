package ua.ithillel.java;

public class SmartPhone extends Mobile implements Caller, EmailSender {

    private String os;

    public SmartPhone(String name, String serial, int simCount, String os) {
        super(name, serial, simCount);
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    void runApp() {
        if (!super.isDisplayOn) {
            System.out.println(" Вы не можете запустить приложение так как " + phone +
                    " выключен, включите телефон ");
            this.powerOn();
        }
        String phone = super.name + " " + super.serial;
        System.out.println(" Возьмите " + phone +
                " Выберите приложение " + " Приложение запущенно на системе" + this.os);
    }

    @Override
    public void call() {
        System.out.println("Возьмите " + phone + "Позвоните");
    }

    @Override
    public String editEmail(String string) {
        System.out.println(" Создайте письмо " + phone + " к : " + string);
        return string;
    }

    @Override
    public String createMail(String string) {
        System.out.println(" Напишите письмо " + phone + " : " + string);
        return string;
    }

    @Override
    public String sendMail(String string) {
        System.out.println(" Отправьте : \"" + string + "\" Получатель : " + phone);
        return string;
    }
}
