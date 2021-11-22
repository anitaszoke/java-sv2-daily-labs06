package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static day05.Type.DIARY;
import static day05.Type.FROZEN;
import static org.junit.jupiter.api.Assertions.*;

public class ProductWithPieceTest {
    ProductWithPiece productWithPiece;

    @BeforeEach
    void setUp() {
        productWithPiece = new ProductWithPiece(DIARY);
    }
    @Test
    void testGetType() {
        assertEquals(DIARY, productWithPiece.getType());
        assertNotEquals(FROZEN, productWithPiece.getType());
    }

    @Test
    void testGetCount() {
        assertEquals(1, productWithPiece.getCount());
        assertNotEquals(2, productWithPiece.getCount());
    }

    @Test
    void testIncrementCount() {
        productWithPiece.incrementCount();
        productWithPiece.incrementCount();
        assertEquals(3,productWithPiece.getCount());

    }
}
