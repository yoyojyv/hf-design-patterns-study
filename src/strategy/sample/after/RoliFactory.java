package strategy.sample.after;

public class RoliFactory implements CarFactory {

    @Override
    public Car makeCar() throws Exception {
        return new Car("roli!", "1,000,000원");
    }

}
