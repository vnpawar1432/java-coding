import java.util.Scanner;
class Employee3{
    private String name;
    private int empid;
    private float salary; 
    public String getname() {
        return this.name;
    }
     public void setname(String name){
         this.name = name;
     } 
     public int getempid() {
        return this.empid;
    }
     public void setempid(int empid){
         this.empid = empid;
     } 
     public float getsalary() {
        return this.salary;
    }
     public void setsalary(float salary){
         this.salary = salary;
     }
    
}
class program3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee3 emp = new Employee3();

        System.out.print("Name  :  ");
        emp.setname(sc.nextLine());
        
        System.out.print("empid  :  ");
        emp.setempid(sc.nextInt());
        
        System.out.print("salary  :  ");
        emp.setsalary(sc.nextFloat());

        System.out.println("name  :  "+emp.getname());
        System.out.println("empid  :  "+emp.getempid());
        System.out.println("salary  :  "+emp.getsalary());



        
    }
}