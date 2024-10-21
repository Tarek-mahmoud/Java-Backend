
public class Product {

    private int id;
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public int calculateRemainingAmount() {
        return 100;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] listVariants() {
        // some code that fetches the variant product from database
        return new Product[3];  // just a fake return object from the sake of example
    }
}
