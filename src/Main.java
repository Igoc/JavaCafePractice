import clerk.Clerk;

public class Main {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        // 커피 가격 요청 -> 커피 가격 획득
        int coffeePrice = clerk.getPrice("Coffee");

        // 커피 주문 -> 커피 획득
        String coffee = clerk.order("Coffee", coffeePrice);

        // 커피 주문 (돈 부족) -> 예외 발생
        clerk.order("Coffee", coffeePrice - 1000);

        // 스무디 가격 요청 (판매하지 않는 메뉴) -> 예외 발생
        clerk.getPrice("Smoothie");

        // 스무디 가격 요청 (판매하지 않는 메뉴) -> 예외 발생
        clerk.order("Smoothie", 1000);
    }
}