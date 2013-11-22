package com.isaine.patterns.observer;

import com.isaine.patterns.observer.display.Display;
import com.isaine.patterns.observer.display.impl.ConditionDisplay;
import com.isaine.patterns.observer.display.impl.ForcastDisplay;
import com.isaine.patterns.observer.display.impl.StatisticsDisplay;
import com.isaine.patterns.observer.weather.WeatherStation;

public class Test {

    public static void main( String[] args ) {

        // Observable
        WeatherStation ws = new WeatherStation( 25.5, 3.2, 5.5 );

        // Observer
        Display cd = new ConditionDisplay( ws );
        Display fd = new ForcastDisplay( ws );
        Display sd = new StatisticsDisplay( ws );

        ws.setChangement( 30, 20, 30.2 );
        ws.setChangement( 50.5, 64, 22 );
        ws.setChangement( 85, 87, 555 );

    }

}
