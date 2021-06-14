package entity.ex3part3;

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
