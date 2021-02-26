class intToString{
    public static void main (String[] args){  

        int number = 123;
        String str = Integer.toString(number);    // boxing covergen  
       // String str = String.valueof(number);    // this also a method
        System.out.println("str  :"+str);

    }
}
          /* 
            --- the process of converting value of variable of  primitive type into non primitive type is called
            as boxing  */