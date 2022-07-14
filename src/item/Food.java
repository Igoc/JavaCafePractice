package item;

import java.time.LocalDateTime;

public class Food extends Item {
    public Food(String name, int price, LocalDateTime shelfLife) {
        super(name, price, shelfLife);
    }

    @Override
    public void showTakeMethod() {
        System.out.println("먹기");
    }
}