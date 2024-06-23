public class counting {
    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            largest = Math.max(largest , arr[i]);
        }

        int count [] = new int [largest + 1];
        for (int i=0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }

        //sorting 
        int j=0 ;
        for(int i=0 ; i<count.length ; i++){
            while(count[i] >  0){
                arr[j] = i ;
                j++;
                count[i]--;
            }
        }

        
    }

    public static void printarr (int number[]) {
        for(int i=0 ; i<number.length ; i++ ){
        System.out.print(number[i] + " ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        int arr [] = {3,6,4,1,9};
        countingsort(arr);
        printarr(arr);

    }
}