public class MaxSubArray {
    public static int maxsubarray(int[] arr){
        int res=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++){
        maxsum=Math.max(maxsum+arr[i], arr[i]);
        res=Math.max(res,maxsum);
        
        }
        return res;
    }
    public static void main(String args[]){
        int result=maxsubarray(new int[]{2,3,-8,7,-1,2,3});
        System.out.println("Maximum sub array sum of given array is "+result);

    }
}
