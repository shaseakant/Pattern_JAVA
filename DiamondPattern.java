import java.util.Scanner;

public class DiamondPattern {

    public static void printStar(int n){
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int l=in.nextInt();

        int n=-1;
        for(int i=((l+1)/2)-1;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            n=n+2;
            printStar(n);
            System.out.println();
        
        }
        for(int i=1;i<=((l+1)/2)-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            n=n-2;
            printStar(n);
            System.out.println();

        }

        in.close();
    }
    
}
