// Class Creation/StudentClass.java

public class StudentClass {
    // creting a new data type
        public static class Student {
        String name;
        int rno;
        double percent;
    }
    public static void main(String[] args) {
        Student x = new Student(); //Declaration
        x.name = "Surya";
        x.rno = 56;
        x.percent = 72.5;
        System.out.println(x.percent + 8);

        Student s = new Student(); //Declaration
        s.name = "Mohit";
        s.percent = 85.0;
        s.rno = 37;
        System.out.println(s.percent + 8);
    }
}