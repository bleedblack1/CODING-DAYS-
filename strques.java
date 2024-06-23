import java.util.Arrays;

//Question 1 : Count how many times lowercase vowels occurred in a String entered by the user.

public class strques {

    /* 
    public static int vowel(String input ){
        int vowel = 0;
        

        for(int i=0; i<input.length() ; i++){
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
        }
        return vowel;
    }


    public static void main(String[] args) {
        System.out.print(" enter input ");

        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();

        System.out.println(vowel(input));

        
    }
    
    */

    //Question 4 : Determine if 2 Strings are anagrams of each other.
public static void main(String[] args) {
String str1 = "earth";
String str2 = "heart";
//Convert Strings to lowercase. Why? so that we don't have to check separately for lower & uppercase.
str1 = str1.toLowerCase();
str2 = str2.toLowerCase();
// First check - if the lengths are the same
if(str1.length() == str2.length()) {
// convert strings into char array
char[] str1charArray = str1.toCharArray();
char[] str2charArray = str2.toCharArray();
// sort the char array
Arrays.sort(str1charArray);
Arrays.sort(str2charArray);
// if the sorted char arrays are same or identical then the strings areanagram
boolean result = Arrays.equals(str1charArray, str2charArray);
if(result) {
System.out.println(str1 + " and " + str2 + " are anagrams of eachother.");
} else {
System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
}
} else {
// case when lengths are not equal
System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
}
}
    
}
