public class B extends A{
    int k;

    public B(int a, int b, int c){
        super(a, b);
        k = c;
    }

    /**
     * desc: Prints out the i/x, j/y and k/z coordinates of B
     * @param NULL
     * @return void
     */

    public void show(){
        super.show();
        System.out.println("Point B (x, y, z) = " + "(" + i + ", " + j + ", " + k + ")");
    }
}