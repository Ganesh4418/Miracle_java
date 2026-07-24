// Online Shopping Checkout,A customer places an order by entering:
// ● Product Name
// ● Quantity
// ● Price
// ● Delivery Address
// ● Mobile Number
// Validate:
// ● Quantity > 0
// ● Price > 0
// ● Address should not be empty
// ● Mobile number should be valid
// Calculate the total bill if all validations pass.
import java.util.*;
public class OnlineShoppingCheckout{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    try {
            System.out.print("Product Name: ");
            String product = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            
            System.out.print("Enter Price: ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Delivery Address: ");
            String address = sc.nextLine();
            
            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();
            
            if (quantity<=0){
                throw new QuantityException("Add atleast one item");
            }
            if (price<=0) {
                throw new PriceException("Price must be included");
            }
            if (address.trim().isEmpty()){
                throw new AddressException("Address should not be empty");
            }
            if (phone.length()!=10){
                throw new MobileException("Invalid mobile number");
            }
        }
        catch(QuantityException e){
        System.out.println("Exception occured: "+ e.getMessage());
        }
        catch(PriceException e){
        System.out.println("Exception occured: "+ e.getMessage());
        } 
        catch(AddressException e){
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
class QuantityException extends Exception{
    public QuantityException(String msg){
        super(msg);
    }
}
class PriceException extends Exception{
    public PriceException(String msg){
        super(msg);
    }
}
class AddressException extends Exception{
    public AddressException(String msg){
        super(msg);
    }
}
class MobileException extends Exception{
    public MobileException(String msg){
        super(msg);
    }
}
