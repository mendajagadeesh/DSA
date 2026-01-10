class StockBuyandSell{
    static int computeprofit(int[] arr){
        if(arr.length==0)return -1;
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                sum+=arr[i+1]-arr[i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
    int result=computeprofit(new int[]{100,180,260,310,40,535,695});
    System.out.println("Total profit "+result);
    }
}