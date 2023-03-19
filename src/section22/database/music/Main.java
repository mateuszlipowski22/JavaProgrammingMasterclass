package section22.database.music;

import section22.database.music.model.Artist;
import section22.database.music.model.Datasource;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();

        if(!datasource.open()){
            System.out.println("Can't open the datasource");
            return;
        }

        List<Artist> artists = datasource.queryArtists(2);

        if(artists == null){
            System.out.println("No artist!");
            return;
        }

        for (Artist artist : artists){
            System.out.printf("ID = %5d | name = %35s \n",artist.getId(), artist.getName());
        }

        datasource.close();

    }

}
