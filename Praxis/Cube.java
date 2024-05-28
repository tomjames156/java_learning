import utilities.*;

public class Cube{
    int length;

    public Cube(int _length){
        length = _length;
    }

    public int volume(){
        return MathHelper.cube(length);
    }

    public static void main(String[] args){

        Cube rubiksCube = new Cube(4);
        System.out.println("Your cube is " + rubiksCube.volume() + "m^3 in volume");
    }
}