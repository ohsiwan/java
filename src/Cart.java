// Cart 클래스 (장바구니)
class Cart {
    private Product[] products;


    public Cart(Product[] products) {
        this.products = products;
    }

    // 배송비 계산 메소드
    public int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPriceAfterDiscount = 0;

        // 총 무게와 할인 금액이 적용된 가격 계산
        for (Product product : products) {
            totalWeight += product.weight;
            totalPriceAfterDiscount += product.getPriceAfterDiscount();
        }

        // 배송비 계산
        int deliveryCharge = calculateDeliveryChargeByWeight(totalWeight);

        // 가격에 따른 배송비 할인 적용
        if (totalPriceAfterDiscount < 30000) {
            return deliveryCharge;
        } else if (totalPriceAfterDiscount < 100000) {
            return Math.max(deliveryCharge - 1000, 0); // 최소 배송비가 0이어야 하므로
        } else {
            return 0; // 100000원 이상이면 배송비 무료
        }
    }

    // 무게에 따른 배송비 계산
    private int calculateDeliveryChargeByWeight(int totalWeight) {
        if (totalWeight < 3) {
            return 1000; // 무게 3미만 배송비 1000
        } else if (totalWeight < 10) {
            return 5000; // 무게 3이상 10미만 배송비 5000
        } else {
            return 10000; // 무게 10 이상 배송비 10000
        }
    }
}