
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        FlowerStore flowerStore = new FlowerStore();
        System.out.println("Hi! \n" +
                "How many flowers you would like to buy?");
        System.out.println("How many Rose?");
        int rose = scanner.nextInt();
        System.out.println("How many chamomile?");
        int chamomile = scanner.nextInt();
        System.out.println("How many tulip?");
        int tulip = scanner.nextInt();
        flowerStore.sell(rose, chamomile, tulip);
        flowerStore.show();
        flowerStore.sellSequence(rose, chamomile, tulip);
        flowerStore.show();
        FlowersSave flowersSaver = FlowersSave.save("filles/text/bouquet.txt",flowerStore.getBouquet());
        Flowers[] flowersLoader = FlowersLoad.load("filles/text/bouquet.txt");
        flowerStore.show();

    }

}
