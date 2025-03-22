// LargeAppliance 클래스 (대형가전 - 자식 클래스)
class LargeAppliance extends Product {
    public LargeAppliance(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 0; // 대형가전의 할인 금액 없음
    }
}