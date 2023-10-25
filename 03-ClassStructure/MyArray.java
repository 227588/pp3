import java.util.Arrays;

public class MyArray {
    public static int even(int[] array){
        int counter=0;
        for(int i : array)if(i%2==0)counter++;
        return counter;
    }
    public static int positiveOdd(int[] array){
        int counter=0;
        for(int i : array)if(i%2==1 && i>0)counter++;
        return counter;
    }
    public static int[] reverse(int[] array){
        int[] newArray = new int[array.length];
        int index = array.length;
        for(int i : array)newArray[--index]=i;
        return newArray;
    }
    public static boolean compare(int[] array1, int[] array2){
        return Arrays.equals(array1, array2);
    }
    public static int[] different(int[] array1, int[] array2){
        int[] newArray= new int[array1.length];
        int index=0;
        for(int i : array1){
            boolean exists = false;
            for(int j : array2)
                if(i==j){
                    exists = true;
                    break;
                }
            if(exists==false){
                newArray[index++]=i;
            }
        }
        return newArray;
    }
    public static boolean exist(int number, int[] array){
        for(int i : array)if(i==number)return true;
        return false;
    }
    public static int secondMax(int[] array){
        int firstMax = array[0];
        int secondMax = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>firstMax){
                secondMax=firstMax;
                firstMax=array[i];
            }
            if(array[i]>secondMax && array[i]<firstMax)secondMax=array[i];
        }
        return secondMax;
    }
    public static int lastColumn(int[][] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum += array[i][array[0].length-1];
        }
        return sum;
    }
    public static int[][] swap(int[][] array){
        for(int i=0; i<array.length; i++){
            int tmp = array[i][array[0].length-1];
            array[i][array[0].length-1] = array[i][0];
            array[i][0] = tmp; 
        }
        return array;
    }
    public static int[] two2one(int[][] array){
        int size=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                size++;
            }
        }

        int counter = 0;
        int[] newArray = new int[size];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                newArray[counter++]=array[i][j];
            }
        }
        return newArray;
    }
}
