public class RECURSION2 {
    

    public static int fact(int n){
        if(n==0){
            return 1;
        }

        int fn1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;

    }
    

    // sum of n natural numaber 
    public static int sum(int n){
        if(n==1){
            return 1;
        }

        int fn1=sum(n-1);
        int fn=n+sum(n-1);
        return fn;

    }
    public static void main(String[] args) {
        int n =3 ;
        System.out.println(sum(n));
       System.out.println(fact(n)); 
    }
}
