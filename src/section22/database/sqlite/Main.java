package section22.database.sqlite;

import java.sql.*;

public class Main {

    public static final String DB_NAME="testjava.db";
    public static final String CONNECTION_STRING="jdbc:sqlite:/home/mateusz/Programowanie - Mateusz/Udemy/Java Programming Masterclass/sqlite/"+DB_NAME;
    public static final String TABLE_CONTACTS="contacts";
    public static final String COLUMN_NAME="name";
    public static final String COLUMN_PHONE="phone";
    public static final String COLUMN_EMAIL="email";


    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = connection.createStatement()){

            statement.execute("DROP TABLE IF EXISTS "+TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS "+TABLE_CONTACTS+" "+
                    "("+COLUMN_NAME+" TEXT, "+COLUMN_PHONE+" INTEGER, "+COLUMN_EMAIL+" TEXT)");

            insertContact(statement,"Tim", 12345678, "tim@wp.pl");
            insertContact(statement,"John", 89654712, "john@wp.pl");
            insertContact(statement,"Mark", 111222333, "mark@wp.pl");
            insertContact(statement,"Fido", 1234123, "fido@wp.pl");

//            statement.execute("INSERT INTO "+TABLE_CONTACTS+
//                    " ("+COLUMN_NAME+", "+
//                    COLUMN_PHONE+", "+
//                    COLUMN_EMAIL+") VALUES " +
//                    "('Tim', 12345678, 'tim@wp.pl')");
//
//            statement.execute("INSERT INTO "+TABLE_CONTACTS+
//                    " ("+COLUMN_NAME+", "+
//                    COLUMN_PHONE+", "+
//                    COLUMN_EMAIL+") VALUES " +
//                    "('John', 89654712, 'john@wp.pl')");
//
//            statement.execute("INSERT INTO "+TABLE_CONTACTS+
//                    " ("+COLUMN_NAME+", "+
//                    COLUMN_PHONE+", "+
//                    COLUMN_EMAIL+") VALUES " +
//                    "('Mark', 111222333, 'mark@wp.pl')");
//
//            statement.execute("INSERT INTO "+TABLE_CONTACTS+
//                    " ("+COLUMN_NAME+", "+
//                    COLUMN_PHONE+", "+
//                    COLUMN_EMAIL+") VALUES " +
//                    "('Fido', 1234123, 'fido@wp.pl')");

            statement.execute("UPDATE "+TABLE_CONTACTS+ " SET "+COLUMN_PHONE+"= 55555555 WHERE "+COLUMN_NAME+"= 'John'");

            statement.execute("DELETE FROM "+TABLE_CONTACTS+ " WHERE "+COLUMN_NAME+"= 'Fido'");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM "+TABLE_CONTACTS);
            while(resultSet.next()){
                System.out.printf("| %15s | %20d | %20s |\n",resultSet.getString(COLUMN_NAME),resultSet.getInt(COLUMN_PHONE),resultSet.getString(COLUMN_EMAIL));
            }
            resultSet.close();

        }catch (SQLException e){
            System.out.println("Something went wrong : "+e.getMessage());
            e.printStackTrace();
        }
    }

    public static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO "+TABLE_CONTACTS+
                " ("+COLUMN_NAME+", "+
                COLUMN_PHONE+", "+
                COLUMN_EMAIL+") VALUES " +
                "('"+name+"', '"+phone+"', '"+email+"')");

    }

}
