

//Brute Force
public class maxsubarrsum {

    public static void MaxsubarraySum(int numbers[]){
        int CurrSum=0;
        int MaxSum=Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start=i;
            for(int j=i; j<numbers.length; j++){
                int end=j;
                CurrSum=0;
                for (int k=start; k<=end; k++){
                    CurrSum+=numbers[k];
                }                
                System.out.println(CurrSum);
                if(MaxSum<CurrSum){
                    MaxSum=CurrSum;
                }
            }
            System.out.println(CurrSum);
        }
        System.out.println("max Subarray Sum "+ MaxSum);
    }
    



//Prefix Sum


    public static void MaxsubarraySumpre(int numbers[]){
        int CurrSum=0;
        int MaxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
                int start=i;
                for(int j=i; j<numbers.length; j++){
                    int end=j;
                    
                    CurrSum=start==0? prefix[end]:prefix[end]-prefix[start-1];

                    if(MaxSum<CurrSum){
                        MaxSum=CurrSum;
                    }
                }
            System.out.println(CurrSum);
        }
        System.out.println("max Subarray Sum "+ MaxSum);
    }
    
    


//Kadane's Algorithm



    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }

        System.out.println("our max subarray sum is " + ms);
    }
    
    
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        int value [] = {7,8,9,6,4};
        int arr [] = { 2,5,7,8,5,6};
        kadanes(numbers);
        MaxsubarraySum(value);
        MaxsubarraySumpre(arr);
    }
}
