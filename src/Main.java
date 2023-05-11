public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.5);
//        coke.printItem();
//        coke.setSize("small");
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();




//        Item fries=new Item("topping","fries",1);
//        fries.printItem();
//        fries.setSize("Medium");
//        fries.printItem();
//
//        Burger burger=new Burger("regular",4.00);
//        burger.addTopping("Bacon","Ham","MAYO");
//        burger.printItem();

//        MealOrder regularMeal=new MealOrder();
////        regularMeal.printItemizedList();
//        regularMeal.addBurgetToppings("BACON","BACON","");
//        regularMeal.setDrinkSize("Large");
//        regularMeal.printItemizedList();

     MealOrder specialMeal=new MealOrder("special","Fanta","Cheese");
     specialMeal.addBurgerToppings("Avocado","Bacon","Mayo","Ham","Cheese");
     specialMeal.setDrinkSize("Small");
     specialMeal.printItemizedList();



    }



}