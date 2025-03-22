
// Product 클래스 (부모 클래스)
abstract class Product {
    protected String name;
    protected int price;
    protected int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getPriceAfterDiscount() {
        return price - getDiscountAmount(); // 할인 금액을 적용한 가격을 리턴
    }

    public abstract int getDiscountAmount(); // 자식 클래스에서 구현해야 함
}
