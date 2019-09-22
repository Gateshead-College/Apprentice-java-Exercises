package weekthree.friday.mobilebanking;

import java.util.ArrayList;

public class Initialise {

    public ArrayList<User> seedData(){
        ArrayList<User> users = new ArrayList();
        users.add(new User("Deano","Password",
                "Dean", "Lewis", seedAccountsSingle()));
        users.add(new User("JackieS","Password",
                "Jackie", "Dowling", seedAccountsDouble()));
        users.add(new User("JohnD","Password",
                "John", "Deary", new ArrayList()));
        users.add(new User("GillianP","Password",
                "Gillian", "Porter", new ArrayList()));
        return users;
    }

    public ArrayList<Account> seedAccountsSingle() {
        ArrayList<Account> accounts = new ArrayList();
        accounts.add(new Account(0001, 100, "Current"));
        return accounts;
    }

    public ArrayList<Account> seedAccountsDouble() {
        ArrayList<Account> accounts = new ArrayList();
        accounts.add(new Account(0002, 23.89, "Current"));
        accounts.add(new Account(0003, 3174, "Savings"));
        return accounts;
    }



}
