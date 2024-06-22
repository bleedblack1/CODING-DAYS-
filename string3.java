public class string3 {

    
        
        //given a route containing 4 directions (E,W,N,S) , FIND THE SHORTEST PATH TO THE DESTINATION .
        // N=Y+1 , S =Y-1 , E=X+1 , W=X-1 

        /* 
        public static float getshortestpath(String path){
            int x=0 , y=0 ;

            for(int i=0 ; i<path.length() ; i++ ){
                char dir = path.charAt(i);

                //south
                if(dir == 'S'){
                    y--;
                }
                //north
                else if( dir == 'N'){
                    y++;
                }
                //west
                else if (dir =='W'){
                    x--;
                }
                //east
                else{
                    x++;
                }
            }

            int x2 = x*x;
            int y2 = y*y;
            return (float)Math.sqrt(x2+y2);
        }
            public static void main(String[] args) {
            String PATH = "WNEENESENNN";

            System.out.println(getshortestpath(PATH));
    }


    */


    /*
    //compare the value
    public static void main(String[] args) {
        String s1 = "tony";
        String s2 = "tony";
        String s3 =  new String("tony");

        if(s1 == s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
    }
    */

    //substring find through logic
    /* 
    public static String substring(String str , int si , int ei ){
        String substr = "";
        for(int i=si ; i<ei ; i++){
            substr += str.charAt(i);

        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 6));
        
    }
    */

    /* 
    //substring find  through  java  function
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));
        
    }
    */

    //for a given set of Strings , print largest string
    //aims to find the lexicographically largest string
    public static void main(String[] args) {
        String fruits[] = {"apple " , "mango" ,"banana"};

        String largest = fruits[0];

        for(int i=1 ; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];

            }
        }
        System.out.println(largest);
    }


}
