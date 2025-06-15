import java.io.File;
import java.util.List;

public class Cleaner {
    public static void deleteFiles(List<String> filePaths) {
        for (String filePath : filePaths) {
            File file = new File(filePath);
            if (file.delete()) {
                System.out.println("Удалён файл: " + filePath);
            } else {
                System.out.println("Не удалось удалить файл: " + filePath);
            }
        }
    }
}
