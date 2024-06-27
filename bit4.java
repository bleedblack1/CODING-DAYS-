public class bit4 {
    
    //clear last i bit
    public static int clearlastibit (int n , int i){
        int bitmask = ((~0)<<i);
        return n & bitmask;
    }
    

    // clear range of bit 
    public static int clearrangeofbits (int n ,int i , int j){
        int a =(~0)<<(j+1);
        int b =  (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }

    // CHECK THE NUMBER IS POWER OF 2 OR NOT
    public static boolean ispowerof2 (int n){
        return (n & (n-1)) == 0;
    }

    //count set bit in a number
    public static int countsetbit (int n){
        int count = 0;
        while (n > 0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
    }
    return count;
}

// fast exponentiation
public static int fastexponentiation (int a , int n){

    int ans = 1;
    while (n > 0){
        if((n&1) != 0){ // check lsb
            ans = ans * a ;
        }
        a= a*a ;
        n = n>>1;
    }
    return ans;

}


    public static void main(String[] args) {
        System.out.println(clearlastibit(15, 2));
        System.out.println(clearrangeofbits(10, 2, 4));
        System.out.println(ispowerof2(16));
        System.out.println(countsetbit(10));
        System.out.println(fastexponentiation(2, 3));
    }

}
