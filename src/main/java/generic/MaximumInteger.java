package generic;

public class MaximumInteger  {

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
        System.out.printf(("Maximum number of %d, %d and %d is : %d\n\n"),13,284, 5, toMax( 13, 284, 5 ));
    }


}