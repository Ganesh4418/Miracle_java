// Bank Account Opening System,Create a banking application that accepts:
// ● Customer Name
// ● Aadhaar Number
// ● PAN Number
// ● Initial Deposit
// ● Mobile Number
// Validate:
// ● Aadhaar must contain exactly 12 digits.
// ● PAN should follow the standard format.
// ● Initial deposit must be at least ₹1000.
// ● Mobile number must be valid.
// Use custom exceptions for each rule.
import java.util.*;
public class BankAccountOpeningSystem{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    try {
            System.out.print("Customer name: ");
            String name = sc.nextLine();

            System.out.print("Enter adhaar number: ");
            String adhaar = sc.nextLine();

            System.out.print("Enter PAN: ");
            String pan = sc.nextLine();
            
            System.out.print("Enter initial deposit: ");
            int deposit = sc.nextInt();
sc.nextLine();
            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();
            
            if (adhaar.trim().length()!=12){
                throw new AdhaarException("Invalid Adhaar number");
            }
            if (!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
                throw new PanException("Invalid PAN number");
            }
            if (deposit<1000){
                throw new DepositException("Didn't reached minimum deposit");
            }
            if (phone.length()!=10){
                throw new MobileException("Invalid mobile number");
            }
        }
        catch(AdhaarException e){
        System.out.println("Exception occured: "+ e.getMessage());
        }
        catch(PanException e){
        System.out.println("Exception occured: "+ e.getMessage());
        } 
        catch(DepositException e){
        System.out.println("Exception occured: "+ e.getMessage());
        }
        catch(MobileException e){
        System.out.println("Exception occured: "+ e.getMessage());
        }
        catch(Exception e){
        System.out.println("Exception occured: "+ e);
        }
        finally{
            sc.close();
        }
    }
}
class AdhaarException extends Exception{
    public AdhaarException(String msg){
        super(msg);
    }
}
class PanException extends Exception{
    public PanException(String msg){
        super(msg);
    }
}
class DepositException extends Exception{
    public DepositException(String msg){
        super(msg);
    }
}
class MobileException extends Exception{
    public MobileException(String msg){
        super(msg);
    }
}
