package section16.directories;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFiles extends SimpleFileVisitor<Path> {

    private Path sourceRoot;
    private Path targetRoot;

    public CopyFiles(Path sourceRoot, Path targetRoot) {
        this.sourceRoot = sourceRoot;
        this.targetRoot = targetRoot;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error access file: " + file.toAbsolutePath() + " " + exc.getMessage());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return getFileCopy(dir);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        return getFileCopy(file);
    }

    private FileVisitResult getFileCopy(Path root) {
        Path relativizePath = sourceRoot.relativize(root);
        System.out.println("RelativizePath = "+relativizePath);
        Path copyDir = targetRoot.resolve(relativizePath);
        System.out.println("Resolved path for copy = " + copyDir);

        try{
            Files.copy(root, copyDir);
        }catch (IOException e){
            System.out.println(e.getMessage());
            if(Files.isDirectory(root)){
                return FileVisitResult.SKIP_SUBTREE;
            }
        }
        return FileVisitResult.CONTINUE;
    }
}
