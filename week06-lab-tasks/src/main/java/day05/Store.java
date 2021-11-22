package day05;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<ProductWithPiece> numberOfProductsByType() {
        List<ProductWithPiece> result = new ArrayList<>();
        for (Product actual : products) {
            ProductWithPiece productWithPiece = containsProduct(actual, result);
            if (productWithPiece != null) {
                productWithPiece.incrementCount();

        } else {
                result.add(new ProductWithPiece(actual.getType()));
            }

    }
        return result;
}

    private ProductWithPiece containsProduct(Product actual, List<ProductWithPiece> productsPieceList) {
        for (ProductWithPiece pvp : productsPieceList) {
            if ((actual.getType()) == pvp.getType()) {
                return pvp;
            }
        }
        return null;
    }
}
