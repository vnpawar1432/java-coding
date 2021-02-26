import java.util.Scanner;
class Student{
    private String name;
    private int rno;
    private float marks;
    
    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name = name;
    }
    
    public int getrno(){
        return this.rno;
    }
    public void setrno(int rno){
        this.rno = rno;
    }

    public float getmarks(){
        return this.marks;
    }
    public void setmarks( float marks){
        if  (marks>35)
         this.marks = marks;
         else
         throw new IllegalArgumentException("illegal expression");

        
       
    }
} 
class program4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.print("name  :  ");
        s1.setname(sc.nextLine());

        System.out.print("rno  :  ");
        s1.setrno(sc.nextInt());

        System.out.print("marks  :  ");
        s1.setmarks(sc.nextFloat());

        System.out.println("name  :  "+s1.getname());
        System.out.println("rno  :  "+s1.getrno());
        System.out.println("marks  :  "+s1.getmarks());



    }
}