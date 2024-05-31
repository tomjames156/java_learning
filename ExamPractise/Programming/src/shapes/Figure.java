package shapes;

public class Figure {
    double dim1;
    double dim2;

    public Figure(double _dim1, double _dim2){
        dim1 = _dim1;
        dim2 = _dim2;
    }

    public double area(){
        System.out.println("No Area specified for Figure");
        return 0;
    }
}
