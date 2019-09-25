package weekthree.tuesday.constructors;

public class User {

    private String username;    //*
    private String password;    //*
    private byte age;
    private String forename;
    private String surname;
    private long phoneNumber;   //*
    private boolean gender;    //*

    public User(String username, String password, long phoneNumber, boolean gender) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public User(String username, String password, byte age, long phoneNumber, boolean gender) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String returnData() {
        return "Hello, your new account has been created with the following values: \n Username: " + username + "\n Password: " + password
                + "\n Age: " + age + "\n Forename: " + forename + "\n Surname: " + surname + "\n Phone Number: " + phoneNumber + "\n Gender: " + gender;
    }
}
