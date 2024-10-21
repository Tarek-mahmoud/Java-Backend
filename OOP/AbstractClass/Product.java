
/*
    Abstraction is a process of hiding the implementation details and showing only functionality to the user.
    Abstraction lets you focus on what the object does instead of how it does it.
    can't create an instance of abstract class  => It cannot be instantiated.
    It can have final methods which will force the subclass not to change the body of the method.
 */

public abstract class Product {
    private int id;
    private String name;
    private int minOrderQuantity;
    private boolean isDeliveryAvailable;

    //public  boolean isAvailableInStock();
    public abstract boolean isAvailableInStock();
    // note: we can't use abstract method in a non-abstract class

    public int getRemainingAmountInStock() {
        // here goes some code witch checks amount of products in DB
        return 100;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMinOrderQuantity() {
        return minOrderQuantity;
    }

    public boolean isDeliveryAvailable() {
        return isDeliveryAvailable;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinOrderQuantity(int minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public void setDeliveryAvailable(boolean deliveryAvailable) {
        isDeliveryAvailable = deliveryAvailable;
    }
}
