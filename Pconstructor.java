import java.util.Scanner; 
class Cons{
    private int real;
    private int imag;

    public Cons(int real,int imag){   // parameterless constructor
        System.out.println(" parameterised constructor");    
       // this.real = 50;
       // this.imag = 60;
    }   

    public void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("real  :  ");
        this.real = sc.nextInt();

        System.out.print("imag  :  ");
        this.imag = sc.nextInt();
    }

    public void printRecord(){
                System.out.println("real  :  "+this.real);
                System.out.println("image  :  "+this.imag);

        }

}
class Program2{
    public static void main(String[] args){
        Cons c1 = new Cons(50,60);
        //c1.acceptRecord();
        //c1.printRecord();
    }
} 