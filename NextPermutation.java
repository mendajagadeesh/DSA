import java.util.Arrays;

public class NextPermutation {
    public static int[] nextpermutation(int[] arr){
       int pivot=-1;
       int n=arr.length;
       for(int i=n-2;i>0;i--){
        if(arr[i]<arr[i+1]){
            pivot=i;
            break;
        }
       }

       if(pivot!=-1){
        for(int j=n-1;j>0;j--){
           if(arr[pivot]<arr[j]){
            int temp=arr[pivot];
            arr[pivot]=arr[j];
            arr[j]=temp;
            break;
           }
        }
       }

       int left=pivot+1;
       int right=n-1;
       while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
       }

       return arr;
    }
    public static void main(String args[]){
        int[] result=nextpermutation(new int[]{2,4,1,7,5,0});

        System.out.println("Next permutation is "+Arrays.toString(result));

    }
}
