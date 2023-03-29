package e2e.core;

public class User {
    final private String login;
    final private String password;

    public User(String login, String pass) {
        this.login = login;
        password = pass;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}
