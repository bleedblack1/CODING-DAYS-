public class recursion3 {
    //calculate nth term in fibonacci
    public static int fib(int n){
        if(n==0 || n ==1){
            return n ;
        }
        int fn1 = fib(n-1);
        int fn2 = fib(n-2);
        
        int fn = fn1 + fn2 ;
        return fn ;
    }

    //print the array is soprted or not
    public static boolean isSorted(int[] arr , int i){

        if(i == arr.length-1){
            return true ;
        }
        if(arr[i] > arr[i+1]){
            return false ;
        }
        return true;
    }

    //find the first occurance of  element in this array
    public static int firstOccurance(int[] arr , int i , int data){
        if(i== arr.length-1){
            return -1 ;
        }
        if(arr[i] == data){
            return i;
        }
        return firstOccurance(arr , i+1 , data);
    }

    //find the last occurance of  element in this array
    public static int lastOccurance(int[] arr , int i , int data){
        if(i == arr.length){
            return -1 ;
        }
        int isfound = lastOccurance(arr, i+1, data);
        if(isfound==-1 & i ==data){
            return i;
        }
        return isfound;
    }

// find the x^n
public static int power(int x , int n){
    if(n==0){
        return 1;
    }
    return x * power(x, n-1);
}

//find optimized power x^n
public static int powerOptimized(int x , int n){
    if(n==0){
        return 1;
    }
    int halfpowersqr = powerOptimized(x, n/2) * powerOptimized(x, n/2) ;
    if(n % 2 != 0 ){
        return x * halfpowersqr ;
        
    }
    return halfpowersqr ;
}

    public static void main(String[] args) {
        //System.out.println(fib(25));
        int[] arr= {1, 2 ,5 ,4,5,7};
        //System.out.println(isSorted(arr, 0));
        //System.out.println(firstOccurance(arr, 0, 5));
        //System.out.println(lastOccurance(arr, 0, 5));
        //System.out.println(power(2, 3));
        System.out.println(powerOptimized(2, 3));
    }
}
