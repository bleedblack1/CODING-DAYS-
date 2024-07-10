public class copyconstructor {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "nishant";
        s1.age = 12;
        s1.passkey = "xyz";
        s1.mark[0] = 100;
        s1.mark[1] = 90;
        s1.mark[2] = 80;

        student s2 = new student(s1);
        s2.passkey = "abc";
        s1.mark[2] = 100;
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.mark[i]);
        }
    }
}

class student {
    String name;
    int age;
    String passkey;
    int[] mark;


     // shallow constructor
    /*
    student  (student s1){
        this.name = s1.name ;
        this.age = s1.age ;
        this.mark = s1.mark ;
        
       
    }
        */
        
    // Deep copy constructor
    student(student s1) {
        this.name = s1.name;
        this.age = s1.age;
        this.mark = new int[s1.mark.length];
        for (int i = 0; i < mark.length; i++) {
            this.mark[i] = s1.mark[i];
        }
    }
    

    // Default constructor
    student() {
        this.mark = new int[3];
    }

    // Constructor with name
    student(String name) {
        this.name = name;
        this.mark = new int[3];
    }

    // Constructor with age
    student(int age) {
        this.age = age;
        this.mark = new int[3];
    }
}
