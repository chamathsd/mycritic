package xyz.mycritic.mycritic;

/**
 * Created by alexrosenfeld10 on 3/19/16.
 */
public class User {
    String email;
    String password;

    User(String e, String p) {
        email = e;
        password = p;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Email: " + email + "\n" + "Password: " + password;
    }
}
