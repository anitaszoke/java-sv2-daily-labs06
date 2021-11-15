package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {
    private List<Double> numberList = new ArrayList<>();

    public List<Double> getNumberList() {
        return numberList;
    }

    public void addNumber(double number) {
        numberList.add(number);
    }


}
