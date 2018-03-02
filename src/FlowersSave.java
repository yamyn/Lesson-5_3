
import java.io.FileWriter;
import java.io.IOException;

public class FlowersSave {
    private static FlowersSave ourInstance = new FlowersSave();

    public static FlowersSave getInstance() {
        return ourInstance;
    }

    private FlowersSave() {
    }

    static FlowersSave save(String path, Flowers[] bouquet) {

        try (FileWriter fileWriter = new FileWriter(path, false)) {
            for (Flowers i : bouquet) {
                fileWriter.write(i.getName() + " ");
                fileWriter.flush();

            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
