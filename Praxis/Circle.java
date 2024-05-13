public class Circle extends Shape{

    float radius;
    float diameter;

    public float calculateArea(){
        float pi = 22F / 7F;
        
        if(radius > 0){
            return pi * radius * radius;
        }

        if(diameter > 0 ){
            return pi * diameter * diameter * 0.25F;
        }

        return 0F;
    }
}