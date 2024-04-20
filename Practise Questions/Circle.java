public class Circle extends Shape{
    float radius;
    
    @override static float calculateArea(){
        float area = (22/7) * radius * radius;
        return area;
    }
}