package storage;

import item.Item;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private final Map<String, Item> items = new HashMap<>();

    public void putItem(String menu, Item item) {
        if (containsItem(menu)) {
            throw new IllegalArgumentException("이미 존재하는 물품");
        }

        items.put(menu, item);
    }

    public Item getItem(String menu) {
        if (!containsItem(menu)) {
            throw new IllegalArgumentException("존재하지 않는 물품");
        }

        return items.get(menu);
    }

    public boolean containsItem(String menu) {
        return items.containsKey(menu);
    }
}