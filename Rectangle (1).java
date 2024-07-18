public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;}

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setheight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double calculateArea() {
        return width*height;
    }
    public double calculateCircumference() {
      return 2*(width + height);
    }
    public String toString() {
        return "A Rectangle with width=" + width + " and height=" + height + ", which is a subclass of " + super.toString();
    }
}
