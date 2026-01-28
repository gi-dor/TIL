package classSt;

public class ProductOrder {
    String productName;
    int price;
    int quantity;

    public static void main(String[] args) {
        ProductOrder order1 = new ProductOrder();
        order1.productName = "상품1";
        order1.price = 1000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "상품2";
        order2.price = 500;
        order2.quantity = 1;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "상품3";
        order3.price = 10000;
        order3.quantity = 2;

        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;

        int totalAmount = 0;
        for(ProductOrder p : orders) {
            System.out.println("상품명 : " + p.productName + ", 가격 : " + p.price + ", 수량 : " + p.quantity);
            totalAmount += p.price * p.quantity;
        }
        System.out.println("총 가격 : " + totalAmount);



    }

}
