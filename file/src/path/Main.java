package path;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("person.csv");
        Path path1 = Paths.get("person1.csv");
        try {
            Files.createFile((Path) path);
            Files.delete(path);

            Files.move(path,path1);
            System.out.println("File Created");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
