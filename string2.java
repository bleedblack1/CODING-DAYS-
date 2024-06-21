public class string2{

    //STRING charAT method
    /* 
    public static void printwords( String str) {
        for(int i=0 ; i<str.length() ; i++ ){
            System.out.print(str.charAt(i) + " ");
        }
    }
        
    public static void main(String[] args) {
        String firstname = "NISHANT";
        String lastname = "dixit";

        String fullname =  ( firstname + " " + lastname );
            printwords(fullname);
    }
*/

// check the string is palindrome or not


public static boolean ispalindrome(String str ){
    int n = str.length() ;
    for( int i=0 ; i<str.length()/2 ; i++){
        if(str.charAt(i) != str.charAt(n-1-i)){
        // not a paloindrome
        
            return false;
        }
            
    }
    
    
    return true ;
}


public static void main(String[] args) {
    String str = "racecar";
    System.out.println(ispalindrome(str));
    

    
}




}