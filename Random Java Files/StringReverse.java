import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in a string: ");
        String myString = input.next();
        String reverseString="";
        
        for(int i=myString.length()-1; i>=0; i--){
            reverseString= reverseString + myString.charAt(i);
        }
        System.out.print(myString+" in reverse is: " +reverseString);
    }
}