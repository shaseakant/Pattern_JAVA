import java.util.Scanner;

public class InvertedHalfPyramid180 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of the Pyramid : ");
        int l=in.nextInt();

        for(int i=1;i<=l;i++){
            for(int j=1;j<=l;j++){
                if(j>(l-i)){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
    
}
