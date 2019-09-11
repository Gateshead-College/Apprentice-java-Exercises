package weektwo.Testing;

public class openAccount {

    int accounts;

    public void openAcc(String user) {

        switch (user.toLowerCase()) {

            case "franky":
                accounts = 1;
                break;

            case "kieran":
                accounts = 3;
                break;

            case "robert":
                accounts = 0;
                break;

            case "billey":
                accounts = 2;
                break;


            default:
                System.out.println("Error user not logged in!");


        }
    }
}
