public class arrayp1 {
    
    //find index value using linear search in array  :

    public static int linearsearch( int numbers[] , int key ){
        for(int i=0; i<=numbers.length; i++){
            if( numbers[i]==key) {
                return i;
            }
            
        }

            return -1 ;
        }



    //find largest value in an array
    public static int largest(int value[]){
        
        int largest = Integer.MIN_VALUE ;
        for( int i=0 ; i<value.length; i++){
            if(largest < value[i]){
                largest = value[i];
            }
        }
        return largest ;
        
    }

    
    public static void main(String args[]){
        
        int numbers [] ={5, 23 , 45 ,3 ,33 ,56 } ;
        int key = 5 ;
        
        int index =  linearsearch(numbers, key);
        
        if( index== -1){
            System.out.println(" num does not match");
        }
        else{
            System.out.println(" num matched and indexing is = " + index);
        }
    
    
    int  value[]  = {1 ,2 , 3, 4 ,5 ,6 } ;
        
    
     
     System.out.println("largest = "+ largest(value));



    }
}






