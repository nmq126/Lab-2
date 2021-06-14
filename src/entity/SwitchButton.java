package entity;

public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwitchButton() {
        status = false;
    }

    public void connectToLamp(ElectricLamp electricLamp){
        this.lamp = electricLamp;
    }

    public void switchOn(){
        status = true;
        lamp.turnOn();
    }

    public void switchOff(){
        status = false;
        lamp.turnOff();
    }
}
