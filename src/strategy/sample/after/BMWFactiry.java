package strategy.sample.after;

public class BMWFactiry implements CarFactory {

    @Override
    public Car makeCar() throws Exception {
        return new Car("BMW", "50000원");
    }

}
