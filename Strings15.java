// A content management system receives articles from writers. Develop a program to display: 
// total number of words  
// total number of characters  
// longest word  
// shortest word  
// average word length
import java.util.*;
class content{
    public static void main(String[] r){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        String[] arr=s.split(" ");
        System.out.println("Total Words: "+arr.length);
        System.out.println("Total Characters: "+s.length());
        String long_word=arr[0];
        String short_word=arr[0];
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            count=count+arr[i].length();
            if (arr[i].length()>long_word.length()){
                long_word=arr[i];
            }
            else if(arr[i].length()<short_word.length()){
                short_word=arr[i];
        }
        else{}
    }
        System.out.println("Longest word: " +long_word);
    System.out.println("shortest word: " +short_word);

    System.out.println("Average word length: %.2f" +(float) count/arr.length);
}
}
