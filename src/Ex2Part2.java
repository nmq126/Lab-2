import entity.Battery;
import entity.FlashLamp;

public class Ex2Part2 {
    public static void main(String[] args) {
        Battery battery = new Battery();
        FlashLamp flashLamp = new FlashLamp();
        flashLamp.setBattery(battery);
        for (int i = 0; i < 10; i++) {
            flashLamp.turnOn();
            flashLamp.turnOff();
        }
        System.out.println("Remaining battery power: " + flashLamp.getBatteryInfo());
    }
}
