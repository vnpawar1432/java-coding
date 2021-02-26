 import java.util.Scanner;
    class Empolyee2{
    private String name;
    private int empid;
    private float salary;
        public void acceptRecord(){
            Scanner sc =new Scanner(System.in);
            System.out.print("Name  :  ");
            this.name = sc.nextLine();
            System.out.print("Empid  :  ");
            this.empid = sc.nextInt();
            System.out.print("Salary  :  ");
            this.salary = sc.nextFloat();

    }
        public void printRecord(){
            System.out.println("Name  :  " +this.name);
            System.out.println("Empid  :  "+this.empid);
            System.out.println("Salary  :  "+this.salary);


        }
}
class program2{
    public static void main(String[] args){
        Empolyee2 emp = new Empolyee2();
        Empolyee2 emp1 = new Empolyee2();

        emp.acceptRecord();
        emp.printRecord();
        emp1.acceptRecord();
        emp1.printRecord();
    }
}