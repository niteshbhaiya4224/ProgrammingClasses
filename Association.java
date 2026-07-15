class Teacher{
    String name = "Nitesh";
}

class Student{
    String name = "Issac";

    void study(Teacher teacher){
        System.out.println(name + " is studying with "+teacher.name);
    }

}


public class Association {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        s.study(t);
    }
}
