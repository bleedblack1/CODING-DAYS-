import java.util.Scanner;

public class BASIC {
    public static void main(String args[]){
         Scanner scn = new Scanner (System.in);
         
         //ADD TWO NUMBERS BY TAKING INPUT FROM THE USERS
         
         int a = scn.nextInt();
         int b = scn.nextInt();
         int sum = a+b ;
         System.out.println(sum); 
        
         //find the avarage of three number 
        
         int x = scn.nextInt();
         int y = scn.nextInt();
         int z = scn.nextInt();

         int avg = (x+y+z)/3;

         System.out.println("avg" + avg);
        
        
//find the area of the square 
        
        int p = scn.nextInt();
         
        int area = p*p;
         
        System.out.println("area"+ area);
        

        /*Enter cost of 3 items from the user (using float data type)-a pencil,a pen and an eraser. You have to output the total cost of the items back 
        to the user as their bill.
        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/
        
         
        System.out.println( "pencil");
        int pencil = scn.nextInt();
        
        
        System.out.println( "pen");
        int pen = scn.nextInt();
        
        System.out.println( "eraser");
        int eraser = scn.nextInt();

         int bill =   (pencil+pen+eraser)*18/100 ;


        System.out.println( "total");
        System.out.print(bill);

        

        byte bt =4 ;
        char c = 'a' ;
        short s =512 ;
        int i =1000;
        float f = 3.14f;
        double d = 99.9954 ;

        double result = (f * bt) + (i % c) - (d*s);

        System.out.println(result);


        


    }
}
