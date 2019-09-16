package Week2Two.Testing;

public class Accounts {

    String UserValid(String user){
        String isValidPass;
        switch (user.toLowerCase()){

            case "franky":
                isValidPass = "FrankyisCool";
                break;
            case "kieran":
                isValidPass = "KieranisCool";
                break;
            case "robert":
                isValidPass = "RobertisCool";
                break;
            case "billey":
                isValidPass = "BilleyisCool";
                break;

            default:
                isValidPass = "Incorrect";

        }
        return isValidPass;


    }

}
