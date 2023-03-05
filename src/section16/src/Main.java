package section16.src;

import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

//        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>(){
//            @Override
//            public boolean accept(Path path) throws IOException {
//                return (Files.isRegularFile(path));
//            }
//        };
//        DirectoryStream.Filter<Path> filter = Files::isRegularFile;
        DirectoryStream.Filter<Path> filter = file -> Files.isRegularFile(file);

        Path directory = FileSystems.getDefault().getPath("Example/Dir2");
//        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory, file -> Files.isRegularFile(file))){
        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)){
            for(Path file : contents){
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }
    }

}
