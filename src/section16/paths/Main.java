package section16.paths;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        Path filePath = FileSystems.getDefault().getPath("files","SubDirectoryFile.txt");
        printFile(filePath);
        Path outerFilePath = Paths.get("/home/mateusz/Programowanie - Mateusz/Udemy/Java Programming Masterclass/OutDirectory.txt");
        printFile(outerFilePath);

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
