public class pattern1{
    public static void main(String args[] ){

        // print star pattern

        int line = 4 ;
        for ( line=1 ; line<=4 ; line++ ){
           
            for( int star =1 ; star<=line ; star++){
                System.out.print("*");
            }
            System.out.println();
        }

        //invereted star pattern 

        int row = 4 ;
        for ( row=1 ; row<=4 ; row++ ){
           
            for( int star =4 ; star>=row ; star--){
                System.out.print("*");
            }
            System.out.println();
    }

    // half piramid pattern
    int i = 4 ;
        for ( i=1 ; i<=4 ; i++ ){
           
            for( int n =1; n<=i ; n++){
                System.out.print(n);
                   
            }
            System.out.println();
}

// character pattern

int j = 4 ;
char character = 'A' ;
for ( j=1 ; j<=4 ; j++ ){
   
    for( int chars = 1 ; chars<=j ; chars++){
        System.out.print(character);
           character++;
    }
    System.out.println();

}
}
}
