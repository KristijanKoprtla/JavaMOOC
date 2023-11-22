
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        // Create an instance of MessagingService
        MessagingService messagingService = new MessagingService();

        // Create some Message objects
        Message message1 = new Message("User1", "Hello, this is a short message.");
        Message message2 = new Message("User2", "This is a longer message that exceeds the 280-character limit."
                + "This is a longer message that exceeds the 280-character limit."
                + "This is a longer message that exceeds the 280-character limit."
                + "This is a longer message that exceeds the 280-character limit."
                + "This is a longer message that exceeds the 280-character limit."
                + "This is a longer message that exceeds the 280-character limit."
                + "This is a longer message that exceeds the 280-character limit.");

        // Add messages to the service
        messagingService.add(message1);
        messagingService.add(message2);

        // Retrieve the list of messages
        ArrayList<Message> messages = messagingService.getMessages();

        // Print the messages
        for (Message message : messages) {
            System.out.println("Sender: " + message.getSender());
            System.out.println("Content: " + message.getContent());
            System.out.println("------");
        }
    }
}
