public class Zad12 {
    public static int itemsInRange(int a, int b){
        return b-a+1;
    }
    public static int sumOfNumbersInRange(int a, int b){
        int sum=0;
        for(int i=a; i<=b; i++)sum+=i;
        return sum;
    }
    public static double arithmeticMeanSumOfNumbersInRange(int a, int b){
        int sum=0;
        for(int i=a; i<=b; i++)sum+=i;
        return (double) sum/(b-a+1);
    }
}
