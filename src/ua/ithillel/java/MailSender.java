package ua.ithillel.java;

public interface MailSender {

    default String createMail(String string) {
        System.out.println(" По умолчанию: ");
        return " Вы создали почту: " + string;
    }

    default String sendMail(String string) {
        System.out.println(" По умолчанию:");
        return " Вы отправили сообщение: " + string;

    }
}
