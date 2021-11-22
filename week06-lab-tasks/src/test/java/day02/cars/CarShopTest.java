package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarShopTest {

    CarShop carShop = new CarShop("Trabant", 5_000_000);
    Car car1;
    Car car2;

    @BeforeEach
    void init() {
        car1 = new Car("KIA", 1.6, Color.GREY, 1_000_000);
        car2 = new Car("Lancer", 1.6, Color.BLACK, 5_000_000);
        carShop.addCar(car1);
        carShop.addCar(car2);
    }

    @Test
    void getCarsForSellTest() {
        assertEquals(2, carShop.getCarsForSell().size());
    }

    @Test
    void sumCarPriceTest() {
        assertEquals(6_000_000, carShop.sumCarPrice());
    }

    @Test
    void decreasePriceAndSumTest() {
        car2.decreasePrice(20);
        assertEquals(4_000_000, carShop.getCarsForSell().get(1).getPrice());
    }

    @Test
    void numberOfCarsCheaperThanTest(){
        assertEquals(1, carShop.numberOfCarsCheaperThan(3_000_000));
    }

    @Test
    void carsWithBrandTest() {
        assertEquals(1, carShop.carsWithBrand("KIA").size());
    }



}
