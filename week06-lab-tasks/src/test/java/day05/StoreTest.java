package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    Store store;

    @BeforeEach
    void setUp() {
        store = new Store();
        store.addProduct(new Product("Milk", Type.DIARY, 250));
        store.addProduct(new Product("Butter", Type.DIARY, 450));
    }

    @Test
    void testNumberOfProductsByType() {
        List<ProductWithPiece> result = store.numberOfProductsByType();

        assertEquals(1, result.size());
        assertEquals(Type.DIARY, result.get(0).getType());
        assertEquals(2, result.get(0).getCount());
    }
}
