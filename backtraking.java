public class backtraking {
    /*
    public static void changearr(int[] arr , int i , int v){
        //base case
        if (i == arr.length) {
            printarr(arr);
            return;
        }

        //recursion
        arr[i]=v;
        changearr(arr , i+1 , v+1);
        arr[i]=arr[i]-2;

    }

    public static void printarr(int[] arr ){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main (String[] args){
        int[] arr = new int[5];
        changearr(arr, 0, 1);
        printarr(arr);
    }
        */


        


/* 
// find subset

    public static void findsubset(String str , int i , String ans){
        
        
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return ;
        }

        //recursion
        //yes choice
        findsubset(str , i+1 , ans+str.charAt(i));

        //no choice
        findsubset(str , i+1 , ans);

    }



    public static void main(String[] args) {
        String str = "abc";
        findsubset(str , 0 , "");

    }
        */


//PERMUTATION
    

    public static void permutation(String str , String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            String ros = str.substring(0 , i)+str.substring(i+1);
            permutation(ros, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}
