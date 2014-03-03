import java.util.List;

/**
 * Created by jonhopkins on 3/3/14.
 */

public class TestRead {
    public static void main(String args[]) {
        StaXParser read = new StaXParser();
        List<Item> readConfig = read.readConfig("config.xml");
        for (Item item : readConfig) {
            System.out.println(item);
        }

        // test out writing

        StaXWriter configFile = new StaXWriter();
        configFile.setFile("config2.xml");
        try {
            configFile.saveConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
