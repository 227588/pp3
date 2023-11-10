public class MyArrays {
    public static int odd(int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0 && array[i]%2==0)
                counter++;
        }
        return counter;
    }
    public static int above(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        int sum_=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>sum/array.length)
                sum_+=array[i];
        }
        return sum_;
    }
}
