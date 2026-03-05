package helloshop.order;

import helloshop.product.Product;
import helloshop.user.User;

public class Order {

    User user;
    Product product;

    // public - 다른패키지에서 호출
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
