public class DAY4OOPs {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("nishant");
        student s3 = new student(20);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

class student {
    String name;
    int age;
    String password;

    // Non-parameterized constructor
    student() {
        this.name = "Unknown";
        this.age = 0;
        this.password = "None";
        System.out.println("I am a non-parameterized constructor");
    }

    // Parameterized constructor
    student(String name) {
        this.name = name;
        this.age = 0;
        this.password = "None";
    }

    student(int age) {
        this.name = "Unknown";
        this.age = age;
        this.password = "None";
    }

    // Override the toString() method to provide a meaningful string representation
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}
