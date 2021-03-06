import java.util.*;
abstract class Shape{
 int l,b;
 Shape(int len,int bre){
 l=len;
 b=bre;
 }
 abstract void printArea();
}
class Triangle extends Shape{
 Triangle(int base,int hei){
 super(base,hei);
 }
 void printArea() {
 double area = 0.5*l*b;
 System.out.println("Area of triangle = "+area);
 }
}
class Rectangle extends Shape{
 Rectangle(int len,int bre){
 super(len,bre);
 }

 void printArea() {
 double area = l*b;
 System.out.println("Area of rectangle = "+area);
 }
}
class Circle extends Shape{
 Circle(int radius){
 super(radius,radius);
 }

 void printArea() {
 double area = 3.14*(double)l*(double)b;
 System.out.println("Area of circle = "+area);
 }
}
public class Pro4 {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("Enter two values for triangle");
 Triangle t1 = new Triangle(input.nextInt(),input.nextInt());
 t1.printArea();
 System.out.println("Enter length & Breadth of rectangle");
 Rectangle r1 = new Rectangle(input.nextInt(),input.nextInt());
 r1.printArea();
 System.out.println("Enter the radius of circle");
 Circle c1 = new Circle(input.nextInt());
 c1.printArea();
 }
}
