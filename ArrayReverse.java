import java.util.Arrays;

public class ArrayReverse{

    public static void arrayreverse(int[] arr){
        int n=arr.length;
        if(arr.length<2)return;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
      arrayreverse(new int[]{5,4,3,2,1});
    }
}