package section16.directories;

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

        System.out.println("**************************************");
        Path dir2Path = FileSystems.getDefault().getPath("Example"+File.separator+"Dir2");
        try {
            Files.walkFileTree(dir2Path, new PrintNames());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---Copy Dir2 to Dir4/Dir2Copy---");
        Path copyPath = FileSystems.getDefault().getPath("Example"+File.separator+"Dir4"+File.separator+"Dir2Copy");
        try{
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        File file = new File("/Example/file.txt");
        Path convertedPath = file.toPath();
        System.out.println("ConvertedPath = "+convertedPath);

        File parent = new File("/Example");
        File resolvedFile = new File(parent, "dir/file.txt");
        System.out.println(resolvedFile.toPath());

        resolvedFile = new File("/Example", "dir/file.txt");
        System.out.println(resolvedFile.toPath());

        Path parentPath = Paths.get("/Example");
        Path childRelativePath = Paths.get("dir/file.txt");
        System.out.println(parentPath.resolve(childRelativePath));

        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("Working directory =" + workingDirectory);

        System.out.println("---print Dir2 contents using list() method");
        File dir2File = new File(workingDirectory, "/Example/Dir2");
        String[] dir2Content = dir2File.list();
        for (int i = 0; i < dir2Content.length; i++) {
            System.out.println("i="+i+" : "+dir2Content[i]);
        }
        System.out.println("---print Dir2 contents using listFiles() method");
        File[] dir2Files = dir2File.listFiles();
        for (int i = 0; i < dir2Files.length; i++) {
            System.out.println("i="+i+" : "+dir2Files[i].getName());
        }
    }

}
