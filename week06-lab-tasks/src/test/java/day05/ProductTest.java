package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductTest {

    Product product;
    Type type;

    @BeforeEach
    void setUp() {
        product = new Product("Milk", Type.DIARY, 250 );
    }

    @Test
    void testGetName() {
        assertEquals("Milk",product.getName());
    }

    @Test
    void testGetType() {
        assertEquals(Type.DIARY, product.getType());
    }

    @Test
    void testGetPrice() {
        assertEquals(250,product.getPrice(), 0.005);
    }
}
