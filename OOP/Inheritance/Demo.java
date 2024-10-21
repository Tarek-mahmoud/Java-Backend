
public class Demo {

    public static void main(String[] args) {
        Product product = new Phone();
        // I can initialize variable of interface type with a reference to an object of any other class which implements this interface
        product.setName("Nokia 1100");
        System.out.println("Product name: " + product.getName());
        System.out.println("Remaining amount in stock: " + product.calculateRemainingAmount());

        // product.ring();

        Phone phone = new Phone();
        phone.ring();

        if (product instanceof Phone) {
            // instanceof => allows you to check the type consistency with the object
            Phone phone2 = (Phone) product;
            phone2.ring();
        }

        System.out.println(phone.calculateAmountOfVariants());
    }
}
