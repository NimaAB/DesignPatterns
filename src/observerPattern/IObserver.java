package observerPattern;

public interface IObserver {
    void update();
}

class Display implements IObserver{
    private final WeatherStation weatherStation;

    public Display(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }
    @Override
    public void update() {
        String newData = weatherStation.toString();
        printData(newData);
    }
    private void printData(String data){
        System.out.println(data);
    }
}
