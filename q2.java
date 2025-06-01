
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int itr = 1;

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                for(int j = 0; j  < 4; j++){
                    if(j == 3){
                        itr++;
                        System.out.print(itr);
                    }else{
                        System.out.print(itr);
                    }
                }
                System.out.println();
            }else{
                for(int j = 0; j < 4; j++){
                    if(j == 0){
                        System.out.print(itr+1);
                    }else{
                        System.out.print(itr);
                    }
                }
                itr++;
                System.out.println();
            }
        }
    }
}
