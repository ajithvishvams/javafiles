package day2.java;
class Student {

    static class Address {

        int houseNo;
        String streetName;

        public void print() {
            System.out.println("Nested class");
        }
    }
    static {
        System.out.println("I am static");
    }
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + " School name " + schoolName + "]";
    }
    public Student(int rollno, String name) {
        super();
        this.rollno = rollno;
        this.name = name;
    }
    private int rollno;
    private String name;
    static String schoolName;
    public static void staticMethod() {
        System.out.println("School Name" + schoolName);
    }
}
public class Mystatic1 {
    public static void main(String args[]) 
    {
    	Student.schoolName = "Raj school";
    	
        Student s1 = new Student(1001, "Aji");
        Student s2 = new Student(1002, "me");
        Student s3 = new Student(1003, "viswa");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        Student.staticMethod();

        Student.Address address = new Student.Address();
        address.print();
    }

}