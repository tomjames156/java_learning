package shapes;

public class Triangle extends Figure{
    
    public Triangle(double _dim1, double _dim2){
        super(_dim1, _dim2);
    }

    @Override
    public double area(){
        System.out.println("Calculating triangle's area");
        return dim1 * dim2 * 0.5;
    }
}
