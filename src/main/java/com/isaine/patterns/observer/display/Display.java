package com.isaine.patterns.observer.display;

import java.util.Observable;
import java.util.Observer;

import com.isaine.patterns.observer.weather.WeatherStation;

public abstract class Display implements Observer {

    protected WeatherStation ws;

    public Display( WeatherStation ws ) {
        this.ws = ws;
        ws.addObserver( this );
    }

    public void update( Observable o, Object arg ) {
        if ( !( o instanceof WeatherStation ) )
            throw new ClassCastException();
        WeatherStation ws = (WeatherStation) o;
        show();
    }

    public abstract void show();

}
