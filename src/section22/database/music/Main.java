package section22.database.music;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();

        if(!datasource.open()){
            System.out.println("Can't open the datasource");
            return;
        }

        datasource.close();

    }

}
