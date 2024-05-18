public class Drink {
    private String type;
    private char size;
    private double price;

    public Drink(String type, char size) {
        this.type = type.toUpperCase();
        this.size = Character.toUpperCase(size);
        this.price = calculatePrice(size);
    }

    private double calculatePrice(char size) {
        return switch (Character.toUpperCase(size)) {
            case 'S' -> 1.99;
            case 'M' -> 2.49;
            case 'L' -> 2.99;
            case 'X' -> 3.49;
            default -> 2.49;
        };
    }

    public String printDetails() {
        String drinkType = "DRINK: " + type + "\n";
        String drinkSize = "DRINK SIZE: " + size + "\n";
        String drinkPrice = "DRINK PRICE: " + price;
        String drinkDetails = drinkType + drinkSize + drinkPrice;
        return drinkDetails;
    }

    public double getPrice() {
            return price;
    }
}
