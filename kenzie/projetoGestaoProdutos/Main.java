import src.products.ProductController;
import src.products.ProductModel;

public class Main {
    static String searchCode = "3127698";
    public static void main(String[] arg){
        ProductController productController = new ProductController();
        ProductModel payload = new ProductModel("111", "AAA", 123, 10);
        ProductModel payload2 = new ProductModel("222", "BBB", 123, 10);
        ProductModel payload3 = new ProductModel("222", "BBB", -123, 10);
        
        
        productController.create(payload);
        productController.create(payload2);
        productController.create(payload3);
        productController.read();
        
    }
}

