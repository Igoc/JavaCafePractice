import clerk.Clerk;
import item.Item;

public class Main {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        // 커피 가격 요청 -> 커피 가격 획득
        int coffeePrice = clerk.getPrice("Coffee");
        System.out.println("Coffee Price = " + coffeePrice);

        // 커피 주문 -> 커피 획득
        Item coffee = clerk.order("Coffee", coffeePrice);
        System.out.println("Name = " + coffee.getName() + ", Price = " + coffee.getPrice() + ", Shelf Life = " + coffee.getShelfLife());
        coffee.showTakeMethod();

        // 커피 주문 (돈 부족) -> 예외 발생
        try {
            clerk.order("Coffee", coffeePrice - 1000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 케이크 가격 요청 -> 케이크 가격 획득
        int cakePrice = clerk.getPrice("Cake");
        System.out.println("Cake Price = " + cakePrice);

        // 케이크 주문 -> 케이크 획득
        Item cake = clerk.order("Cake", cakePrice);
        System.out.println("Name = " + cake.getName() + ", Price = " + cake.getPrice() + ", Shelf Life = " + cake.getShelfLife());
        cake.showTakeMethod();

        // 스무디 가격 요청 (판매하지 않는 메뉴) -> 예외 발생
        try {
            clerk.getPrice("Smoothie");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 스무디 주문 (판매하지 않는 메뉴) -> 예외 발생
        try {
            clerk.order("Smoothie", 1000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}