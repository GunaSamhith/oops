class Product {
    private String productName;
    private double price;

        public String getProductName() {
        return productName;
    }

       public void setProductName(String productName) {
        if (productName != null && !productName.isEmpty()) {
            this.productName = productName;
        } else {
            System.out.println("Invalid product name");
        }
    }

   
    public double getPrice() {
        return price;
    }

   
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than zero");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        product.setProductName("Laptop");
        product.setPrice(1200.50);

        product.setProductName("");
        product.setPrice(-100);

        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product Price: " + product.getPrice());
    }
}