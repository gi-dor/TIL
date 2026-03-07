package access.ex;

public class Item {

    private String name;
    private int price;
    private int ea;

    public Item(String name, int price, int ea) {
        this.name = name;
        this.price = price;
        this.ea = ea;
    }

    public String getName(){
        return name;
    }

    public int getEa() {
        return ea;
    }

    public int getPrice() {
        return price;
    }

    public int getTotalPrice() {
        return price * ea;
    }
}
