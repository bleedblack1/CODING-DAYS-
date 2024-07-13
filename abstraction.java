public class abstraction {
    public static void main(String[] args) {
    //horse h = new horse();
    //h.eat();
    //h.leg();
    //System.out.println(h.color);

    mustang myMustang = new mustang();


}
}

abstract class  Animal{
    String color;

    Animal(){
        System.out.println("animal constructor");
        color = "brown";
    }

    void eat(){
        System.out.println("eating");
    }

    abstract void leg ();
}

class horse  extends Animal{
    horse(){
        System.out.println("horse constructor");
    }
    void changecolor(){
        color = "dark brown";
    }
    void leg(){
        System.out.println("4 legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("mustang constructor");
    }
}

class chicken extends Animal{
    void changecolor(){
        color = "yellow";
    }
    void leg(){
        System.out.println("2 legs");
    }
}
