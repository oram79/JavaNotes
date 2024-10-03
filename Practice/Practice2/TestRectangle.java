package Practice.Practice2;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(7.5, 4.5);

        System.out.println("Rectangle 1 Area: " + rect1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + rect1.getPerimeter());
        System.out.println("Rectangle 2 Area: " + rect2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + rect2.getPerimeter());
    }
}

