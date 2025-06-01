import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tmp = 1;    
        for(int i = 0; i < n; i++){
            if(i %2 == 0){
                for(int j = 0; j < i+1; j++){
                    System.out.print(tmp);
                    if(j != i){
                        System.out.print("*");
                    }
                    tmp++;
                }
                System.out.println();
            }
            else{
                int idx = tmp + i;
                for(int j = 0; j < i+1; j++){
                    System.out.print(idx);
                    if(j != i){
                        System.out.print("*");
                    }
                    idx--;
                    tmp++;
                }
                System.out.println();
            }
        }
    }
}