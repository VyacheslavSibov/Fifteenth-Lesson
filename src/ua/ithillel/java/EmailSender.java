package ua.ithillel.java;

public interface EmailSender extends MailSender {

    default String editEmail(String string) {
        System.out.println(" По умолчанию : ");
        return " Электронная почта была изменена на : " + string;
    }
}