 import java.util.Scanner;
class Get{
private String name;
private int empid;
private float sal;

public String getname(){
    return this.name;
}
public void setname(String name){
  this.name = name;   
}

public int getempid(){
    return this.empid;
}
public void setempid(int empid){
  this.empid = empid;   
}

public float getsal(){
    return this.sal;
}
public void setsal(float sal){
  this.sal = sal;   
}
}
 class Set {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         Get e1 = new Get();
         
          System.out.print("name  :  ");
           e1.setname(sc.nextLine());

            System.out.print("empid  :  ");
           e1.setempid(sc.nextInt());

             System.out.print("sal  :  ");
           e1.setsal(sc.nextFloat());

                System.out.println("name  :  "+e1.getname());
        System.out.println("rno  :  "+e1.getempid());
        System.out.println("marks  :  "+e1.getsal());           
     }
 }