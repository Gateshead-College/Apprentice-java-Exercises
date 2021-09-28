package projects.friday.mobile_banking.controllers;


import projects.friday.mobile_banking.models.User;

import java.util.ArrayList;

public class LoginController {


    //Method declaration - return type User - returns a user object
    //Requires two string values (un & pw) to run.
    public User validateLogin(String un, String pw) {
        //Create a new local ArrayList variable called 'allUsers'
        //Assign to the ArrayList the return value of
        //the createUsers method in our Initialise class.
        //We don't need to create an Initialise object to access the
        //createUsers method as it is defined as 'static'
        ArrayList<User> allUsers = Initialise.createUsers();
        //A for each loop that will iterate over each of the elements (Users)
        //in our arrayList called 'allUsers'
        //The User currently being looked at will be assigned to 'thisUser'
        for(User thisUser : allUsers) {
            //With the User object currently being looked at which is stored
            //in the 'thisUser' variable, call the getUsername method in the
            //User class which will return the username for that User object.
            //Check if the value returned by the getUsername method is the same
            //as the value entered by the user, which was passed into the local
            //variable 'un' ignoring any differences in case.
            if (un.equalsIgnoreCase(thisUser.getUsername())
                    //AND
                    &&
                    //With the User object currently being looked at which is stored
                    //in the 'thisUser' variable, call the getPassword method in the
                    //User class which will return the password for that User object.
                    //Check if the value returned by the getPassword method is the same
                    //as the value entered by the user, which was passed into the local
                    //variable 'pw' making sure the case is also the same.
                    pw.equals(thisUser.getPassword())) {
                        //if BOTH of the conditions above are true
                        //return the User object currently being
                        //looked at in the 'thisUser' vairable.
                        return thisUser;
            }
            //If the code gets here then the User object curerntly being looked
            //at did not meet the conditions of the if statement, i.e. the username
            //and/or password did not match what was returned by the getUsername
            //and getPassword methods.
            //Loop will run again, this time looking at the next user in the ArrayList 'allUsers'
        }
        //If the code gets here then the loop has finished iterating over all of the Users in the
        //'allUsers' ArrayList and none of the detailes provided matched the details returned by the
        //User object
        //i.e. the username and password combination provided were wrong, in this case we return null
        //as there is no User object to send back.
        return null;
    }
}





//    private String username;
//    private Character password;
//    private String bank;
//    private Calendar welcome;
//
//
//    public LoginController(String username, Character password, String bank, Calendar welcome) {
//        this.username = username;
//        this.password = password;
//        this.bank = bank;
//        this.welcome = welcome;
//    }
//   / * ***** REQUIREMENTS ******
//1. User needs to have a username and password to log into banking app
//method: private String userLogin();
//sout: Enter Username = new instance of userName
//      Enter password = new instance of password
//2. private boolean userRegisterValidate();
//If True = username && password - need to query user input from database; displayAccountMenu if ==1 account, else >1 account
//displayMainMenu; else if no account, call createAccount();
//False = createUsername and createPassword method - Q: are we calling User model class setters i.e. 'setAccount' to do this, or
//are we using registerUser(); to call this?
//3. User can be welcomed depending on time and day of log-in
//If time = 00:00-11:59 "Good Morning" + name + "Welcome to the " + bank + " app.",
//else if time = 12:00-17:30 "Good Afternoon " + name + "Welcome to the " + bank + " app.",
//else if time 17:31-23:59 "Good Evening " + name + "Welcome to the " + bank + " app." - check in case this is too complicated.
//     */

