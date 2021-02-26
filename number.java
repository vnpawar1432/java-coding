class number{

public static void print(){
        int number =10; // non static local variable
        number = number+1;
        System.out.println("number  :  "+number);
}
    public static void main(String[] args){
        number.print();  
        number.print();
        number.print();
                
    }
}