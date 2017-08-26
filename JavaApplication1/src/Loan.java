/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CINDY MOI AMISI
 */import java.util.*;
import java.util.*;

public class LoanCalculator{
  public static void main(String[]args){
    
    double loanAmount, annualInterestRate;
    int duration;
    
    Loan loan=new Loan();
    Scanner scanner;
    scanner=new Scanner(System.in);
    
  //Get the input values
  System.out.println("Input loan");
   loanAmount=scanner.nextDouble();
  
  System.out.println("Input payment period in years");
   duration=scanner.nextInt();
  
  System.out.println("Input annual interest charge");
    annualInterestRate=scanner.nextDouble();
  
  }


}

public class Loan{
  
  private static final int MONTHS=12;
  private double loanAmount;
  private double monthlyInterestRate;
  private int numberOfPayments;
  
}

//Returns the loan amount
public double getloanAmount( double loanAmount) {
return loanAmount;
}
//Returns the loan duration in number of years
public int getDuration( ) {
return numberOfPayments / MONTHS;
}
//Returns the loan's annual interest rate
public double getRate( ) {
return monthlyInterestRate * 100.0 * MONTHS;
}
//Sets the loan amount
public void setAmount(double amount) {
loanAmount = amount;
}
//Sets the annual interest rate
public void setRate(double annualRate) {
monthlyInterestRate = annualRate / 100.0 / MONTHS;
}
//Sets the loan period
public void setPeriod(int periodInYears) {
numberOfPayments = periodInYears * MONTHS;
}
public double getMonthlyPayment(){
  monthlyPayment=(loanAmount*loan.getmonthlyInterestRate())/(1-Math.pow(1/(1+loan.getmonthlyInterestRate),duration));
  
return monthlyPayment;
}
public double getTotalPayment(){
  totalPayment=loan.getMonthlyPayment*numberOfPayments;
  
  return totalPayment;

}
  
 //Output the result
  System.out.println("Your montlhy payment is"+ loan.getMonthlyPayment);
  System.out.println("Your total payment is" + loan.getTotalPayment);
    
}
}

  
