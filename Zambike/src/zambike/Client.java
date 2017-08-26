package zambike;
import java.util.*;
 
public class  Client{
    
    public static void main(String[]args){
String clientName;
String country;
int accountNumber;
//Get Inputs
Scanner scanner=new Scanner(System.in);


System.out.println("Enter your name");
clientName=scanner.next();

System.out.println("Enter your accountNumber");
accountNumber=scanner.nextInt();

System.out.println("Enter your counry name");
country=scanner.next();
try{
    clientName=scanner.next();
    if(clientName.equals(""))
    {
    throw new NullPointerException();
    }
}
    catch(NullPointerException e){
           System.out.println("Invalid input");
            }
    }
}








    

