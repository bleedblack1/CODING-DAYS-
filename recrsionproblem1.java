public class recrsionproblem {
   
    
//Question 1 : For a given integer array of size N. You have to find all the occurrences
//(indices) of a given element (Key) and print them. Use a recursive function to solve this
//problem.

    public static void indice(int[] arr , int key , int i){
        if(arr.length==i){
            return ;
    }
     
  if(arr[i]==key){
    System.out.println(i);
  }
  indice(arr,key,i+1);

}

//You are given a number (eg - 2019), convert it into a String of english like
//“two zero one nine”. Use a recursive function to solve this problem.
//NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
//can’t be 0.



public static void word(int n){

    String arr[] = { "zero" , " one" , " two" , "three" , "four" , "five" , "six" , " seven " , " eight " , " nine " , "ten"} ;

    if(n==0){
    return ;
    }

    int lastdigits = n%10 ;
    word(n/10)  ;
    System.out.print(arr[lastdigits] + "  ");

}

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,6,7};
        indice(arr, 7, 0);
        word(12340);
    }
}
