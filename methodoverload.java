class overloading{
    public static void main(){
         System.out.println("vaibhav");
    }

    public static void main(int a){  //same method name but different parameter
        System.out.println(" nagnathrao ");
    } 
    public static void main(String[] args){   //same method name but different parameter
        overloading.main();
        System.out.println("pawar");
        overloading.main(1);  //passing the argument to parameter otherwise result not shows
    
    }
}