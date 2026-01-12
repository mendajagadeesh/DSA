public class Stockbuyandsell2 {

    public static int maxprofit(int[] prices){
        int minsofar=prices[0];
        int res=0;
        for(int i=0;i<prices.length;i++){
        minsofar=Math.min(minsofar,prices[i]);
        res=Math.max(res,prices[i]-minsofar);
        }
        return res;
    }
    public static void main(String args[]){
        int result=maxprofit(new int[]{7,10,1,3,6,9,2});
        System.out.println("Max profit of stocks with in one transaction is "+result);
        
    }
}
