package Seminar_06.Task1;

public class EmailMessage implements IMessage {

    @Override
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            // email
            // use java mail sender API
        }

    }
}

public class SMSMessage implements IMessage {
    @Override
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("SMS")) {
            // SMS
        }
    }
} 