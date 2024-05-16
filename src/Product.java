
// Özellik  tutan class
// POJO -> Plain Old Java Object
// SOLID -> Single Responsibility
public class Product {
    public Product() {
    }

    public Product(String productName, double price, int stock, String category) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    // okuma metodu , yazma metodu
    // getter ,       setter
    private String productName;
    private   double price;

    private int stock;

    private String category;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
            this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
            this.stock = stock;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Product{" +
                "ürün adı='" + productName + '\'' +
                ", değeri=" + price +
                ", stok=" + stock +
                ", kategori='" + category + '\'' +
                '}';
    }

}
