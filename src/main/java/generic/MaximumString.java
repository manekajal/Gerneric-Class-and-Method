package generic;

public class MaximumString {


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
        System.out.printf(("Maximum String  of %s, %s and %s is : %s\n\n\n"),"kajal","Teju","Lata" , toMax( "kajal", "Teju", "Lata"));
    }

}
