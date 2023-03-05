package section16.src;

import java.io.File;
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

//        Path directory = FileSystems.getDefault().getPath("Example/Dir2");
        Path directory = FileSystems.getDefault().getPath("Example"+File.separator+"Dir2");
//        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory, file -> Files.isRegularFile(file))){
        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)){
            for(Path file : contents){
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }

        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        try{

            Path tempFile = Files.createTempFile("myapp", ".appext");
            System.out.println("Temporary file path = "+tempFile.toAbsolutePath());

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for(FileStore store : stores){
            System.out.println("Volume name / Driver letter = " + store);
            System.out.println("file store = " + store.name());
        }

        System.out.println("**************************************");
        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for (Path path : rootPaths){
            System.out.println(path);
        }
    }

}
