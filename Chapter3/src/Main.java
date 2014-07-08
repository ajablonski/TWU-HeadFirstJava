import java.util.Random;

class Rectangle {
    double height;
    double width;

    double getArea() {
        return height * width;
    }
}

public class Main {

    public static void main(String[] args) {
        int seed = 0;
        int arraySize = 5;
        Rectangle [] rects = new Rectangle[arraySize];
        Random generator = new Random(seed);

        for (int i = 0; i < rects.length; i++) {
            rects[i] = new Rectangle();
            rects[i].height = generator.nextInt(10) + 1;
            rects[i].width = generator.nextInt(10) + 1;

            System.out.print("Rectangle " + i + " ");
            System.out.print("has height " + rects[i].height + " , ");
            System.out.print("width " + rects[i].width + " , and ");
            System.out.println("area " + rects[i].getArea() + " .");
        }

        double totalArea = 0;
        for (int i = 0; i < rects.length; i++) {
            totalArea += rects[i].getArea();
        }

        double avgArea = totalArea / rects.length;

        System.out.println("Average area is " + avgArea + " .");
    }
}
