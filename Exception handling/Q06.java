// Employee Registration System,Develop an employee registration portal that accepts Employee ID,
// Name, Age, Email, Mobile Number, Department, and Salary.
// Validate:
// Employee ID must start with EMP.
// Age must be between 21 and 60.
// Email must belong to company.com.
// Salary should be greater than ₹15,000.
// Mobile number must contain exactly 10 digits.
// Throw custom exceptions for invalid data
import java.util.*;
public class EmployeeRegistrationSystem{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    try {
            System.out.print("Enter employeeId: ");
            String id = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter salary: ");
            int salary = sc.nextInt();
sc.nextLine();
            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();
            
            if (!id.trim().startsWith("EMP")){
                throw new IdException("Invalid employeeId");
            }
            if (age<21 || age>60){
                throw new AgeException("Age does not match");
            }
            if (salary<15000){
                throw new SalaryException("Invalid salary details");
            }
            if (!email.trim().endsWith("company.com")){
                throw new EmailException("Not a company email");
            }
            if (phone.length()!=10){
                throw new MobileException("Invalid number sequence");
            }
        }
        catch(IdException e){
        System.out.println("Exception occured: "+ e.getMessage());
        }
        catch(AgeException e){
        System.out.println("Exception occured: "+ e.getMessage());
        } catch(SalaryException e){
        System.out.println("Exception occured: "+ e.getMessage());
        } catch(EmailException e){
        System.out.println("Exception occured: "+ e.getMessage());
        } catch(MobileException e){
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
class IdException extends Exception{
    public IdException(String msg){
        super(msg);
    }
}
class AgeException extends Exception{
    public AgeException(String msg){
        super(msg);
    }
}
class SalaryException extends Exception{
    public SalaryException(String msg){
        super(msg);
    }
}
class EmailException extends Exception{
    public EmailException(String msg){
        super(msg);
    }
}
class MobileException extends Exception{
    public MobileException(String msg){
        super(msg);
    }
}
