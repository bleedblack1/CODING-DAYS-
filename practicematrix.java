public class practicematrix {

    //1.Question 1 : Print the number of 7’s that are in the 2d array.
//Example :
//Input - int[][] array = { {4,7,8},{8,8,7} };
//Output - 2

/* 
public static int numbers(int array[][] , int key ) {
        int num = 0 ;
        for(int i=0 ; i <array.length ; i++){
            for(int j=0; j<array[0].length ; j++){
                if(array[i][j] == key)
                num+=1;
            }
        }
        System.out.print(num);
        return num ;
    
}
public static void main(String[] args) {
    int[][] array = { {4,7,8},{8,8,7} };
    int key = 7 ;
    numbers(array, key);
}
    
*/

//Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
//Example :
//Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//Output - 18

/* 
public static int sum(int nums [][]){
    int sum = 0;
    for(int i = 1 ; i<2 ; i++ ){
        for(int j=0 ; j<nums[0].length ; j++){
            sum+=nums[i][j];
        }
    }
    System.out.print(sum);
    return sum ;
}
public static void main(String[] args) {
    int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    sum(nums);
}
    */

//Question 3 : Write a program to Find Transpose of a Matrix.
//What is Transpose?
//Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,

    public static void transpose(int[][] matrix) {
        int rows = matrix.length;  
        int columns = matrix[0].length;
        int[][] transposeMatrix = new int[columns][rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        
        printMatrix(transposeMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] nums = { {1, 4, 9}, {11, 4, 3}, {2, 2, 3} };
        transpose(nums);
    }
}

