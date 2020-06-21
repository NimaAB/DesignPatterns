package observerPattern;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        IObserver phoneDisplay = new Display(weatherStation);

        weatherStation.setTemprature(24);
        weatherStation.setWind("2 m/s north");

        phoneDisplay.update();
        IObserver tvDisplay = new Display(weatherStation);
        tvDisplay.update();
    }
}
