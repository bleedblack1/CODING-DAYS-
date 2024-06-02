public class operator{
    public static void main(String[] args){
    
    //1
    int x = 2, y = 5;
    int exp1 = (x * y / x);
    int exp2 = (x * (y / x));
    System.out.print(exp1 + ","  );
    System.out.print(exp2);
      



//2
    int p = 200, q = 50, r = 100;
    if(p > q && q > r){
    System.out.println("Hello");
    }
    if(r > q && r < p){
    System.out.println("Java");
    }
    if((q+200) < p && (q+150) < r){
    System.out.println("Hello Java");
    }
  

 //3


  
    int a, b, c;
    a = b = c = 2;
    a += b;
    b -= c;
    c /= (a + b);
    System.out.println(a + " " + b + " " + c);
    
    
 
//4
 int g = 9, h = 12;
 int e = 2, f = 4, m = 6;
 int exp = 4/3 * (g + 34) + 9 * (e + f * m) + (3 + h * (2 + e)) / (e + f*h);
 System.out.println(exp);
 


 //5



int k = 10, l = 5;
int expa = (l * (k / l + k / l));
int expb = (l * k / l + l * k / l);
System.out.println(expa);
System.out.println(expb);










  }

}
