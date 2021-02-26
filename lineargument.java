class lineargument{

    public static void main(String[] args){  

      /*  if you want to pass argument from command line then you want to
          use pasre function beacause  argument from command line is in the form of 
          string parse it covert data type 

      */
        int num1= Integer.parseInt(args[0]);        // Integer.parseInt it conver string in integer
        Float num2= Float.parseFloat(args[1]);      //Float.parseFloat it conver string in float
        Double num3= Double.parseDouble(args[2]);   //Double.parseDouble it conver string in double

        Double result= num1+num2+num3;  
    
            
        System.out.println("result :"+result);
    }
}