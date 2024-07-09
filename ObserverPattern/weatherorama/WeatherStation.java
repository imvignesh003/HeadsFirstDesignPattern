package weatherorama;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setTemperature(80,65,30.4f);
        weatherData.setTemperature(82,70,29.2f);
        weatherData.setTemperature(78,90,29.2f);
    }
}
