import entity.ex3part3.ElectricLamp;
import entity.ex3part3.SwitchButton;

public class Ex3Part3 {
    public static void main(String[] args) {
        SwitchButton switchButton = new SwitchButton();
        ElectricLamp electricLamp = new ElectricLamp();
        switchButton.connectToLamp(electricLamp);
        for (int i = 0; i < 10; i++) {
            switchButton.switchOn();
            switchButton.switchOff();
        }
    }
}
