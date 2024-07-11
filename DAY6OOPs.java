public class DAY6OOPs {
    
    public static void main(String[] args) {
        
        /*
// for single level inheritance

        fish shark = new fish();
        shark.hear();
        */

        // for multilevel inheritance
         dog bali = new dog();
         bali.eat();

        
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


/* 

// Single level inhertance

//derived class //child class //subclass
class fish extends Animal {
    void swim(){
        System.out.println("swimming");

    }
}

    */

    // multi level inheritance

    class mammel extends Animal{
        int leg (){
            return 4 ;
        }
        
    }

    class dog extends mammel {
        void breed(){
            System.out.println("indian");
        }

    }


