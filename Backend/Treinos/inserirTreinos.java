import java.util.Scanner;

public class inserirTreinos{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        String x;
        System.out.println("Digite a quantidade de exercicios que deseja realizar: ");
        int y = sc.nextInt();

        System.out.println("Digite quais são eles: ");
        for(int i = 0; i != y; i++){
            x = sc.nextLine();
        }
    }
}