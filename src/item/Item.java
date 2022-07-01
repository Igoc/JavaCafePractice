package item;

import java.time.LocalDateTime;

public class Item {
    private String name;
    private int price;
    private LocalDateTime shelfLife;

    public Item(String name, int price, LocalDateTime shelfLife) {
        this.name = name;
        this.price = price;
        this.shelfLife = shelfLife;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getShelfLife() {
        return shelfLife;
    }
}