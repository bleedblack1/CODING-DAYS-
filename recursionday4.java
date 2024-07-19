public class recursionday4 {
    
    public static int tileprob(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical
        int v=tileprob(n-1);

        //horizontal
        int h=tileprob(n-2);

        int total = v + h ;

        return total ;
    }

    //remove dublicates
    public static void removeDublicates(String str , int idx , StringBuilder newStr , boolean[] map ){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        //current charecter
        char currchar =str.charAt(idx);
        if(map[currchar-'a'] == true){
            //duplicates charecter , skip
            removeDublicates(str, idx +1, newStr, map);
        }
        else{
            //non duplicates charecter
            map[currchar-'a']=true;
            removeDublicates(str, idx+1, newStr.append(currchar) , map);
        }

    }
    public static void main(String[] args) {
        //int n = 3;
        //System.out.println(tileprob(n));

        // remove duplicates
        String str = "ababcc";
        removeDublicates(str, 0, new StringBuilder(""), new boolean[26] );
    }
}

