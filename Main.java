import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String saveDir = "/Users/artem/Desktop/learn/Java/java core/дз2/Games/savegames";

        // Создаём 3 объекта GameProgress
        GameProgress gp1 = new GameProgress(100, 2, 5, 350.0);
        GameProgress gp2 = new GameProgress(80, 5, 10, 123.5);
        GameProgress gp3 = new GameProgress(45, 1, 2, 50.8);

        // Пути до файлов сохранений
        String save1 = saveDir + "/save1.dat";
        String save2 = saveDir + "/save2.dat";
        String save3 = saveDir + "/save3.dat";

        // Сохраняем их
        FileManager.saveGame(save1, gp1);
        FileManager.saveGame(save2, gp2);
        FileManager.saveGame(save3, gp3);

        // Список путей для архивации
        List<String> saves = new ArrayList<>();
        saves.add(save1);
        saves.add(save2);
        saves.add(save3);

        // Архивируем
        String zipPath = saveDir + "/saves.zip";
        Zipper.zipFiles(zipPath, saves);

        // Удаляем оригинальные .dat файлы
        Cleaner.deleteFiles(saves);

    }
}
