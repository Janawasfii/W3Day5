public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
    this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;

    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;

    }

    //The accessor will return the value of the radius instance variable, and
    //should be named getRadius().
    public double getRadius() {
            return radius;
        }
    //The mutator should take in a double that can change the radius for a given
    //Circle object, and should be named setRadius().
    public void setRadius(double newRadius) {
            radius = newRadius;
        }



}
