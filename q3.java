
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        int itr = n;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(itr);
            }
            System.out.println();
            itr++;
        }
        itr = 2*n;
        for(int i = n; i > 0; i--){
            itr--;
            for(int j = 0; j < i; j++){
                System.out.print(itr);
            }
            System.out.println();
        }
    }
}
