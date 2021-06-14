import entity.ex2part3.Temperature;

public class Ex2Part3 {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(31);
        temperature.setCTemp(25);
        System.out.printf("Temperature in F: %f\nTemperature in K: %.2f", temperature.getFTemp(), temperature.getKTemp());
    }
}
