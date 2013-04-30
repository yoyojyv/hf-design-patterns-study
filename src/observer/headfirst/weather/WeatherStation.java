package observer.headfirst.weather;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        System.out.println("1. weatherData 세팅.");
		weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("2. weatherData 변경.");
		weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("3. weatherData 변경.");
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
