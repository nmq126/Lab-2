package entity;

public class ElectricLamp {
    private boolean status;

    public ElectricLamp() {
        status = false;
    }

    public void turnOn(){
        status = true;
    }

    public void turnOff(){
        status = false;
    }
}
