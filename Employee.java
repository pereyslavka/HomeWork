public class Employee {
    private String name;
    private String position;
    private String email;
    private long phoneNumber;
    private float salary;
    private int age;

    Employee(){
        name = "default_name";
        position = "default_position";
        email = "default_email";
        phoneNumber = 89641234112l;
        salary = 123.456f;
        age = 123;
    }
    Employee(String name, String position, String email, long phoneNumber, float salary, int age){
        this.name = name;
        this.position= position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    void getInformation(){
        System.out.println("name: "+name+", position: "+position+", email: "+email+", phoneNumber: "+phoneNumber+", salary:"+salary+", age:"+age);
    }
    int getAge(){
        return age;
    }
}
