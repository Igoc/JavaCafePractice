package clerk;

import java.util.HashMap;
import java.util.Map;

public class Clerk {
    private final Map<String, String> items = new HashMap<>();

    public Clerk() {
        items.put("Coffee", "Coffee");
        items.put("Ade", "Ade");
        items.put("Cake", "Cake");
    }

    public String order(String food) {
        return items.get(food);
    }
}