import java.util.*;
public class Rectangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        int l=in.nextInt();
        System.out.println("Enter the breadth of the rectangle : ");
        int b=in.nextInt();

        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}