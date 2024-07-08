public class day3OOPs {
    /*
    public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setcolor ("blue");
    p1.settip(5);
    System.out.println(p1.getcolor());
    System.out.println(p1.gettip());
}
}

class Pen {
    String color;
    int tip ;
    String getcolor(){
        return this.color;
    }

    //getter
    int gettip(){
        return this.tip;
    }

    //setter
    void setcolor(String newcolor ){
        color = newcolor;
    }
    //setter
    void settip( int newtip){
        tip = newtip;
    }
        */

        //construtor

        public static void main(String[] args) {
            Student s1 = new Student("Nishant");
            System.out.println(s1.name);

        }
    }

        class Student {
            String name ;
            int age ;

            Student(String name){
                //System.out.println("this is a construtor");
                this.name = name;
            }
}

    

    