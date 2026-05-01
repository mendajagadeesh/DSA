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
       // System.out.println(Arrays.toString(reverse(arr)));
    }
    public static void main(String args[]){
      arrayreverse(new int[]{5,4,3,2,1});
    }


    public static void swap(int[] arr,int start,int end){
        if(start>end)return;;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static int[] reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        swap(arr,start,end);
        return arr;
    }
}