package section22.database.sqlite;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:/home/mateusz/Programowanie - Mateusz/Udemy/Java Programming Masterclass/sqlite/testjava.db");
            Statement statement = connection.createStatement()){
//            connection.setAutoCommit(false);
            statement.execute("CREATE TABLE IF NOT EXISTS contacts "+
                    "(name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Mateusz', 15648923,'mateusz@wp.pl')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Jane', 15622223,'jane@wp.pl')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Bob', 33348923,'bob@wp.pl')");
//            statement.execute("UPDATE contacts SET phone=111111111 WHERE name='Jane'");
//            statement.execute("DELETE FROM contacts WHERE name='Jane'");

            statement.execute("SELECT * FROM 'contacts'");
            ResultSet resultSet=statement.getResultSet();
            while(resultSet.next()){
                System.out.printf("| %15s | %20d | %20s |\n",resultSet.getString("name"),resultSet.getInt("phone"),resultSet.getString("email"));
            }
            resultSet.close();

        }catch (SQLException e){
            System.out.println("Something went wrong : "+e.getMessage());
        }
    }

}
