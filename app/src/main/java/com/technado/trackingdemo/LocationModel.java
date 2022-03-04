package com.technado.trackingdemo;

public class LocationModel {
    public double latitude;
    public double longitude;
    public float bearing;

    public LocationModel(double latitude, double longitude, float bearing) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.bearing = bearing;
    }
}
