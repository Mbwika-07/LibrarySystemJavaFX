package application.model;

public class Author {
    private String name;
    private String bio;

    // Constructor
    public Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
