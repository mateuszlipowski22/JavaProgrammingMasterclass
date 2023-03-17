package section22.database.music;

import java.sql.*;

public class Datasource {

    public static final String DB_NAME="music.db";
    public static final String CONNECTION_STRING="jdbc:sqlite:/home/mateusz/Programowanie - Mateusz/Udemy/Java Programming Masterclass/sqlite/"+DB_NAME;

    public static final String TABLE_ALBUMS="albums";
    public static final String COLUMN_ALBUM_ID="_id";
    public static final String COLUMN_ALBUM_NAME="name";
    public static final String COLUMN_ALBUM_ARTIST="artist";

    public static final String TABLE_ARTISTS="artists";
    public static final String COLUMN_ARTIST_ID="_id";
    public static final String COLUMN_ARTIST_NAME="name";

    public static final String TABLE_SONGS="songs";
    public static final String COLUMN_SONG_TRACK="tracks";
    public static final String COLUMN_SONG_TITLE="title";
    public static final String COLUMN_SONG_ALBUM="album";

    private Connection connection;

    public boolean open(){
        try{
            connection = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        }catch (SQLException e){
            System.out.println("Could not connect to database : "+e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public void close(){
        try{
            if(connection!=null){
                connection.close();
            }
        }catch (SQLException e){
            System.out.println("Could not close the connection : "+e.getMessage());
            e.printStackTrace();
        }
    }
}
