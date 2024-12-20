package Mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser("Aziz", chatRoom);
        User user2 = new ChatUser("Bob", chatRoom);
        User user3 = new ChatUser("David", chatRoom);
        User user4 = new ChatUser("Jack", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        user1.sendMessageToUser(new Message("Where are you?"), user2);
        user4.sendMessageToGroup(new Message("Hi everyone!"));
    }
}
