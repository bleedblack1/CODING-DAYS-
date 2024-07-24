public class recursionproblem {


    // find the length f string
    public static int length ( String str){
        
        if(str.length() == 0){
            return  0 ;
        }

        return length(str.substring(1)) + 1 ;
    }

    //
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        return;
        }
        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
        //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
        }
        
        
    
    public static void main(String[] args) {
        System.out.println(length("nishant"));
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
    }
}

