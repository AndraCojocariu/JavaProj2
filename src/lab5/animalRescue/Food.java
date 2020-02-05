package lab5.animalRescue;

public class Food {
    private String name;
    private float price;
    private int quantity;
    private boolean inStock;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public boolean getInStock() {
        return inStock;
    }
    public void foodMethod (){
        System.out.println("The food for animals is in the car");
    }

}

