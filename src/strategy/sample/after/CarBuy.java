package strategy.sample.after;

public class CarBuy {

    public static void main(String[] args) throws Exception{
        CarMarket market = new CarMarket();
        Car roliCar = market.carDisplay(new RoliFactory());
        System.out.println(roliCar.getName() + " : "+ roliCar.getPrice());
    }

}
