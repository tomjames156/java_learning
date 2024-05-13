public class Rectangle extends Shape{

    public float calculateArea(){
        float area = length * height;
        System.out.println("Area of the rectangle is " + area + " m squared");

        return area;
    }
}