import java.util.Scanner;

public class function {

    public static void average(int a , int b , int c){
        
        // The average of 3 numbers -
        
        int average = (a+b+c)/3;
        System.out.println(average);
    }


    public static void isEven(int a){

        //Question 2 : Write a method named isEven that accepts an int argument. The method should return true
        //if the argument is even, or false otherwise. Also write a program to test your method.
        
        if(a%2==0)
            System.out.println( "even");
        else
            System.out.println("odd");
        
    }

    public static void palindrome(int z){
        int ld = z%10;
        
         do {
            System.out.print(ld);
            z=z/10;
            }
            while(z>0);


    }

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the value of a ");
            int a = scn.nextInt();
        System.out.println("enter the value of b ");
            int b = scn.nextInt();
        System.out.println("enter the value of c ");
            int c = scn.nextInt();
        System.out.println("The average is - ");
            average(a, b, c);



        System.out.println("enter the value of x ");
        
            int x = scn.nextInt();
            isEven(x);
        

        System.out.println("enter the value of z ");
            int z = scn.nextInt();

            palindrome(z);
    
       
        }

    



        
}
