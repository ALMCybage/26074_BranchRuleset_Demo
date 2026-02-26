import java.util.ArrayList;
import java.util.List;

class User {
    private int id;
    private String name;
    private String email;
    private String role;

    public User(int id, String name, String email, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + email + " | " + role;
    }
}

public class UserData {

    public static void main(String[] args) {

        // Adding row data
        List<User> users = new ArrayList<>();

        users.add(new User(1, "Rakhi", "rakhi@example.com", "Admin"));
        users.add(new User(2, "Majid", "majid@example.com", "Developer"));
        users.add(new User(3, "Abhi", "abhi@example.com", "Tester"));
        users.add(new User(4, "Sneha", "sneha@example.com", "Manager"));

        // Print data
        System.out.println("ID | Name | Email | Role");
        System.out.println("----------------------------------------");

        for (User user : users) {
            System.out.println(user);
        }
    }
}

