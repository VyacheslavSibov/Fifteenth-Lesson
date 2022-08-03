package ua.ithillel.java;

public class Post implements MailSender {

    @Override
    public String createMail(String string) {
        System.out.println(" Сообщение создано: " + string);
        return string;
    }

    @Override
    public String sendMail(String string) {
        System.out.println(" Почта \"" + string + "\" отправлена ");
        return string;
    }
}