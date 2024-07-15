import java.util.Scanner;

public class ButterflyPattern {

    public static void printStar(int size){
        for(int i=1;i<=size;i++){
            System.out.print("*");
        }
        return;
    }
    public static void printSpace(int size){
        for(int i=1;i<=size;i++){
            System.out.print(" ");
        }
        return;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Butterfly ");
        int n=in.nextInt();
        
        //Upper Part
        for(int i=1;i<=n;i++){
            printStar(i);
            int s=(n*2)-(2*i);
            printSpace(s);
            printStar(i);
            System.out.println();
        }

        //Lower Part
        for(int i=n;i>=1;i--){
            printStar(i);
            int s=(n*2)-(2*i);
            printSpace(s);
            printStar(i);
            System.out.println();
        }

        in.close();
    }
    
}
