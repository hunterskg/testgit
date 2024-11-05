public class Furniture {
    private String name;
    private int price;

    public Furniture() {
    }

    public Furniture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name + ", " + price ;
    }
    
    
}