import java.util.*;
public class AllzerostoEnd{

    public static void assignallzerostoend(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        System.out.println("after convertion array is"+Arrays.toString(arr));
    }
    public static void main(String args[]){
       assignallzerostoend(new int[]{1,2,0,4,5,0,6,0});
    }
}