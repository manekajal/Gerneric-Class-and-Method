package generic;

public class MaximumFloat {


    public static <E extends Comparable<E>> E toMax(E x, E y, E z) {
        E max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;


    }
    public static void main(String[] args){
        System.out.printf(("Maximum number of %f, %f and %f is : %f\n\n"),1.3,28.4, 5.0, toMax( 1.3, 28.4, 5.0 ));
    }




}
