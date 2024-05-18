public class Burgers {

    //You need burgers.
    //Done. Every hamburger should have a burger type, a base price,
         //and up to a maximum of three extra toppings.
    //Done. The constructor should include only the burger type and price.
    //Done. Extra Toppings on a burger need to be added somehow,
                //and priced according to their type.

    //The deluxe burger bonus.
    //Done. Create a deluxe burger meal, with a deluxe burger,
            // that has a set price, so that any additional toppings
            // do not change the price.
    // The deluxe burger should have room for an additional two toppings.
    protected String type;  //Normal or Deluxe?
    protected double price; //

    protected double toppingPrice;
    protected String topping1; //
    protected String topping2; //T
    protected String topping3;

    protected String topping4;
    protected String topping5;
    protected int toppingCount;

    public Burgers() {
        this.type = getBurgerType(1);
        this.price = 6.99; //Base Price
    }

    public Burgers(int burgerType) {
        this.type = getBurgerType(burgerType);
        this.price = 6.99; //Base Price
    }


    ; //No args method, since I added customization below.

//    public Burgers(int toppingsIndex1,
//                   int toppingsIndex2, int toppingsIndex3) {
//        this.type = "REG BURGER";
//        this.price = 6.99;
//        this.toppings1 = getToppingIndex(toppingsIndex1);
//        this.toppings2 = getToppingIndex(toppingsIndex2);
//        this.toppings3 = getToppingIndex(toppingsIndex3);
//    }

    protected String getBurgerType(int index) {
        return switch (index) {
            case 1 -> "BURGER";
            case 2 -> "DELUXE BURGER";
            case 3 -> "VEGAN BURGER";
            default -> "BURGER";
        };
    }

    public void addToppings(int toppingsIndex1, int toppingsIndex2,
                            int toppingsIndex3) {
        toppingCount = 0;

        topping1 = getToppingIndex(toppingsIndex1);
        topping2 = getToppingIndex(toppingsIndex2);
        topping3 = getToppingIndex(toppingsIndex3);

        double toppingPrice1 = getToppingPrice(toppingsIndex1);
        double toppingPrice2 = getToppingPrice(toppingsIndex2);
        double toppingPrice3 = getToppingPrice(toppingsIndex3);

        toppingPrice = toppingPrice1 + toppingPrice2 + toppingPrice3;
        if (topping1 != "NULL") {
            toppingCount++;
        }
        if (topping2 != "NULL") {
            toppingCount++;
        }
        if (topping3 != "NULL") {
            toppingCount++;
        }

        if (toppingCount > 3) {
            System.out.println("No additional toppings allowed.");
        }

    }

    protected double getToppingPrice(int index) {
        return switch (index) {
            case 1 -> 0.99;
            case 2 -> 0.50;
            case 3 -> 0.99;
            case 4 -> 0.99;
            case 5 -> 0.99;
            case 6 -> 1.50;
            case 7 -> 1.99;
            case 8 -> 0;
            case 9 -> 0;
            default -> 0;
        };
    }

    protected String getToppingIndex(int index) {
        return switch (index) {
            case 1 -> "CHEESE";
            case 2 -> "LETTUCE";
            case 3 -> "TOMATO";
            case 4 -> "ONION";
            case 5 -> "PICKLES";
            case 6 -> "BACON";
            case 7 -> "ONION RING";
            case 8 -> "KETCHUP";
            case 9 -> "MUSTARD";
            default -> "NULL";
        };
    }

    public double calculateBurgerPrice() {
        double subtotal = price += toppingPrice;
        return subtotal;
    }

    public String printDetails() {
        String burgerDetails = "TYPE: " + type + "\n";
        String priceDetails = "BURGER PRICE: " + price + "\n";
        String toppingsDetails = "EXTRA TOPPINGS: " +
                topping1 +", " + topping2 +", " + topping3 + "\n" + "EXTRA TOPPINGS CHARGE: "
                + toppingPrice;
        String burgerSubtotal = "BURGER SUBTOTAL: " + calculateBurgerPrice();
        String details = burgerDetails + priceDetails + toppingsDetails;
        return details;
    }

    public double getPrice() {
        return price;
    }
}

class DeluxeBurger extends Burgers {
    private String toppings4;
    private String toppings5;

    DeluxeBurger(int burgerType) {
        super(burgerType);
        this.type = getBurgerType(burgerType);
        this.price = 15.99; //Base Price
    }

    public void addToppings(int toppingsIndex1, int toppingsIndex2,
                            int toppingsIndex3, int toppingsIndex4,
                            int toppingsIndex5) {

        super.addToppings(toppingsIndex1, toppingsIndex2, toppingsIndex3);
        toppingCount = 0;

        topping4 = getToppingIndex(toppingsIndex4);
        topping5 = getToppingIndex(toppingsIndex5);

        double toppingPrice4 = getToppingPrice(toppingsIndex1);
        double toppingPrice5 = getToppingPrice(toppingsIndex5);

        toppingPrice = 0.00;

        if (topping4 != "NULL") {
            toppingCount++;
        }
        if (topping5 != "NULL") {
            toppingCount++;
        }

        if (toppingCount > 5) {
            System.out.println("No additional toppings allowed.");
        }
    }

    @Override
    public String printDetails() {
        super.printDetails();
        String extraToppingsDetails = "\n" + "DELUXE TOPPINGS: " + topping4 + ", " + topping5;
        String details = super.printDetails() + extraToppingsDetails;
        return details;
    }
}
