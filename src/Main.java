public class Main {
    //Your main method should have code to do the following:
    //Done. Create a default meal, that uses the no arguments constructor.
    //Done. Create a meal with a burger, and the drink and side item of your choice,
            //with up to 3 extra toppings.
    //Done. Make sides and drink free. Create a meal with a deluxe burger, where all items,
                 // drink, side item and toppings
                 // up to 5 extra toppings, are included in the burger price.
    public static void main(String[] args) {

//        MealOrder zachsMeal = new MealOrder();
//        zachsMeal.burger.addToppings(1,3,2);
//        zachsMeal.printReceipt();

//        MealOrder deluxe = new MealOrder(new DeluxeBurger(2), new Drink("Coke", 'L'),
//                new Sides("Fries"));
//        deluxe.deluxeBurger.get;
//        deluxe.printReceipt();

        MealOrder peggys = new MealOrder();
        peggys.printReceipt();

        MealOrder zachs = new MealOrder(new Burgers(3), new Drink("Coke Zero", 'm'),
                new Sides("Onion Ring"));
        zachs.burger.addToppings(2,4,3);
        zachs.printReceipt();

        MealOrder deluxe = new MealOrder(new DeluxeBurger(2), new Drink("Coke", 'L'),
                new Sides("Fries"));
        deluxe.deluxeBurger.addToppings(1,3,4,7,6);
        deluxe.printReceipt();



    }
}
