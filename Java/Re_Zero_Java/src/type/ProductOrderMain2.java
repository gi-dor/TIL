package type;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수 입력 : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for(int i = 0 ; i < orders.length; i++) {
            // 입력 항목 몇개 할것인지
            System.out.println((i+1)+ "번째 주문정보를 입력하세요");

            System.out.print("상품명 : ");
            String productName = scanner.nextLine();

            System.out.print("가격 : ");
            int price = scanner.nextInt();

            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            // 입력되어 완성된 정보 i
            orders[i] = createProductOrder(productName, price, quantity);
        }


        printOrders(orders);
        int totalAmount = getTotalAmount(orders);

        System.out.println("총 가격 : " + totalAmount);

    }

    static ProductOrder createProductOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for(ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for(ProductOrder p : orders) {
            totalAmount += p.price * p.quantity;
        }
        return totalAmount;
    }

}
