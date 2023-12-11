public class Arrays {
    public static boolean arr(int[] arr1, int[] arr2){
        int arr1_counter=0;
        int arr2_counter=0;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>=10 && arr1[i]<=99)
                arr1_counter++;
        }
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]>=10 && arr2[i]<=99)
                arr2_counter++;
        }
        if(arr1_counter==arr2_counter)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};
        System.out.print(arr(arr1,arr2));  
    }
}
