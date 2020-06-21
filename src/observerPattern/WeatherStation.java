package observerPattern;

import java.util.ArrayList;

class WeatherStation implements ISubject{

    ArrayList<IObserver> observers = new ArrayList<>();
    @Override
    public void attach(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        this.observers.forEach(IObserver::update);
        // same as:
        // for(IObserver o:observers){
        //     o.update();
        // }
    }

    private int temprature;
    private String wind;

    public void setTemprature(int temprature) {
        this.temprature = temprature;
    }

    private int getTemprature(){
        return this.temprature;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    private String getWind() {
        return this.wind;
    }

    @Override
    public String toString() {
        return "WeatherStation {"+
                "\n\ttemprature= " + getTemprature() +
                "\n\twind= " + getWind() + "\n}";
    }

}