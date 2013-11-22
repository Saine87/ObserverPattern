package com.isaine.patterns.observer.display.impl;

import com.isaine.patterns.observer.display.Display;
import com.isaine.patterns.observer.weather.WeatherStation;

public class StatisticsDisplay extends Display {

    public StatisticsDisplay( WeatherStation ws ) {
        super( ws );
    }

    @Override
    public void show() {
        System.out.println( "Statistics display: ( " + ws.getTemperature() + " , " + ws.getHumidity() + " , "
                + ws.getPressure() + " )" );
    }

}
