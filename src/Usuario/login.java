import java.util.Locale;
import java.util.Scanner;

public class login{
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    Usuario Usu = new Usuario();

    System.out.println("==================================");
    System.out.println("Seja Bem-Vindo ao NutriTrain System");
    System.out.println("==================================");

    System.out.println("CADASTRAMENTO");
    System.out.println("Digite seu nome");
    Usu.setNome(sc.nextLine());

    do{
        if(Usu.getNome() == null || Usu.getNome().trim().isEmpty()){
            System.out.println("ERRO!!");
            System.out.println("Digite novamente");
            Usu.setNome(sc.nextLine());
        }

    } while(Usu.getNome() == null || Usu.getNome().trim().isEmpty());

    System.out.println("Nome: " + Usu.getNome());
    //Esse bloco verifica se o nome foi iserido

    System.out.println("Digite sua idade: ");
    Usu.setIdade(sc.nextInt());

    if(Usu.getIdade() < 16){
        System.out.println("Idade para cadastro não permitida, necessário maior de 16!!");
    } else if(Usu.getIdade() > 15){ //O restante do cadastro é feito somente com a validação da idaded
        System.out.println("Digite seu peso: ");
        Usu.setPeso(sc.nextDouble());
        do{
        if(Usu.getPeso() <= 0){
            System.out.println("ERRO!!");
            System.out.println("Digite novamente");
            Usu.setPeso(sc.nextDouble());
        } else if(Usu.getPeso() < 20){
            System.out.println("Confirma esse peso? (Sim/Não)");
            String Confirm = sc.nextLine();
            boolean confirma = Confirm.equalsIgnoreCase("Sim");
            
            
            if(confirma == true){
                System.out.println("Digite novamente, por gentileza");
                Usu.setPeso(sc.nextDouble());
                System.out.println("Cadastrado");
            }
            
        }
    } while(Usu.getPeso() <= 0 || Usu.getPeso() < 20);//Caso o peso seja menor que zero, ele pede novamente

        System.out.println("Digite sua altura (cm)");
        Usu.setAltura(sc.nextDouble());
        do{
        if(Usu.getAltura() <= 0){
            System.out.println("ERRO!!");
            System.out.println("Digite novamente");
            Usu.setAltura(sc.nextDouble());
        }
    } while(Usu.getAltura() <= 0);
    }
   
    }
}
