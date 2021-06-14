import entity.ex1part3.Rectangle;

public class Ex1Part3 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3,7);
        rectangle1.display();
        rectangle1.setHeight(6);
        rectangle1.setWidth(2);
        System.out.printf("Perimeter of this rectangle: %d\nArea of this rectangle: %d", rectangle1.getPerimeter(), rectangle1.getArea());
    }
}
