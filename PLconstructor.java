import java.util.Scanner; 
class Cont{
    private int real;
    private int imag;

   public Cont(){   // parameterless constructor
        System.out.println(" parameterless constructor");    
        this.real = 50;
        this.imag = 60; 
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
class Program1{
    public static void main(String[] args){
        Cont c1 = new Cont();
        //c1.acceptRecord();
        //c1.printRecord();
    }
} 