public class stocksellbuy {

    public static int buyandsell(int prize[]){
        int buyprize =Integer.MAX_VALUE;
        int maxprofit = 0 ;
    for(int i=0; i<prize.length ; i++){
    if(buyprize < prize[i]){
        int profit = (prize[i] - buyprize );
        maxprofit = Math.max(maxprofit, profit);
    }else
    {
        buyprize = prize[i];
    }
    
    }

    return maxprofit ;
}

    public static void main(String[] args) {
       int prize[] = { 7 , 8 , 9 , 1 , 3};
       System.out.println( buyandsell(prize));

    }
    
}
