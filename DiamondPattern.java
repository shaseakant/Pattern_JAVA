import java.util.Scanner;

public class DiamondPattern {

    public static void printStar(int s){
        for(int i=1;i<=s;i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int l=in.nextInt();

        int s=-1;
        for(int i=((l+1)/2)-1;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            s=s+2;
            printStar(s);
            System.out.println();
        
        }
        for(int i=1;i<=((l+1)/2)-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            s=s-2;
            printStar(s);
            System.out.println();

        }

        in.close();
    }
    
}
