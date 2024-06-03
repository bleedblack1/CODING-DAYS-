import java.util.Scanner;


public class conditional {
    public static void main(String args[]){
        Scanner scn = new Scanner (System.in);
        
        

        
  //Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative.
      
        System.out.println("enter your number");
        int a = scn.nextInt();
        if(a<0)
        System.out.println("negative");
        else if (a>0)
        System.out.println("positive");
        else
        System.out.println("not negative , not positive");


  //Question 2 :You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
   
  
    double temp = 103.5;
    if(temp>100)
    System.out.println("you have fever");
    else
    System.out.println("you don't have fever");

//Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case.
 

System.out.println("enter your week number: ");
 int week = scn.nextInt();

switch (week) {
        case 1 :
        System.out.println("sunday");
        break;
         
        case 2:
        System.out.println("monday"); 
        break;
    
        case 3 :
        System.out.println("tuesday"); 
        break;
        
        case 4 :
        System.out.println("wednesday"); 
        break;

        case 5 :
        System.out.println("thursday"); 
        break;

        case 6 :
        System.out.println("friday"); 
        break;

        case 7 :
        System.out.println("saturday"); 
        break;
        
        

    default:
       System.out.println("wrong number");
        break;
}

//What will be the value of x & y in the following program:

        int p = 63 , q = 36;

        boolean x = (p < q ) ? true : false;
        int y= (p > q ) ? p : q;
         
        System.out.println(x);
        System.out.println(y);
    
//Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not


System.out.println("enter your year : ");
int year = scn.nextInt();

boolean m = (year%4) == 0;
boolean n = (year%100) !=0;
boolean o = ((year%100==0) && (year%400==0));

if(m && (n||o)) {
    System.out.println(year+" is a leap year");
}
else{
    System.out.println(year+" is not a leapyear");
}










    }
    }
    



