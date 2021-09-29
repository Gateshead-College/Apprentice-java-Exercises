package projects.friday.mobile_banking.controllers;

import org.sqlite.SQLiteConfig;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InitDB {

    public static Connection initialiseDB() {
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            SQLiteConfig config = new SQLiteConfig();
            config.enforceForeignKeys(true);
            con = DriverManager.getConnection("jdbc:sqlite:../BankingDB.db", config.toProperties());
        }
        catch(ClassNotFoundException cnfEx){
            cnfEx.printStackTrace();
            System.out.println("The SQLite class could not be found.");
            System.out.println("Are you missing a dependency?");
            System.out.println("You can dowbload the required class from - https://github.com/xerial/sqlite-jdbc/releases");
        }
        catch(SQLException sqlEx){
            sqlEx.printStackTrace();
            System.out.println("An SQL Exception has been encountered.");
            System.out.println("Make sure you are connected to the internet and/or update the location of your database in the settings.");
        }
        finally {

        }
        return con;
    }

}
