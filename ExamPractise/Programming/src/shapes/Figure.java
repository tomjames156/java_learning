package shapes;

public abstract class Figure {
    double dim1;
    double dim2;

    public Figure(double _dim1, double _dim2){
        dim1 = _dim1;
        dim2 = _dim2;
    }

    public abstract double area();
}
