package strategy.sample.before;

public class CarMarket {

    public Car carDisplay(String carName) throws Exception{
        CarFactory factory = null;
        if("tico".equals(carName)){
            factory = new TicoFactory();
        }else{
            factory = new BMWFactiry();
        }
        return factory.makeCar();
    }

}