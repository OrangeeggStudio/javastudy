package creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable{
    private List<String> carList;

    public Car() {
        this.carList = new ArrayList<>();
    }

    public Car(List<String> carList) {
        this.carList = carList;
    }

    public List<String> getCarList() {
        return carList;
    }

    public void initLoad() {
        this.carList.add("truck");
        this.carList.add("bus");
        this.carList.add("taxi");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Car(new ArrayList<>(this.carList));
    }

    @Override
    public String toString() {
        return "Car{" +
                "carList=" + carList +
                '}';
    }
}
