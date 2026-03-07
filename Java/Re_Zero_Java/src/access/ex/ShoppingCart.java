package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if(itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }
        // items[인덱스] = item
        // items 배열 [null , null ,null...]
        // addItem("양파")
        // items[0] = 양파;
        // items배열 ["양파",null,null...]
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        for(int i =0; i<items.length; i ++) {
            Item item = items[i];
            if(item == null) {
                break;
            }
            System.out.println("상품명 : " + item.getName() + " " + item.getEa() + "개, " + "개당 : " +item.getPrice() +"원, 총 : "+ item.getTotalPrice());
        }
        System.out.println("총 가격 : " + calculatePrice());
    }

    private int calculatePrice() {
        int totalPrice = 0;
        for(int i =0; i< itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
