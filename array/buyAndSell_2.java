/**
 *  find daily profit and compare it with max profit.
 */
public class buyAndSell_2 {

    public static void main(String[] args) {
        int stocks[] = {2,5,3,9,1,4,2,8,7};
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<stocks.length;i++){
            if(buyPrice<stocks[i]){
                int profit=stocks[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyPrice=stocks[i];
            }
        }

        System.out.println("max profit : "+maxProfit);

    }
}