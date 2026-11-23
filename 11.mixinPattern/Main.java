public class Main {

    public static void main(String[] args) {

        EmailNotification email = new EmailNotification();
        email.sendEmail();

        SMSNotification sms = new SMSNotification();
        sms.sendSMS();
    }
}