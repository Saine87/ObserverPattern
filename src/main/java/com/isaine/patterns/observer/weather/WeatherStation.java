package com.isaine.patterns.observer.weather;

import java.util.Observable;

public class WeatherStation extends Observable {

    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherStation( double temperature, double humidity, double pressure ) {
        setChangement( temperature, humidity, pressure );
    }

    public void setChangement( double temperature, double humidity, double pressure ) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
        clearChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

}
