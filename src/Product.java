public class Product {
    private String name;
    private String category;
    private double price;
    private String description;

    public Product(String name, String category, double price, String description ) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
