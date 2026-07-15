public class User {
    private int Id;
    private String firstName;
    private String lastName;
    private String password;
    private String course;


    // constructor --> Constructor are of 3 types 
    // 1. Default
    // 2. Parametrized
    // 3. Copy Constructor

    // User(){}

    User(int Id, String firstName, String lastName, String password, String course){
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.course = course;
    }

    // getters and setters 

    public int getId(){
        return this.Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    public void PrintUserData(){
        System.out.println("-------Printing "+this.firstName + " Data-------");
        System.out.println("Id : "+getId()+"\nName : "+getFirstName()+" "+getLastName()+"\nPassword : "+getPassword()+"\nCourse : "+this.getCourse());
    }

}
