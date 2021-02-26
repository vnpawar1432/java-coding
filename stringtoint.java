class stringtoint{
    public static void main (String[] args){  
           

        String str = "123";
        int number = Integer.parseInt(str); // this convergen is known as unboxing
        System.out.println("number  :"+number);

    }
}

            /* String is class it referenced type of data type it covert the value in integer primitive data type
            --- the process of converting value of variable of non primitive type into primitive type is called
            as unboxing  */
                // if sting does not conatain parsable numeric value then parsexxx() throws NumberFormatException 
                // example
                // String str = "123c";            
                //int number = Integer.parseInt(str); // this is known aslso unboxing but here is erroe
               // System.out.println("number  :"+number);