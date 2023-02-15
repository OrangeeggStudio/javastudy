package creation.prototype;

import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car();
        car1.initLoad();

        Car car2 = (Car) car1.clone();
        Car car3 = (Car) car1.clone();

        List<String> car2List = car2.getCarList();
        List<String> car3List = car3.getCarList();

        car2List.add("suv");
        car3List.remove("truck");

        System.out.println("car1 : " + car1.toString());
        System.out.println("car2 : " + car2.toString());
        System.out.println("car3 : " + car3.toString());
    }
}
