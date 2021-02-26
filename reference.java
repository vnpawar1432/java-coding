class Date{        
    private int day;          // field of the class
    private int month;        // field of the class
    private int year;         // field of the class
}
class Employee{
    private int empid;      // field of the class
    private Date joindate;  // field of the class

    public Employee(int empid,int day,int month, int year ){
        this.empid= empid;
        this.joindate = new Date(day,month,year);
        System.out.println("joindate is field");
    }

}
class program2{
    public static void main(String[] args){
        Employee emp = new Employee(33,29,03,1997); //method local veriable
    }
}