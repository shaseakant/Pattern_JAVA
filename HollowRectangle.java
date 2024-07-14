import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        int l=in.nextInt();
        System.out.println("Enter the breadth of the rectangle : ");
        int b=in.nextInt();

        for(int i=1;i<=l;i++){
            for(int j=1;j<=b;j++){
                if(i==1 || i==l || j==1 || j==b){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
