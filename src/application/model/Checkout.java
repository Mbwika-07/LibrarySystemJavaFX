package application.model;

public class Checkout {
    private String bookId;
    private String userId;
    private String dueDate;

    public Checkout(String bookId, String userId, String dueDate) {
        this.bookId = bookId;
        this.userId = userId;
        this.dueDate = dueDate;
    }

    // Getters and Setters
    public String getBookId() { return bookId; }
    public void setBookId(String bookId) { this.bookId = bookId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getDueDate() { return dueDate; }
    public void setDueDate(String dueDate) { this.dueDate = dueDate; }
}
