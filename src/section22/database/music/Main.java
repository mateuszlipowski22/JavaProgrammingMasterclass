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

        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_DESC);

        if(artists == null){
            System.out.println("No artist!");
            return;
        }

        for (Artist artist : artists){
            System.out.printf("ID = %5d | name = %35s \n",artist.getId(), artist.getName());
        }

        List<String> albumsForArtist = datasource.queryAlbumsForArtists("Iron Maiden", Datasource.ORDER_BY_DESC);
        for (String album : albumsForArtist){
            System.out.printf("name = %35s \n",album);
        }

        datasource.close();

    }

}
