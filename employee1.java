import java.util.Scanner;
class Employee1{
    private String name;
    private int empid;
    private float salary;

    public void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("name :");
        this.name = sc.nextLine();

         System.out.print("empid :");
        this.empid = sc.nextInt();

         System.out.print("salary :");
        this.salary = sc.nextFloat();
    
    }
    public void printRecord(){
        System.out.println("name : "+this.name);
        System.out.println("empid : "+this.empid);
        System.out.println("salary : "+this.salary);

    }
    }
    class program1{
        public static void main(String[] args){
        Employee1 emp = new Employee1();
        emp.acceptRecord();
        emp.printRecord();
        }
    }