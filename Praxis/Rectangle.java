import utilities.*;

public class Rectangle extends Shape{

    public float calculateArea(){
        float area = length * height;
        System.out.println("Area of the rectangle is " + area + " m squared");

        return area;
    }
}

class Square extends Rectangle{
        
    public float calculateArea(){
        int side = (int) length;
        int area = MathHelper.square(side);
        return (float)area;
    }
}