package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void carTest() {
        Car car = new Car("KIA", 1.6, Color.GREY, 1_000_000);
        assertEquals("KIA", car.getBrand());
        assertEquals(1.6, car.getEngineSize());
        assertEquals(Color.GREY, car.getColor());
        assertEquals(1_000_000, car.getPrice());
    }

    @Test
    void decreasePriceTest() {
        Car car = new Car("KIA", 1.6, Color.GREY, 1_000_000);
        car.decreasePrice(20);
        assertEquals(800_000, car.getPrice());
    }

}
