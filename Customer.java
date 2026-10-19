package customer;
public class Customer{
    String name;
    long number;
    String email;
    int age;
    String nationality;
    String type;
    String gid;
    public Customer(String name,long number, String email, int age, String nationality,String type,String gid){
        this.name=name;
        this.number=number;
        this.email=email;
        this.age=age;
        this.nationality=nationality;
        this.type=type;
        this.gid=gid;
    }
    public void display(){
        System.out.println("Customer Details:");
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+number);
        System.out.println("Email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Nationality: "+nationality);
        System.out.println("Government ID Type: "+type);
        System.out.println("Government ID Number: "+gid);
    }
}