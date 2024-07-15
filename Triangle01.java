import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of the Pyramid : ");
        int l=in.nextInt();

        for(int i=1;i<=l;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else
                System.out.print("0");
            }
            System.out.println();
        }
        in.close();
    }
    
}
