package interfaces;

import models.Product;

public interface IProduct {
    void creatProduct(Product product);
    void viwProduct();
    void viewAllProduct(int index);
    void updateProduct(int index, Product productAtt);
    void deleteProduct(int index);
}
