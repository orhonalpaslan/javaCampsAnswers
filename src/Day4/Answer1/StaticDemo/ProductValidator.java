package Day4.Answer1.StaticDemo;

public class ProductValidator {
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;

        }
    }
}
