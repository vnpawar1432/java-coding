class SM{
private int num1;                       // instance variable
private int num2;                       // instance variable
private static int num3;               //static veriable or class level variable

        static {                                  // static intiliazation block
             SM.num3 =500;
        }

        public SM(){
            this(0,0);
        }

        public SM(int num1,int num2){
            this.num1= num1;
            this.num2= num2;
        }
        public void printRecord(){
         System.out.println("num1  : "+this.num1);   // this.num1
         System.out.println("num2  : "+this.num2);   // this.num2
         System.out.println("num3  : "+SM.num3);   // class.num3 it is static variable
         System.out.println(); 
        }

}
class Sam{
      public static void main(String[] args){
        SM s1 = new SM(10,20);
        SM s2 = new SM(30,40);
        SM s3 = new SM(50,60);
        
        s1.printRecord();
        s2.printRecord();
        s3.printRecord();
    }
}
