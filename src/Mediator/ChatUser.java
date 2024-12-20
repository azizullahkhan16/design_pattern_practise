package Mediator;

public class ChatUser extends User {

    public ChatUser(String name, ChatMediator chatMediator) {
        super(name, chatMediator);
    }

    @Override
    public void sendMessageToUser(Message message, User receiver) {
        System.out.println("------------ INDIVIDUAL CHAT-----------------");
        System.out.println(this.name + " sends: " + message.getMessage() + " to " + receiver.name);
        this.chatMediator.sendMessageToUser(message, receiver);
    }

    @Override
    public void sendMessageToGroup(Message message) {
        System.out.println("------------ GROUP CHAT---------------");
        System.out.println(this.name + " sends: " + message.getMessage());
        this.chatMediator.sendMessageToGroup(message, this);
    }

    @Override
    public void receiveMessage(Message message) {
        System.out.println(this.name + " received: " + message.getMessage());
    }
}
