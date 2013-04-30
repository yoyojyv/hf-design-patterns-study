package strategy.sample.after;

public class CarMarket {

    public Car carDisplay(CarFactory factory) throws Exception{
        Car madeCar = factory.makeCar();
        return madeCar;
    }

}
