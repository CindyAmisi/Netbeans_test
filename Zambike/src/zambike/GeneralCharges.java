package zambike;


import java.util.*;
import java.text.*;


class PaymentCalculator
{
 public static void main(String[]args)
 {
   double firstPayment,bankCharges,finalPayment;
   int price;
   Scanner scanner=new Scanner(System.in);
   
//Get values
System.out.println("Price:");
price=scanner.nextInt();
System.out.println("First Payment :");
firstPayment=scanner.nextDouble();
System.out.println("Bank Charges :");
bankCharges=scanner.nextDouble();


//Compute payments
firstPayment=(0.5*price);
finalPayment=(price+firstPayment+bankCharges);

//Display payment
System.out.println("The first payment is: "+firstPayment);
System.out.println("The final payment is: "+finalPayment);
 }
}




