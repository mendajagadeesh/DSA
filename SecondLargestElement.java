public class SecondLargestElement{

    public static int Secondlargest(int[] arr){
        if(arr.length<2){
            return -1;
        }
        int first=arr[0];
        int second=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(first<arr[i]){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String args[]){
        int result=Secondlargest(new int[]{1,2,3,4,5});
        if(result==Integer.MIN_VALUE){
            System.out.println("second largest element is "+-1);
        }else{
        System.out.println("second largest element of given array of elements is "+result);
        }
    }
}