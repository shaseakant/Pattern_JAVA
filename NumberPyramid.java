import java.util.Scanner;
public class NumberPyramid {

    public static void printNum(int n){
        for(int i=1;i<=n;i++){
            System.out.print(n);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number's height : ");
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
