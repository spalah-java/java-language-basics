package ua.spalah.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Kostiantyn Huliaiev
 */
public class FilesMain {

    public static void main(String[] args) throws IOException {
        validPath();
        resolveAndRelativize();
        readWrite();
        copyMove();
    }

    private static void copyMove() throws IOException {
        Path file1 = Paths.get("C:\\Users\\spalah\\java17\\some.txt");
        Path file2 = Paths.get("C:\\Users\\spalah\\java17\\wrewr.txt");

        Files.copy(file2, Paths.get("C:\\Users\\spalah\\java17\\some\\copied file.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.move(file1, Paths.get("C:\\Users\\spalah\\java17\\some\\moved file.txt"));
//        Files.copy(file2, file1);

        Path file3 = Paths.get("C:\\Users\\spalah\\java17\\wrewr1.txt");
//        Files.delete(file3);
        Files.deleteIfExists(file3);

        Files.exists(file1);
        Files.isHidden(file1);
    }

    private static void readWrite() throws IOException {
        Path path = Paths.get("C:\\Users\\spalah\\java17\\wrewr.txt");

        List<String> strings = Files.readAllLines(path);
        for (String string : strings) {
            System.out.println(string);
        }

        List<String> integers = asList("1", "2", "3", "4", "5");
        Files.write(path, integers, StandardOpenOption.APPEND);

        Files.write(path.resolveSibling(Paths.get("always new.txt")), integers, StandardOpenOption.CREATE_NEW);
    }

    private static void resolveAndRelativize() {
        Path basePath = Paths.get("C:\\", "Users", "spalah");
        Path relativeWorkingPath = Paths.get("java17", "some folder");

        Path absoluteWorkingPath = basePath.resolve(relativeWorkingPath);
        System.out.println(absoluteWorkingPath);

        Path users = basePath.resolve("C:\\Users");
        System.out.println(users);

        Path relativize = Paths.get("C:\\", "Users", "spalah", "java17").relativize(absoluteWorkingPath);
        System.out.println(relativize);

        Path goUp = absoluteWorkingPath.resolve("../..");
        System.out.println(goUp);
        System.out.println(goUp.normalize());

        Path newAbsolutePath = relativeWorkingPath.toAbsolutePath();
        System.out.println(newAbsolutePath);
    }

    private static void validPath() {
        Path basePath = Paths.get("C:\\", "Users", "spalah", "java17");
        Path pathToCompare = Paths.get("C:\\Users\\spalah\\java17");

        System.out.println(basePath.equals(pathToCompare));

        Path pathToCompareUnix = Paths.get("C:/Users/spalah/java17");
        System.out.println(basePath.equals(pathToCompareUnix));

        Path unix = Paths.get("/c/Users/spalah/java17");
        System.out.println(basePath.equals(unix));
    }
}
