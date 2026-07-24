// 1.Student Admission Portal,Develop a student admission system that validates:
// Name should not be empty.
// Age should be between 17 and 25.
// Marks should be between 0 and 100.
// Email should contain @.
// Phone number should contain exactly 10 digits.
// -- Use custom exceptions for each validation failure.
import java.util.*;
public class AdmissionPortal{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
sc.nextLine();
            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();
            
            if (name.trim().isEmpty()){
                throw new NameException("Name is required");
            }
            if (age<17 || age>25){
                throw new AgeException("Age is not in eligible category");
            }
            if (marks<0 || marks>100){
                throw new MarksException("Invalid marks");
            }
            if (!email.contains("@")){
                throw new EmailException("Invalid email format");
            }
            if (phone.length()!=10){
                throw new MobileException("Invalid number sequence");
            }
        }
        catch(NameException e){
        System.out.println("Exception occured: "+ e.getMessage());
        }
        catch(AgeException e){
        System.out.println("Exception occured: "+ e.getMessage());
        } catch(MarksException e){
        System.out.println("Exception occured: "+ e.getMessage());
        } catch(EmailException e){
        System.out.println("Exception occured: "+ e.getMessage());
        } catch(MobileException e){
        System.out.println("Exception occured: "+ e.getMessage());
        } 
        finally{
            sc.close();
        }
    }
}
class NameException extends Exception{
    public NameException(String msg){
        super(msg);
    }
}
class AgeException extends Exception{
    public AgeException(String msg){
        super(msg);
    }
}
class MarksException extends Exception{
    public MarksException(String msg){
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
