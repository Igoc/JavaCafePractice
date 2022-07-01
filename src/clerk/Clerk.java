package clerk;

import item.Item;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Clerk {
    private final Map<String, Item> items = new HashMap<>();

    public Clerk() {
        items.put("Coffee", new Item("Coffee", 3000, LocalDateTime.of(2022, 7, 1, 0, 0)));
        items.put("Ade", new Item("Ade", 4000, LocalDateTime.of(2022, 6, 30, 12, 0)));
        items.put("Cake", new Item("Cake", 5000, LocalDateTime.of(2022, 7, 1, 18, 0)));
    }

    public Item order(String menu, int price) {
        if (!items.containsKey(menu)) {
            throw new IllegalArgumentException("주문할 수 없는 메뉴");
        }

        if (getPrice(menu) != price) {
            throw new IllegalArgumentException("잘못된 지불 금액");
        }

        return items.get(menu);
    }

    public int getPrice(String menu) {
        if (!items.containsKey(menu)) {
            throw new IllegalArgumentException("주문할 수 없는 메뉴");
        }

        return items.get(menu).getPrice();
    }
}