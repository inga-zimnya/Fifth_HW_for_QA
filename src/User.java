import java.util.LinkedList;
public class User {
    int id;
    String name;
    int age;
    public LinkedList<String> phoneNumbers;
    public User(int id, String name, int age, LinkedList<String> phoneNumbers){
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }
}
