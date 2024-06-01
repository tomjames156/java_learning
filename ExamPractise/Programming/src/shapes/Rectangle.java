package shapes;

public class Rectangle extends Figure{
    
    public Rectangle(double _dim1, double _dim2){
        super(_dim1, _dim2);
    }

    @Override
    public double area(){
        System.out.println("Calculating rectangle's area");
        return dim1 * dim2;
    }
}
