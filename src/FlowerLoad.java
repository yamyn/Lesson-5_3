
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FlowersLoad extends FlowerStore {
    private static FlowersLoad ourInstance = new FlowersLoad();

    public static FlowersLoad getInstance() {
        return ourInstance;
    }

    private FlowersLoad() {
    }

    static Flowers[] load(String path) {

        try {
            FileInputStream stream = new FileInputStream(path);
            Scanner scanner = new Scanner(stream);
            String[] arrayString = scanner.nextLine().split(" ");
            Flowers[] flowers = new Flowers[arrayString.length];
            {
                for (int i = 0; i < flowers.length; i++) {
                    if (arrayString[i].toString().equals("Rose")) {
                        flowers[i] = new Rose_Flow();
                    }
                    if (arrayString[i].toString().equals("Chamomile")) {
                        flowers[i] = new Chamomile_Flow();
                    }
                    if (arrayString[i].toString().equals("Tulip")) {
                        flowers[i] = new Tulip_Flow();
                    }
                }
            }
                scanner.close();
                ourInstance.setBouquet(flowers);
                return ourInstance.getBouquet();
            } catch(FileNotFoundException e){
                e.printStackTrace();
            }
            return ourInstance.getBouquet();

    }
}

