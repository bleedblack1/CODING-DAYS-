public class SORTING {

    public static void insersort (int arr []){
        for(int i = 1 ; i<arr.length ; i++){
        int curr = arr[i];
        int prev = i-1;
        // find out the corr pos to insert 
        while(prev >=0 && arr[prev] > curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
        //insertion
        arr[prev+1] = curr ;
    }

}

public static void sortedarr( int arr []) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    
}
}
    public static void main (String[] args){

        int arr [] = {4,7,1,8,9,0,3};
        insersort(arr);
        sortedarr(arr);
        }
        

}    

