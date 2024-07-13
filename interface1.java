public class interface1 {
    public static void main(String[] args) {
    //queen q1 = new queen();
    //king k1 = new king();
    //q1.move();
    //k1.move();

    Bear b1 = new Bear() ;
    b1.eat();
    }
}

//multiple inheritance
interface Harbivore{
        void eat();

}

interface Carnivore{
    void eat();

}

class Bear implements Carnivore , Harbivore{
        public void eat(){
            System.out.println(" it eats both grass and nonveg");
        }
}









/* 
interface chess{
    void move();
}

class queen implements chess {
    public void move(){
        System.out.println("queen move - left , right ,up , down (in all 4 direction)");
    }

}

class king implements chess {
    public void move(){
        System.out.println("up , down , left , right ( 1 move only)");
    }

}
    */
