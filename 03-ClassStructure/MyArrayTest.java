import java.util.Arrays;

public class MyArrayTest {
    public static void main(String[] args) {
        // int[] array = {1,2,3,4,5,6,7,8,9,-2,-3,-4,-5};
        int[] array = {1,2,3,7,6};
        int[] array2 = {1,2,3,4,5,6,7,8,-1,-2,-3,-4,5};
        int[][] array2d = {
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4}
        };
        System.out.println(MyArray.even(array));
        System.out.println(MyArray.positiveOdd(array));
        System.out.println(Arrays.toString(MyArray.reverse(array)));
        System.out.println(MyArray.compare(array, array2));
        System.out.println(Arrays.toString(MyArray.different(array, array2)));
        System.out.println(MyArray.secondMax(array));
        System.out.println(MyArray.lastColumn(array2d));
        System.out.println(Arrays.deepToString(MyArray.swap(array2d)));
        System.out.println(Arrays.toString(MyArray.two2one(array2d)));
    }
}
