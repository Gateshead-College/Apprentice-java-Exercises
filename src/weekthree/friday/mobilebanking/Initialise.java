package weekthree.friday.mobilebanking;

import java.util.ArrayList;

public class Initialise {

    public Initialise(ArrayList<User> users){
        seedData(users);
    }

    private void seedData(ArrayList<User> users){
        users.add(new User("Deano","Password",
                "Dean", "Lewis", new ArrayList()));
        users.add(new User("JackieS","Password",
                "Jackie", "Dowling", new ArrayList()));
        users.add(new User("JohnD","Password",
                "John", "Deary", new ArrayList()));
        users.add(new User("GillianP","Password",
                "Gillian", "Porter", new ArrayList()));
    }



}
