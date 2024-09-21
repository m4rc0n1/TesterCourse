import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        //Array methods
        int[] array = {3,1,4,6,8};
        Arrays.sort(array); //1,3,4,6,8
        System.out.println(Arrays.toString(array));
        int[] newArray = Arrays.copyOf(array,10);
        System.out.println(Arrays.toString(newArray));
        int[] rangeArray = Arrays.copyOfRange(array,2,5);
        System.out.println(Arrays.toString(rangeArray));
        boolean isEqual = Arrays.equals(array,newArray);
        System.out.println(isEqual);
        Arrays.fill(array, 0);
        System.out.println(Arrays.toString(array));



    }
}
