package section8.polymorphism;

public class NextMain {

    public static void main(String[] args) {

        Movie theMovie = Movie.getMovie("Science", "Star Wars");
        theMovie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Jaws");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("A", "Jaws");
        if(unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        } else if(unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }
    }

}
