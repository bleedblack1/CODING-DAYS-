public class Recursionday5 {
    
    public static int frndpairprob(int n) {

        if(n==1 || n==2) {
            return n;
        }
        //choice
        //single
        int fpp1 = frndpairprob(n-1);

        //pair
        int fpp2 = (n-1)*frndpairprob(n-2);

        int totalways= (fpp1 + fpp2) ;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(frndpairprob(4));
    }



}
