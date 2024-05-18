public class Sides {

    //The side item needs at least a type and price.
    private String type;
    private double price;

    public Sides(String type) {
        this.type = type.toUpperCase();
        this.price = calculatePrice(type);
    }

    public Sides() {
        this.type = "FRIES";
        this.price = calculatePrice("fries");
    }

    public double calculatePrice(String sideChosen) {
        return switch (sideChosen.toUpperCase()) {
            case "FRIES" -> 1.99;
            case "ONION RINGS" -> 2.99;
            case "CHEESE STICKS" -> 2.99;
            case "SALAD" -> 1.50;
            default -> 1.99;
        };
    }

    public String printDetails() {
        String sideItem = "SIDE: " + type + "\n";
        String sidePrice = "SIDE PRICE " + price;
        String sideDetails = sideItem + sidePrice;
        return  sideDetails;
    }

    public double getPrice() {
        return price;
    }
}
