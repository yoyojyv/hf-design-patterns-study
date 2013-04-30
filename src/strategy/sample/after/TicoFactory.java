package strategy.sample.after;

public class TicoFactory implements CarFactory {

    @Override
    public Car makeCar() throws Exception {
        return new Car("tico", "1000원");
    }
}
