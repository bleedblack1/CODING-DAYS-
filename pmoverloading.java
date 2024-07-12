public class pmoverloading{
    public static void main(String[] args) {
        cal s1 = new cal() ;
        System.out.println( s1.sum(2, 3));
        System.out.println(s1.sum(2,3,4) );
        System.out.println(s1.sum((float)2.5 , (float)2.5 ));
        

}
}

class cal{

   int sum (int a , int b){
        return a + b ;
    }
    float sum (float a , float b){
        return a + b ;
    }

    int sum(int a , int b , int c){
        return a + b + c;
    }

}