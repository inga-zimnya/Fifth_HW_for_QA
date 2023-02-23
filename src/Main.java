import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> phoneInga = new LinkedList<>();
        LinkedList<String> phoneMan = new LinkedList<>();

        User user1 = new User(384893, "Inga", 20, phoneInga);
        User user2 = new User(389238, "Man of my dream", 22, phoneMan);

        phoneInga.add("829839348");
        phoneInga.add("382938049");
        phoneMan.add("382938923");
        phoneMan.add("320390293");

        System.out.println(user1.name);
        System.out.println(user1.phoneNumbers);

        System.out.println(user2.name);
        System.out.println(user2.phoneNumbers);
    }
}