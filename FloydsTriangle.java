import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of the Floys's triangle : ");
        int l=in.nextInt();
        int n=1;
        for(int i=1;i<=l;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
        in.close();
    }
    
}
