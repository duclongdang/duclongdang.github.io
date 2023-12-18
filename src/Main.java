import fa.training.entities.Rectangle;
import fa.training.main.ShapeTest;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ShapeTest shapeTest=new ShapeTest();
        Rectangle[] rectangles=shapeTest.inputLengthWidth();
        shapeTest.display(rectangles);
        shapeTest.findMaxArea(rectangles);
        shapeTest.findMinPerimeter(rectangles);
    }
//        ShapeTest shapeTest=new ShapeTest();
//        System.out.println(shapeTest.inputNumber("length"));

}
