package com.isaine.patterns.observer.display.impl;

import com.isaine.patterns.observer.display.Display;
import com.isaine.patterns.observer.weather.WeatherStation;

public class ForcastDisplay extends Display {

    public ForcastDisplay( WeatherStation ws ) {
        super( ws );
    }

    @Override
    public void show() {
        System.out.println( "Forcast display: ( " + ws.getTemperature() + " , " + ws.getHumidity() + " , "
                + ws.getPressure() + " )" );
    }
}
