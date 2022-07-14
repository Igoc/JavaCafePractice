package item;

import java.time.LocalDateTime;

public class Drink extends Item {
    public Drink(String name, int price, LocalDateTime shelfLife) {
        super(name, price, shelfLife);
    }

    @Override
    public void showTakeMethod() {
        System.out.println("마시기");
    }
}