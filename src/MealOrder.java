public class MealOrder {
    //You need a meal order.
    //Done. This should be composed of exactly one burger, one drink,
             // and one side item.

    //Done. The most common meal order should be created without any arguments,
    // like a regular burger, a small coke, and fries, for example.
    //You should be able to create other meal orders, by specifying
    //different burgers, drinks, and side items.

    //Done. You need a drink, and side item.
    //Done. The drink should have at least a type, size and price,
    //Done. and the price of the drink should change for each size.
    //Done. The side item needs at least a type and price.

    protected Burgers burger; //Includes a Burger --Will call from Class

    protected DeluxeBurger deluxeBurger;
    protected Drink drink; //Includes a Drink
    protected Sides side; //Includes a Side
    private double price;

    public MealOrder() {
        this.burger = new Burgers(1);
//        this.deluxeBurger = new DeluxeBurger(2);
        burger.addToppings(1,2,3);
        this.drink = new Drink("Coke",'m');
        this.side = new Sides("fries");
        this.price = calculateSubtotal();
    }

    public MealOrder(Burgers burger, Drink drink, Sides side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

    public MealOrder(DeluxeBurger deluxeBurger, Drink drink, Sides side) {
        this.deluxeBurger = deluxeBurger; //Initialize deluxeBurger
        this.drink = drink;
        this.side = side;
        this.price = 15.99;
    }


    public double calculateSubtotal() {
        if (deluxeBurger != null) {
            return 15.99;
//                    + drink.getPrice() + side.getPrice();
        } else {
            double totalPrice = burger.getPrice() + drink.getPrice()
                    + side.getPrice();
            return totalPrice;
        }
    }

    public double calculateTaxes() {
        double taxes = calculateSubtotal() * .08;
        return taxes;
    }

    public double calculatePriceTotal() {
        double total = calculateSubtotal() + calculateTaxes();
        return total;
    }

    public void printReceipt() {
        System.out.println("");
        System.out.println("DESCRIPTION");
        System.out.printf("_".repeat(40) + "\n");

        if (deluxeBurger != null) {
            System.out.println(deluxeBurger.printDetails());
        } else {
            System.out.println(burger.printDetails());
        }
        System.out.println(drink.printDetails());
        if (deluxeBurger != null) {
            System.out.println("DELUXE DISCOUNT: -"+ drink.getPrice());
        }
        System.out.println(side.printDetails());
        if (deluxeBurger != null) {
            System.out.println("DELUXE DISCOUNT: -"+ side.getPrice());
        }
        System.out.printf("_".repeat(40) + "\n");
        System.out.printf("SUB TOTAL: %.2f%n", calculateSubtotal());
        System.out.printf("TAX: %.2f%n", calculateTaxes());
        System.out.printf("_".repeat(40) + "\n");
        System.out.printf("TOTAL: %.2f%n", calculatePriceTotal());
    }



}
