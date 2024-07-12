public class pmoverriding {
    
    public static void main(String[] args) {
        // Overriding
        // 1. Method Overriding
        goat g1 = new goat();
        g1.eat();
    }
}

class animal{
    void eat(){
        System.out.println("eating anything");
    }
}

class goat{
    void eat(){
        System.out.println("eating grass");
    }
}
