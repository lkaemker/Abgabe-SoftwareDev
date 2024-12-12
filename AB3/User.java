public class User {
    private String firstName;
    private String lastName;
    private int id;

    public User(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }

    public void login(){
        System.out.println("User logged in" + firstName + " " + lastName);
    }
}
