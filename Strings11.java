//A company stores website URLs submitted by customers. Write a program to check whether the entered URL starts with http:// or https:// and display whether it is a valid website URL. 
import java.util.*;
class url {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter url: ");
        String url=sc.nextLine();
        if (url.startsWith("http://")||url.startsWith("https://")){
            System.out.println("Valid website URL");
        }
        else{
            System.out.println("Invalid website URL");
        }
    }
}
