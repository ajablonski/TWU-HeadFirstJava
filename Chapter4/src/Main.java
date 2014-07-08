import java.util.Random;

class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public double getArea() {
        return width * height;
    }
}

public class Main {

    public static void main(String[] args) {
        int seed = 0;
        int arraySize = 5;
        Rectangle [] rects = new Rectangle[arraySize];
        Random generator = new Random(seed);

        for (int i = 0; i < rects.length; i++) {
            double h = generator.nextInt(10) + 1;
            double w = generator.nextInt(10) + 1;
            rects[i] = new Rectangle(h, w);

            System.out.print("Rectangle " + i + " ");
            System.out.print("has height " + rects[i].getHeight() + " , ");
            System.out.print("width " + rects[i].getWidth() + " , ");
            System.out.print("area " + rects[i].getArea() + " , and ");
            System.out.println("perimeter " + rects[i].getPerimeter() + " . ");
        }

        double totalArea = 0;
        double totalPerimeter = 0;
        for (int i = 0; i < rects.length; i++) {
            totalArea += rects[i].getArea();
            totalPerimeter += rects[i].getPerimeter();
        }

        System.out.println("Total area is " + totalArea + " .");
        System.out.println("Total perimeter is " + totalPerimeter + " .");
    }
}
