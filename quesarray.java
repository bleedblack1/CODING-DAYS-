public class quesarray {
    // print subarray of array .
    public static void subarray(int numbers[]){
        
        for(int i=0 ; i<numbers.length ; i++){
            int start = i;
        
            for(int j = i+1 ; j<numbers.length ; j++){
                int end = j;
            
                for(int k=start ; k<=end ; k++){
                    
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
             }
        System.out.println();
        }

    }


    // maxsum of subarray .
    public static void sumsubarray( int value[]) {
       
        int maxsum = Integer.MIN_VALUE;
        for(int i=0 ; i<value.length ; i++){
            int start = i;
        
            for(int j = i+1 ; j<value.length ; j++){
                int end = j;
                int currsum = 0 ;
                for(int k=start ; k<=end ; k++){
                    
                    currsum+=value[k];}
                    System.out.println(currsum);

                    if (maxsum < currsum){
                        maxsum=currsum;
                    }
             }
        
        }
        System.out.println(" max sum " + maxsum);
        
    }
    

    public static void main(String args[]){
        int numbers[] = {2,3,4,7,9};
        subarray(numbers);

        int value[] = {2,3,4,5,6};
        sumsubarray(value);
 
    }
}
