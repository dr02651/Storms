package com.devodriqroberts.storms.Models;

public class Forecast {
    private Current current;
    private Hourly[] hourlyForecast;

    public Forecast(Current currentWeather, Hourly[] hourlyForecast) {
        this.current = currentWeather;
        this.hourlyForecast = hourlyForecast;
    }

    public Current getCurrent() {
        return current;
    }

    public Hourly[] getHourlyForecast() {
        return hourlyForecast;
    }
}
