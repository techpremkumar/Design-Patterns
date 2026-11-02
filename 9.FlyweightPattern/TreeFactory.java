import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static final Map<String, TreeType> trees =
            new HashMap<>();

    public static TreeType getTree(String name, String color) {

        String key = name + "-" + color;

        if (!trees.containsKey(key)) {
            trees.put(key, new Tree(name, color));
        }

        return trees.get(key);
    }
}