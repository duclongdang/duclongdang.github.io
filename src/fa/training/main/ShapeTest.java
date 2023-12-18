package fa.training.main;

import fa.training.entities.Rectangle;

import java.util.Scanner;

public class ShapeTest {
   public static final Scanner sc=new Scanner(System.in);
   public Rectangle[] inputLengthWidth(){
       int len;
       len=inputNumber("number of rectangles: ");
       Rectangle[] rectangles = new Rectangle[len];
       for (int i = 0; i < len; i++) {
         rectangles[i]=new Rectangle();
         rectangles[i].setLength(inputNumber(" length of rectangle "+(i+1)+": "));
         rectangles[i].setWidth(inputNumber(" width of rectangle "+(i+1)+": "));

       }
       return rectangles;
   }
   public int inputNumber(String input){
      int num;
       while(true){
          try{
             System.out.println("Enter "+input);
             num=Integer.parseInt(sc.nextLine());
             if(num>0){
                break;
             }
             if(num<=0){
                 System.out.println("number must be higher than 0!");
             }
          }catch(Exception e){
             System.out.println("invalid input!");
          }
       }
      return num;
   }
   public void display(Rectangle[] rectangles){
       System.out.println("information");
      for (int i = 0; i < rectangles.length; i++) {
         System.out.println(rectangles[i].toString());
      }
   }
   public void findMaxArea(Rectangle[] rectangles){
       int result=0;
       for (Rectangle rectangle : rectangles) {
           if(result<= rectangle.calculateArea()){
               result=rectangle.calculateArea();
           }
       }
       System.out.println("Rectangles has max Area");
       for (Rectangle rectangle: rectangles
            ) {
           if(result==rectangle.calculateArea()){
               System.out.println(rectangle);
           }
       }
   }
    public void findMinPerimeter(Rectangle[] rectangles){

        int result=0;
        for (Rectangle rectangle : rectangles) {
            if(result<= rectangle.calculatePerimeter()){
                result=rectangle.calculatePerimeter();
            }
        }
        System.out.println("Rectangles has min Perimeter");
        for (Rectangle rectangle: rectangles
        ) {
            if(result==rectangle.calculatePerimeter()){
                System.out.println(rectangle);
            }
        }
    }
}
