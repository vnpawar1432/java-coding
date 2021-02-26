import java.util.Scanner; 
class Chain{
    private int real;
    private int imag;

    
    public Chain(){   // parameterless constructor
    this(50,60); // this statement call parameterised constructor in parameterless constructor this called cons. chain
    }    
    public Chain(int real,int imag){   // parameterless constructor
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
class Program3{
    public static void main(String[] args){
        Chain c1 = new Chain();
         //c1.acceptRecord();
        //c1.printRecord();
    }
} 