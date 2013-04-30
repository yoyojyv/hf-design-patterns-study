package strategy.sample.before;

public class TicoFactory implements CarFactory {

    @Override
    public Car makeCar() throws Exception {
        return new Car("tico", "1000원");
    }
}
