package examples.class2;
//Maria George's homework on decimal to binary and binary to decimal conversion
public class DecimalToBinary {

public static void main (String [] args){
    System.out.println("The decimal number you entered is :" + args[0]);
    int decimal = Integer.parseInt(args[0]);
    int binary = decimalToBinary(decimal);
    System.out.println ( "The binary value of decimal "+ decimal + " is "+ binary);
    System.out.println ( "The decimal value of binary "+ binary + " is "+ binaryToDec(binary));
  }
  
  public static int decimalToBinary(int decimal) {
    String binary = "";
    
    int remainder = 0;
    
    while ( decimal > 0) {
        //
        remainder = decimal % 2;
        decimal = decimal / 2;
        binary = remainder + binary;
    }
    
    return Integer.parseInt(binary);
      
  }

    public static int binaryToDec (int binary){
        int power=0;
        int dec=0;
        while(true){
            if(binary==0){
                break;
           }
           else{
               int temp=binary%10;
               dec+=temp*Math.pow(2 , power);
               binary=binary/10;
               power++;
           }
        }
        return dec;
    }
    
}



     
  
    
     

