package application.model;

public class User {
    private String username;
    private String id;
    private String password;

    public User(String username, String id, String password) {
        this.username = username;
        this.id = id;
        this.password = password;
    }

    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
