public class bubblesort {

    public static void bubbles(int number []){
        for(int turn=0 ; turn<number.length ; turn ++){
            for(int j=0 ; j<number.length-1-turn ; j++){
                if(number[j]<number[j+1]){
                    int temp = number [j];
                        number[j] = number[j+1];
                        number[j+1] =  temp ;
                }
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
        int number [] ={ 3, 4 , 6 , 1 , 5};

        bubbles(number);
        printarr(number);
        
    }

}
