class number1{
    private static int number =10; // static variable always declare in class scope
         public static void print(){
         static int number =10;  // this is not ok
         number = number+1;
         System.out.println("number  :  "+number);
        }
        public static void main(String[] args){
         number1.print();  
         number1.print();
         number1.print();
                
        }
}