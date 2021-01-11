import java.util.ArrayList;

public class User {
    static ArrayList<User> users = new ArrayList<>();

    Double firstNumber = null;
    Double secondNumber = null;

    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        users.add(this);
    }

}
