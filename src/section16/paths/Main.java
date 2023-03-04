package section16.paths;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

        try{
            Path sourceFile = FileSystems.getDefault().getPath("Example","file1.txt");
            Path copyFile = FileSystems.getDefault().getPath("Example","file1copy.txt");
            Files.copy(sourceFile, copyFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
////        Path filePath = FileSystems.getDefault().getPath("files","SubDirectoryFile.txt");
//        Path filePath = Paths.get(".","files","SubDirectoryFile.txt");
//        printFile(filePath);
////        Path outerFilePath = Paths.get("/home/mateusz/Programowanie - Mateusz/Udemy/Java Programming Masterclass/OutDirectory.txt");
//        Path outerFilePath = Paths.get("/home/mateusz/Programowanie - Mateusz/Udemy","/Java Programming Masterclass/","OutDirectory.txt");
//        printFile(outerFilePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubDirectoryFile.txt");
//        printFile(path2);
//        System.out.println(path2.normalize().toAbsolutePath());
//
//        Path path3 = FileSystems.getDefault().getPath("thisFileDoesNotExist.txt" );
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("/volumes/test/ing","abcdef","no.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = "+Files.exists(filePath));
//        System.out.println("Exists = "+Files.exists(path4));

    }

    public static void printFile(Path path){
        try(BufferedReader fileReader = Files.newBufferedReader(path)){

            String line;
            while ((line=fileReader.readLine())!=null){
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
