package section22.database.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:/home/mateusz/Programowanie - Mateusz/Udemy/Java Programming Masterclass/sqlite/testjava.db");
            Statement statement = connection.createStatement()){
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
        }catch (SQLException e){
            System.out.println("Something went wrong : "+e.getMessage());
        }
    }

}
