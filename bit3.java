public class bit3 {
   
//get ith bit
    /* 
    public static void getithbit(int n , int i){
        int bitmask = 1<<i ;

        if((n & bitmask )!= 0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
    }
} 
    public static void main(String[] args) {
        getithbit(5, 2);
        
        }
        */
    /* 
// set ith bit 
    public static int setithbit(int n , int i){
        int bitmask = 1<<i ;
        int newbit = n | bitmask ;
        return newbit ;
    }    

    public static void main(String[] args) {
        System.out.println(setithbit(0, 0));
        
    }

    */

//clear ith bit 

    /* 
    public static int clearithbit(int n ,int i) {
        int bitmask = 1<<i ;
        int newbit = n & ~bitmask ;
        return newbit ;
        
    }
    public static void main(String[] args) {
        System.out.println(clearithbit(10, 1));
    }
    */

    //update ith bit
    /*
    public static int clearithbit(int n ,int i) {
        int bitmask = 1<<i ;
        int newbit = n & ~bitmask ;
        return newbit ;
    }
    
    public static int updateithbit(int n , int i , int newbit){
        
        n = clearithbit(n,i);
        int bitmask = newbit << i ;
        return n | bitmask ;

    }
    public static void main(String[] args) {
        updateithbit(10, 2, 1);
    }
    */

    
}
