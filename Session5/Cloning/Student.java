package Cloning;

public class Student implements Cloneable {
    int number;
    String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "student 1");
        try {
            Student student2;
            student2=(Student) student1.clone();
            student2.name = "student two";
        } catch (CloneNotSupportedException e) {
        }
        System.out.println(student1.name);

    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
