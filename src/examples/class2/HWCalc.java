package examples.class2;


public class HWCalc {
    
    public static void main(String [] args){
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int product = multiply (number1 , number2);
        System.out.println(" The product of " + number1 + " and " + number2 +  " is " + product);
     }    
     
     
     public static int multiply(int number1 , int number2){
         int product = 0;
         if(number1 == 0 || number2 == 0){
             product = 0;
         }
         else {
             int smallerNumber;
             int biggerNumber;
             if(number1 < number2) {
                 smallerNumber = number1;
                 biggerNumber = number2;
                 
             } else {
                 smallerNumber = number2;
                 biggerNumber = number1;
             }
             for(int i = 0; i < smallerNumber; i++){
                 product = product + biggerNumber;
             }
         }
         return product;
     }
}

