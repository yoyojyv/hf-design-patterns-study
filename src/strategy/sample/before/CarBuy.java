package strategy.sample.before;

public class CarBuy {

    public static void main(String[] args) throws Exception{
        CarMarket market = new CarMarket ();
        Car ticoCar = market.carDisplay("tico");
        System.out.println(ticoCar.getName() + " : "+ ticoCar.getPrice());
    }
}
