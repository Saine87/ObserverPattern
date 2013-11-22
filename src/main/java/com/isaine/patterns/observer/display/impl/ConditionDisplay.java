package com.isaine.patterns.observer.display.impl;

import com.isaine.patterns.observer.display.Display;
import com.isaine.patterns.observer.weather.WeatherStation;

public class ConditionDisplay extends Display {

    public ConditionDisplay( WeatherStation ws ) {
        super( ws );
    }

    @Override
    public void show() {
        System.out.println( "Condition display: ( " + ws.getTemperature() + " , " + ws.getHumidity() + " , "
                + ws.getPressure() + " )" );
    }

}
