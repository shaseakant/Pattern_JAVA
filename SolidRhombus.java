import java.util.Scanner;
public class SolidRhombus {

    public static void printSpace(int size){
        for(int i=1;i<=size;i++){
            System.out.print(" ");
        }
    }
    public static void printStar(int size){
        for(int i=1;i<=size;i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of Rhombus : ");
        int n=in.nextInt();

        for(int i=1;i<=n;i++){
            printSpace((n-i));
            printStar(n);
            System.out.println();
        }

        in.close();
    }
    
}
