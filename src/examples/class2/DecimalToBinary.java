package examples.class2;
//Maria George's homework on decimal to binaryand binary to decimal conversion
public class DecimalToBinary {

public static void main (String [] args){
    System.out.println("Enter the decimal number to be converted into a binary number");
    
    String binary = "";
    
    int decimal = Integer.parseInt(args[0]);
    int remainder = 0;
    
    while ( decimal > 0) {
        //
        remainder = decimal % 2;
        decimal = decimal / 2;
        binary = remainder + binary;
    }
    
    System.out.println ( "The binary value of decimal "+ decimal + " is "+ binary);
  }

}
