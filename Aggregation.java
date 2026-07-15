class Department {
    String name;

    Department(String name){
        this.name = name;
    }
}

class Employee{
    String name;
    Department department; // Aggregation

    Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }


    void display(){
        System.out.println(name + " Works in "+ department.name);
    }

}


public class Aggregation {
    public static void main(String[] args) {
        Department dept = new Department("IT");
        Employee emp = new Employee("Nitesh", dept);

        emp.display();


        // Aggregation - weak has-a relationship   -  Employee has a Department - Both object can exist independently -  Weak Owenership
        // Association - knows / uses relationship - Student studies with Teacher - Both object can exist independently - No Ownership 
        // Composition - Stromg has-a relationsjip - House has rooms - Child object can not exist without parent - Strong Ownership
    }
}
