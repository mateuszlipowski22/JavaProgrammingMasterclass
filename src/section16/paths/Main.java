package section16.paths;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {

        try{
            Path filePath = FileSystems.getDefault().getPath("Example", "Dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = "+size);
            System.out.println("Last modified = "+Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = "+attrs.size());
            System.out.println("Last modified = "+attrs.lastModifiedTime());
            System.out.println("Created = "+attrs.creationTime());
            System.out.println("Is directory = "+attrs.isDirectory());
            System.out.println("Is regilar file = "+attrs.isRegularFile());



//            Path dirToCreate = FileSystems.getDefault().getPath("Example/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
//            Files.createDirectories(dirToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Example", "Dir2/Dir3/Dir4/Dir5/Dir6");
//            Files.createDirectories(dirToCreate);

//            Path fileToCreate = FileSystems.getDefault().getPath("Example", "file2.txt");
//            Files.createFile(fileToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Example", "Dir4");
//            Files.createDirectory(dirToCreate);

//            Path fileToDelete = FileSystems.getDefault().getPath("Example", "Dir1", "file1copy.txt");
//            Files.deleteIfExists(fileToDelete);

//            Path fileToMove = FileSystems.getDefault().getPath("Example","file1copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Example","Dir1","file1copy.txt");
//            Files.move(fileToMove, destination);

//            Path fileToMove = FileSystems.getDefault().getPath("Example","file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Example","file2.txt");
//            Files.move(fileToMove, destination);

//            Path sourceFile = FileSystems.getDefault().getPath("Example","file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Example","file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile=FileSystems.getDefault().getPath("Example","Dir1");
//            copyFile = FileSystems.getDefault().getPath("Example","Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            System.out.println(e.getMessage());
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
