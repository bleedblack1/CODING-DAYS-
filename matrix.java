public class matrix {
 
  //1. creation of matrix

    /*
    
    public static void main(String[] args){

        int matrix[][] = new int [3][3] ;
        Scanner sc = new Scanner(System.in);


        for(int i = 0 ; i<matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                  matrix[i][j] = sc.nextInt();

            }
        }

        //output
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                  System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    
    }
        */


// to find the value from the matrix 

    /*
    
    public static boolean search( int matrix[][] , int key ){
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                    if(matrix[i][j] == key){
                        System.out.print("element matched ");
                        System.out.println( i + " ," + j);
                        return true;
                    }
                }
            }
            System.out.print(" not matched");
            return false;
      }

    public static void main(String[] args) {
        int matrix[][] = new int [3][3] ;
        
        Scanner sc = new Scanner(System.in);
        
    
            for(int i = 0 ; i<matrix.length ; i++){
                for(int j=0; j<matrix[0].length ; j++){
                    matrix[i][j] = sc.nextInt();
            }
         }

         //output
         for(int i = 0 ; i<matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j] + "  ");
        }
    
        System.out.println();
        }

        search(matrix, 3 );
    }

    */

    //spiral matrix

    /* 
    public static void spiral( int matrix[][] ) {
        
        int sr = 0 ;//startrow
        int er = matrix.length-1;//endrow
        int sc = 0 ;//startcolunm
        int ec = matrix[0].length-1;//endcolunm

        while(sr<=er && sc<=ec){
            for(int j=sc ; j<=ec ; j++){
                //top
                System.out.print(matrix[sr][j] + " ");
            }

            for(int i = sr+1 ; i <=er; i++){
                //right
                System.out.print(matrix[i][ec]+" ");
            }

            for(int j =ec-1 ; j >= sc; j--){
                //last
                if(sr==er){
                    break;
                }
                System.out.print(matrix[er][j] + " ");
            }

            for(int i = er-1 ; i>=sr+1 ; i-- ){
                //left
                if(sc==ec){
                    break;
                }
                System.out.print(matrix[i][sr] + " ");
            }

            sc++ ;
            sr++ ;
            ec-- ;
            er-- ;

        }
    }
    public static void main(String[] args) {
        int matrix [][] = {{1 ,2 , 4 ,7 },
                            {6 , 8, 9, 11,} ,
                            {6 ,67 , 18 ,90},
                            {12, 43 , 5 , 0}};
        spiral(matrix);
    }
    */

    //sum of diagonal
    /* 
    public static int diagonalsum( int matrix [][]) {
        int sum =0 ;
        for(int i= 0 ; i<matrix.length ; i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-1-i)
            sum+=matrix[i][matrix.length-1-i];
            
            
            }
            
            return sum ;
    }
    
    public static void main(String[] args) {
        int matrix [][] = {{1 ,2 , 4 ,7 },
                            {6 , 8, 9, 11,} ,
                            {6 ,67 , 18 ,90},
                            {12, 43 , 5 , 0}};
        System.out.println(diagonalsum(matrix));
            
    }
    
    */

    public static boolean searchele(int matrix[][] , int key ) {
        int row =0 , col = matrix[0].length -1;

        while(row<matrix.length && col >=0){
            if(matrix[row][col]==key){
                System.out.println("found key at (" + row + " ,"+ col + ")");
                return true;
            }
            else if (key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.print("key not found !");
        return false;
    }
    
    public static void main(String[] args) {
        int matrix [][] = {{1 ,2 , 4 ,7 },
                            {6 , 8, 9, 11,} ,
                            {6 ,67 , 18 ,90},
                            {12, 43 , 5 , 0}};
        searchele(matrix, 6);
        }
}

