import java.io.PrintStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      Shape shape = new Shape() {};
//      System.out.println(shape.toString());
//      System.out.println("*********************************************");

        System.out.println("The Circle: ");
        Circle c1 = new Circle("blue",true,5.0);
        System.out.println("The Radius is: "+ c1.getRadius());
        System.out.println("Area: " +String.format("%.2f%n", c1.calculateArea()));
        System.out.println("Circumference: "+String.format("%.2f%n",c1.calculateCircumference()));
        System.out.println("*********************************************");

        c1.setRadius(25.0);
        System.out.println("Radius after set is: " + c1.getRadius());
        System.out.printf("Area: "+String.format("%.2f%n", c1.calculateArea()));
        System.out.printf("Circumference: "+String.format("%.2f%n", c1.calculateCircumference()));
        System.out.println("*********************************************");
///////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("The Rectangle: ");
        Rectangle r1 = new Rectangle(25.0,21.0);
        System.out.println("The Width is: "+ r1.getWidth());
        System.out.println("The Height is: "+ r1.getHeight());
        System.out.printf("Area: "+String.format("%.2f%n",r1.calculateArea()));
        System.out.printf("Circumference: "+String.format("%.2f%n",r1.calculateCircumference()));
        System.out.println("*********************************************");

        r1.setWidth(15.0);
        System.out.println("The Width after set is: "+ r1.getWidth());
        System.out.println("The Height is: "+ r1.getHeight());
        System.out.printf("Area: "+String.format("%.2f%n", r1.calculateArea()));
        System.out.printf("Circumference: "+String.format("%.2f%n", r1.calculateCircumference()));
        System.out.println("*********************************************");
///////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.printf("The Triangle: ");
        Triangle t1= new Triangle(15.0,15.0);
        System.out.println("The base is: "+ t1.getBase());
        System.out.println("The Height is: "+ t1.getHeight());
        System.out.printf("Area: "+String.format("%.2f%n", t1.calculateArea()));
        System.out.printf("Circumference: "+String.format("%.2f%n", t1.calculateCircumference()));
        System.out.println("*********************************************");

        t1.setBase(10.0);
        System.out.println("The base after set is: "+ t1.getBase());
        System.out.println("The Height is: "+ t1.getHeight());
        System.out.printf("Area: "+String.format("%.2f%n", t1.calculateArea()));
        System.out.printf("Circumference: "+String.format("%.2f%n", t1.calculateCircumference()));
        System.out.println("*********************************************");









    }
    }



