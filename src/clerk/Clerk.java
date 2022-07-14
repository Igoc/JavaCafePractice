package clerk;

import item.Drink;
import item.Food;
import item.Item;
import storage.Storage;

import java.time.LocalDateTime;

public class Clerk {
    private final Storage storage = new Storage();

    public Clerk() {
        try {
            storage.putItem("Coffee", new Drink("Coffee", 3000, LocalDateTime.of(2022, 7, 1, 0, 0)));
            storage.putItem("Ade", new Drink("Ade", 4000, LocalDateTime.of(2022, 6, 30, 12, 0)));
            storage.putItem("Cake", new Food("Cake", 5000, LocalDateTime.of(2022, 7, 1, 18, 0)));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public Item order(String menu, int price) {
        if (!storage.containsItem(menu)) {
            throw new IllegalArgumentException("주문할 수 없는 메뉴");
        }

        if (getPrice(menu) != price) {
            throw new IllegalArgumentException("잘못된 지불 금액");
        }

        return storage.getItem(menu);
    }

    public int getPrice(String menu) {
        if (!storage.containsItem(menu)) {
            throw new IllegalArgumentException("주문할 수 없는 메뉴");
        }

        return storage.getItem(menu).getPrice();
    }
}