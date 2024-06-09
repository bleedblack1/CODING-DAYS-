import java.util.Scanner;;
public class Questions {
    
    

    public static void main (String[] args){
      
      Scanner sc = new Scanner(System.in);
      /* 
      // print 1 to 10 number
      
      int n =1;
      while(n<=10){
        System.out.println(n);
        n++;
      }

      // print 1 to z number 

      
      int i=0;
      System.out.println("enter the value of z = ");

      int z = sc.nextInt();

      while(i<=z){
        System.out.println(i);
        i++;
      }


      // print sum of n numbers
      
      int a = 1;
      System.out.println("enter the value of b = ");
      int b = sc.nextInt();
      
      int sum =0;

      while (a<=b) {

        sum=sum+a;
        a++;
        }

        System.out.println("Sum = " + sum);

        // print reverse of the number :

         System.out.println("enter the number = ");
         int c = sc.nextInt();
         

         while(c>0){
          int ld = c%10;
          System.out.print(ld +" ");
          c=c/10;

         }
         */
        /* 
         // reverse of the number :
         System.out.println("enter the number = ");
         int x = sc.nextInt();
        
         int reverse = 0 ;
         while(x>0){
          int ln = x % 10 ;
          reverse = (reverse*10 + ln );
          x=x/10;
          
         } 
         System.out.print(reverse); 
         
         */

         //number is prime or not :
        System.out.print(" enter the number = ");

         int m = sc.nextInt();

if(m==2){
  System.out.println(" Number is prime");

}

else{

        boolean isPrime = true ;
      
        for( int i =2 ; i<=m-1 ; i++){
            if(m % i ==0 ){

             isPrime = false ;
            }

            if(isPrime=true){
              System.out.print("Number is prime ");
            }
            else
            {
              System.out.println("Number is not prime ");
            }

        }

      }



    }
}
