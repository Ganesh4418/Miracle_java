// An HR system wants to display employee initials on ID cards. Write a program to accept the employee's full name and generate initials
import java.util.*;
class initials {
    public static void main(String[] r) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String name=sc.nextLine();
        String arr[]=name.split(" ");
        String initial=".";
        for(int i=0;i<=arr.length-1;i++){
            initial+=(arr[i].charAt(0)+".");
        }
        System.out.println(initial.replaceAll("^\\.+|\\.+$", ""));
    }
}
