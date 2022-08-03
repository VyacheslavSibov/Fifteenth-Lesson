package ua.ithillel.java;

public class Main {
    public static void main(String[] args) {
        Mobile myPhone = new Mobile(" Phone ", " serial ", 2 );
        Mobile myAnotherDevice = new Mobile(" Device ", " serial ", 1);
        myAnotherDevice.powerOff();
        myPhone.call();
        myAnotherDevice.call();

        DialPhone secondPhone = new DialPhone(" SecondPhone ", " serial ", true);
        DialPhone anotherHomePhone = new DialPhone(" HomePhone ", " serialt ", false);
        secondPhone.call();
        secondPhone.autoAnswer();
        anotherHomePhone.autoAnswer();

        SmartPhone myPhone1 = new SmartPhone(" Iphone ",  " 6 ", 1, " ios ");
        myPhone1.powerOff();
        myPhone1.runApp();
        myPhone1.call();
        String myStr = "Hello!";
        String createdEmail = myPhone1.createMail(myStr);
        String editedEmail = myPhone1.editEmail(" text ");
        myPhone1.sendMail(createdEmail);
        myPhone1.sendMail(editedEmail);

        Cooker myCooker = new Cooker(" PERFELLI ", " RIO ");
        myCooker.switchProgram(3);
        myCooker.cook();
        myCooker.powerOff();

        Oven myOven = new Oven(" Ventolux ", " SPLIT ");
        myOven.initTimer(50);
        myOven.cook();
        myOven.powerOff();

        Post myPost = new Post();
        String myLetter = myPost.createMail(" Тест ");
        myPost.sendMail(myLetter);

        turnOffDevice(myPhone, myAnotherDevice, secondPhone, anotherHomePhone, myPhone1, myCooker, myOven);

        sendAllEmails(myPost, myPhone1);

    }

    private static void turnOffDevice(AbstractDevice... myDevices) {
        for (int i = 0; i < myDevices.length; i++) {
            myDevices[i].powerOff();
        }
    }

    private static void sendAllEmails(MailSender... myDevices) {
        for (int i = 0; i < myDevices.length; i++) {
            myDevices[i].sendMail(" Тестовое письмо ");
        }
    }
}