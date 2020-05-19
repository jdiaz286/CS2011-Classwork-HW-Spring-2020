import java.util.Scanner;
public class areaOfRectangle{
    public static void main(String[] args){
    Scanner myobj = new Scanner(System.in);
    System.out.println("Please type in what you would like the height to be: ");
    double width = myobj.nextDouble();
    System.out.print("Please type in what you would like the width to be: ");
    double height = myobj.nextDouble();
    double area = height * width;
    System.out.print("The area of the rectangle: "+ area);
    }
}