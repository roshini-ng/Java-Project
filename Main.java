import java.util.*;
import customer.*;
import booking.*;
import room.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of a Customer:");
        String name=sc.nextLine();
        System.out.println("Enter Phone Number:");
        long number=sc.nextLong();
        System.out.println("Enter email id:");
        sc.nextLine();
        String email=sc.nextLine();
        System.out.println("Enter age of the customer:");
        int age=sc.nextInt();
        System.out.println("Enter nationality of the customer:");
        sc.nextLine();
        String nationality=sc.nextLine();
        System.out.println("Enter government id type:");
        String type=sc.nextLine();
        System.out.println("Enter the number of government id:");
        String gid=sc.nextLine();
        Customer c=new Customer(name,number, email,age,nationality,type,gid);
        c.display();
        System.out.println("1. Single Room");
        System.out.println("2. Double Room");
        System.out.println("3. Suite Room");
        System.out.println("4. Exit");
        System.out.println("Enter the type of room you want to book:");
        int single_room=0;
        int double_room=0;
        int suite_room=0;
        while(true){
            int choice=sc.nextInt();
            if(choice==1){
                single_room++;
            }
            else if(choice==2){
                double_room++;
            }
            else if(choice==3){
                suite_room++;
            }
            else if(choice==4){
                System.out.println("Thank you for booking with us!");
                break;
            }
            else{
                System.out.println("Invalid choice! Please try again.");
            }
        }
        System.out.println("Enter the check-in date (YYYY-MM-DD):");
        String checkInDate=sc.next();
        System.out.println("Enter the check-out date (YYYY-MM-DD):");
        String checkOutDate=sc.next();
        Booking b=new Booking(checkInDate,checkOutDate);
        int days=b.days();
        int a=single_room+double_room+suite_room;
        single_room=days*single_room;
        double_room=days*double_room;
        suite_room=days*suite_room;
        SingleRoom s=new SingleRoom("Single Room",single_room);
        DoubleRoom d=new DoubleRoom("Double Room",double_room);
        SuiteRoom sr=new SuiteRoom("Suite Room",suite_room);
        double rent=s.calculateRent(single_room)+d.calculateRent(double_room)+sr.calculateRent(suite_room);
        System.out.println("You have Booked "+a+" rooms for "+days+" days.");
        if(single_room>0){
            System.out.println("Single Room Rent: "+s.calculateRent(single_room)+" for "+days+" days");
        }
        if(double_room>0){
            System.out.println("Double Room Rent: "+d.calculateRent(double_room)+" for "+days+" days");
        }
        if(suite_room>0){
            System.out.println("Suite Room Rent: "+sr.calculateRent(suite_room)+" for "+days+" days");
        }
        System.out.println("Total Rent: "+rent);
        sc.close();
    }
}