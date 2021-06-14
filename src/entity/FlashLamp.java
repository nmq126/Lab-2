package entity;

public class FlashLamp {
    private boolean status;
    private Battery battery;

    public FlashLamp(){
        status = false;
    }

    public int  getBatteryInfo() {
        return battery.getEnergy();
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void light(){
        if (status == true && battery != null && battery.getEnergy() > 0){
            battery.decreaseEnergy();
        }
    }
    public void turnOn(){
        if (battery != null && battery.getEnergy() > 0){
            status =  true;
        }
        light();
    }
    public void turnOff(){
        status = false;
    }
}
