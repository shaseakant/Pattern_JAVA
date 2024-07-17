import java.util.Scanner;

public class PalindromicPattern {

     public static void printNum(int n){
        for(int i=n;i>=1;i--){
            System.out.print(i);
        }
        for(int i=2;i<=n;i++){
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int l=in.nextInt();

        int n=1;
        for(int i=l-1;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            printNum(n);
            System.out.println();
            n++;
        }

        in.close();
    }
    
}
