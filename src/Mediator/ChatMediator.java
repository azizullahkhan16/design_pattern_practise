package Mediator;

public interface ChatMediator {
    void sendMessageToUser(Message message, User receiver);
    void sendMessageToGroup(Message message, User sender);
    void addUser(User participant);

}
