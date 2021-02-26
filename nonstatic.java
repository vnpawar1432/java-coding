class ABC{
    private int num1;
    private int num2;
    private int num3;

    public ABC(){
        this(0,0);
    }

    public ABC(int n1,int n2){ // or public ABC(int num1,int num2) if parameter variable and field veriable is same then we can use this and dot operator
        num1 = n1;     //this.num1= num1;
        num2 = n2;      //this.num2= num2;
        num3 = 500;
    }
     public void printRecord(){
         System.out.println("num1  : "+num1);   // this.num1
         System.out.println("num2  : "+num2);   // this.num2
         System.out.println("num3  : "+num3);   // this.num3
         System.out.println();   
        }
}
class XYZ{
    public static void main(String[] args){
        ABC a1 = new ABC(10,20);
        ABC a2 = new ABC(30,40);
        ABC a3 = new ABC(50,60);
        a1.printRecord();
        a2.printRecord();
        a3.printRecord();
    }
}