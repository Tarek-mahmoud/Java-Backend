
public class    Phone extends Product {
    // error after extended Product class because I should declare default constructor for Product class

    // Default constructor
    public Phone() {
        super("Nokia");
        // Call to 'super()' must be first statement in child constructor body
        System.out.println("Some code here");
    }

    public void ring() {
        System.out.println("Ring");
    }

    @Override
    public Product[] listVariants() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int calculateAmountOfVariants() {
        // return listVariants().length;  // Exception
        return super.listVariants().length;
    }


}
