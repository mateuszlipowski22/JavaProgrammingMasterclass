package section22.database.music;

import section22.database.music.model.Artist;
import section22.database.music.model.Datasource;
import section22.database.music.model.SongArtist;

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

        List<String> albumsForArtist = datasource.queryAlbumsForArtists("Pink Floyd", Datasource.ORDER_BY_DESC);
        for (String album : albumsForArtist){
            System.out.printf("name = %35s \n",album);
        }
        List<SongArtist> songArtists = datasource.queryArtistsForSongs("She's On Fire", Datasource.ORDER_BY_DESC);
        if(songArtists==null){
            System.out.println("Couldnt find the artist for the song");
            return;
        }

        for (SongArtist songArtist : songArtists){
            System.out.printf("artist name = %35s, album name = %35s, track %d \n",songArtist.getArtistName(),songArtist.getAlbumName(),songArtist.getTrack());
        }

        datasource.querySongsMetadata();

        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("Number of songs is: "+count);

        datasource.createViewForSongArtists();

        datasource.close();

    }

}
