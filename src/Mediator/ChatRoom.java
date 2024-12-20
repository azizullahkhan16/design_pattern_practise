package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    private List<User> users;
    private List<Message> messages;

    public ChatRoom() {
        this.users = new ArrayList<User>();
        this.messages = new ArrayList<>();
    }
    @Override
    public void sendMessageToUser(Message message, User receiver) {
        messages.add(message);
        receiver.receiveMessage(message);
    }

    @Override
    public void sendMessageToGroup(Message message, User sender) {
        messages.add(message);
        for (User user : users) {
            if(user != sender) {
                user.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User participant) {
        users.add(participant);
    }
}
