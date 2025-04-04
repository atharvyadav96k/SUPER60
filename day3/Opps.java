package day3;

class Student{
    String name;
    int rollNo;
    private int phoneNo;
    Student(String naam, int rNo, int PNo){
        this.name = naam;
        this.rollNo = rNo;
        this.phoneNo = PNo;
    }
}
public class Opps {
    public static void main(String[] args) {
        Student s = new Student("atharv", 10, 3424243);
        System.out.println(s.name);
    }
    static {
        System.out.println("Tejas Atharv Yadav");
    }
}
