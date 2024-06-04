import java.util.Scanner;

public class loops {
    public static void main(String args[]){
        Scanner scn = new Scanner (System.in);

        //Question 1 : How many times 'Hello' is printed?

       int n=scn.nextInt();

       for( int i=1 ; i<=n ; i++ ) {
        
        System.out.println("hello");
       }


       //Question 2 : Write a program to print the multiplication table of a number N, entered by the user.
        
       
      

        System.out.println(" enter you number ");
        int number =  scn.nextInt();
        for (  int i = 1 ; i<=10 ; i++){
                
            int table = number * i  ;
                
            System.out.println(table);
          }








    }
}
