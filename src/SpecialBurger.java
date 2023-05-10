public class SpecialBurger extends Burger {
    Item special1;
    Item special2;

    public SpecialBurger(String name, double price) {
        super(name, price);
    }


    public void addTopping(String extra1, String extra2, String extra3,String extra4,String extra5) {
        super.addTopping(extra1, extra2, extra3);//Overloaded
       this.special1=new Item("TOPPING",extra4,0.0);
        this.special2=new Item("TOPPING",extra5,0.0);
    }

    @Override
    public void printItemizedList() {

        super.printItemizedList();
        if(special1 != null){
            special1.printItem();
        }
        if(special2 != null){
            special2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) { // all additional toppings are included in the Total Price
        return 0;
    }
}
