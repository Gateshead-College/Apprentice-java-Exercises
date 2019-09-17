package Week3Three.Tuesday.construstors;

public class User {

    private String username;
    private String password;
    private byte age;
    private String forename;
    private String surname;
    private long phonenumber;
    private boolean gender;

    public User(String username, String password, long phonenumber, boolean gender) {
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.gender = gender;
    }

    public User(String username, String password, byte age, long phonenumber, boolean gender) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.phonenumber = phonenumber;
        this.gender = gender;
    }

    void values(){
        System.out.println("Name:" +forename +" "+ surname);
        System.out.println("Age: " + age);
        System.out.println("Username: "+ username);
        System.out.println("Password: " + password);
        System.out.println("Phone number: " + phonenumber);
        System.out.println("Gender " + gender);
    }
}
