// A messaging application needs to block inappropriate words before displaying messages. Given 
// a chat message and a list of blocked words, replace each blocked word with **** and display the 
// filtered message.
import java.util.*;
class filtered_msg{
    public static void main(String[] r){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter messege: ");
        String m =sc.nextLine();
        System.out.print("Enter blocked words with ',': ");
        String blocked=sc.nextLine();
        String b[]=blocked.split(",");
        for(int i=0;i<=b.length-1;i++){
            m=m.replace(b[i],"****");
        }
        System.out.println("Filterd messege: "+m);
    }}
