public class hybridinheritance {
    public static void main(String[] args) {
    shark shark1 = new shark();
    shark1.eat();
    shark1.swim();
    owl owl1 = new owl();
    owl1.eat();
    owl1.fly();

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

class shark extends fish{
    void hunt(){
        System.out.println("hunting");
    }
}

class whel extends fish{
    void show(){
        System.out.println("showing");
    }
}

class bird extends Animal{
    void fly(){
        System.out.println(" fly");
    }
}

class crow extends bird {
    void vision(){
        System.out.println(" day vision");
    }
}

class owl extends bird{
    void vision(){
        System.out.println(" night vision");
    }
}