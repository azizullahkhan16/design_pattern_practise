package Mediator;

public abstract class User {
    protected String name;
    protected ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public abstract void sendMessageToUser(Message message, User receiver);
    public abstract void sendMessageToGroup(Message message);
    public abstract void receiveMessage(Message message);

}
