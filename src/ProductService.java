import java.util.ArrayList;

public class ProductService {
    private ArrayList<Product> list;

    public ProductService() {
        this.list = new ArrayList<>();
    }

    public void creatProduct(Product product) {
        list.add(product);
    }

    public void viwProduct() {
        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }
    }

    public void viewAllProduct(int index) {
        Product product = list.get(index);
        System.out.printf("""
                Name: %s
                Category: %s
                Price: %d
                Description %s
                """, index, product.getName(), product.getCategory(), product.getPrice(), product.getDescription());
    }

    public void updateProduct(int index, Product productAtt) {
        Product product = list.get(index);
        product.setName(productAtt.getName());
        product.setCategory(productAtt.getCategory());
        product.setPrice(productAtt.getPrice());
        product.setDescription(productAtt.getDescription());
        System.out.println(product + "updated successfully");
    }

    public void deleteProduct(int index) {
        Product product = list.remove(index);
        System.out.println(product + "successfully deleted");
    }
}
