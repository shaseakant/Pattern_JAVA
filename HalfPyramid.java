import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of the Pyramid : ");
        int l=in.nextInt();
        System.out.println("Enter the breadth of the Pyramid : ");
        int b=in.nextInt();

        for(int i=1;i<=l;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
    
}
