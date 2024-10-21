
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Cart {

    private static final int DEFAULT_CART_CAPACITY = 10;
    private static final int MONEY_SCALE = 2;
    private static final double DEFAULT_TAX_RATE = 0.15;
    private static final String DEFAULT_TAX_TYPE = "increment";
    private static final double DEFAULT_DISCOUNT_RATE = 0;
    private static final String DEFAULT_DISCOUNT_NAME = "zeroDiscount";

    private static int cartCounter;

    private int id;
    private int userId;
    private Tax tax;
    private Discount discount;
    private Product[] products;
    private BigDecimal totalNetPrice;
    private BigDecimal totalGrossPrice;
    private BigDecimal totalTax;
    private int indexToAddNewProduct;

    static {
        System.out.println("Cart.class is uploaded into JVM");
    }

    {
        cartCounter++;
        userId = 1;
        tax = new Tax(DEFAULT_TAX_TYPE, DEFAULT_TAX_RATE);
        discount = new Discount(DEFAULT_DISCOUNT_NAME, DEFAULT_DISCOUNT_RATE);
    }

    public Cart() {

    }

    public Cart(int id, int userId) {
        this.id = id;
        this.userId = userId;
    }

    public void addProduct(Product product) {
        if (product == null) {
            return;
        }
        if (products == null) {
            products = new Product[DEFAULT_CART_CAPACITY];
        }
        if (products.length < indexToAddNewProduct + 1) {
            products = Arrays.copyOf(products, products.length << 1);
        }
        products[indexToAddNewProduct++] = product;
        calculateTotalNetPrice();
        calculateTotalGrossPrice();
    }

    private BigDecimal calculateTotalNetPrice() {
        this.totalNetPrice = BigDecimal.valueOf(Arrays.stream(this.products)
                .mapToDouble(product -> product != null ? product.getPrice().doubleValue() : 0)
                .sum()).setScale(MONEY_SCALE, RoundingMode.HALF_UP);
        return this.totalNetPrice;
    }

    private BigDecimal calculateTotalGrossPrice() {
        if (this.totalNetPrice.doubleValue() < 0)
            calculateTotalNetPrice();
        BigDecimal orderDiscount = this.totalNetPrice
                .multiply(BigDecimal.valueOf(discount.getDiscountRate()))
                .setScale(MONEY_SCALE, RoundingMode.HALF_UP);
        this.totalTax = this.totalNetPrice.multiply(BigDecimal.valueOf(tax.getTaxRate()))
                .setScale(MONEY_SCALE, RoundingMode.HALF_UP);
        this.totalGrossPrice = this.totalNetPrice.add(this.totalTax).subtract(orderDiscount);
        return this.totalGrossPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            return;
        }
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        if (userId < 0) {
            return;
        }
        this.userId = userId;
    }

    public Product[] getProducts() {
        return Arrays.copyOf(products, products.length);
    }

    public int getIndexOfProductAdded() {
        return indexToAddNewProduct;
    }

    public static int getCartCounter() {
        return cartCounter;
    }

    public BigDecimal getTotalNetPrice() {
        return totalNetPrice;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Cart [id=" + id + ", userId=" + userId + ", totalNetPrice="
                + totalNetPrice + ", totalGrossPrice=" + totalGrossPrice + ", totalTax="
                + totalTax + ", products=" + Arrays.toString(products)
                + ", indexOfLastProductAdded=" + indexToAddNewProduct + "]";
    }


    public static class Tax {
        private String taxType;
        private double taxRate;

        Tax(String taxType, double taxRate) {
            this.taxType = taxType;
            this.taxRate = taxRate;
        }

        public void setTaxType(String taxType) {
            this.taxType = taxType;
        }

        public void setTaxRate(double taxRate) {
            this.taxRate = taxRate;
        }

        public String getTaxType() {
            return taxType;
        }

        public double getTaxRate() {
            return taxRate;
        }
    }

    public class Discount {
        private String discountType;
        private double discountRate;

        Discount(String discountType, double discountRate) {
            this.discountType = discountType;
            this.discountRate = discountRate;
        }

        public void setDiscountType(String discountType) {
            this.discountType = discountType;
        }

        public void setDiscountRate(double discountRate) {
            this.discountRate = discountRate;
        }

        public String getDiscountType() {
            return discountType;
        }

        public double getDiscountRate() {
            return discountRate;
        }
    }
}
