public class hieraricalinheritance {
    
    public static void main(String[] args) {
        
    fish shark = new fish() ;
    bird owlBird = new bird() ;

    shark.eat();
    owlBird.eat();
        
    }
}
//base class //parent class
class Animal{
    String color ;

    void eat(){
        System.out.println("eating");
    }

    void breath(){
        System.out.println("breathing");
    }

    void hear(){
        System.out.println("hearing");
    }
}


class fish extends Animal{
    void swim(){
        System.out.println("swimming");
    }

}

class bird extends Animal{
    void fly(){
        System.out.println("flying");
    }
}