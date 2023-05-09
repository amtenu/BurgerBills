public class Main {
    public static void main(String[] args) {
        Item coke = new Item("drink", "coke", 1.5);
        coke.printItem();
        coke.setSize("small");
        coke.printItem();


        Item fries=new Item("topping","fries",1);
        fries.printItem();
        fries.setSize("Medium");
        fries.printItem();
    }
}