package com.selflearning.design.pattern;

public class Facade {
    private Camera camera;
    private Light light;
    private Sensor sensor;
    private Alarm alarm;

    public Facade() {
        camera = new Camera();
        light = new Light();
        sensor = new Sensor();
        alarm = new Alarm();
    }

    public void activate() {
        camera.turnOn();
        light.turnOn();
        sensor.activate();
        alarm.activate();
    }

    public void deactivate() {
        camera.turnOff();
        light.turnOff();
        sensor.deactivate();
        alarm.deactivate();
    }
}

class Camera {
    public void turnOn() {
        System.out.println("Turn on camera");
    }

    public void turnOff() {
        System.out.println("Turn off camera");
    }

    public void rotate(int degree) {
        System.out.println("Rotate the camera by " + degree + " degree");
    }
}

class Light {

    public void turnOff()
    {
        System.out.println("Turning on the light.");
    }

    public void turnOn()
    {
        System.out.println("Turning off the light.");
    }

    public void changeBulb()
    {
        System.out.println("changing the light-bulb.");
    }
}

class Sensor {
    public void activate()
    {
        System.out.println("Activating the sensor.");
    }

    public void deactivate()
    {
        System.out.println("Deactivating the sensor.");
    }

    public void trigger()
    {
        System.out.println("The sensor has triggered.");
    }
}

class Alarm {

    public void activate()
    {
        System.out.println("Activating the alarm.");
    }

    public void deactivate()
    {
        System.out.println("Deactivating the alarm.");
    }

    public void ring()
    {
        System.out.println("Ringing the alarm.");
    }

    public void stopRing()
    {
        System.out.println("Stop the alarm.");
    }
}