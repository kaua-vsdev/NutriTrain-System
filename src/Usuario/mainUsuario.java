package usuario;

import java.util.Scanner;
import login.login;
import login.mainLogin;
import calculadoraTMB.CalcularTMB;
import dados.mainDados;
import calcularTDEE.CalcularTDEE;

public class mainUsuario {
        public static void main(String []args){
        Scanner sc = new Scanner(System.in);


        mainLogin Usu = login.cadastrar(sc);
        
        if(Usu == null){
            return;
        }
        String dd = " ";
        int opcao;
        do{
            System.out.println("1 - Verificar TMB");
            System.out.println("2 - Verificar dados do Usúario");
            System.out.println("3 - TDEE");
            System.out.println("4 - Sair");

             opcao = sc.nextInt();

            switch (opcao) {
             case 1:
            double tmb = CalcularTMB.calcular(
            Usu.getPeso(),
            Usu.getAltura(),
            Usu.getIdade(),
            Usu.getSexo());

    System.out.println("------- Tabela Taxa de metabolismo Basal -------");
    System.out.printf("Sua TMB é de %.2f kcal/dia%n", tmb);
    break;
            case 2:
                mainDados.Dados(
                Usu.getNome(),
                Usu.getPeso(),
                Usu.getAltura(),
                Usu.getIdade(),
                Usu.getSexo(),
                Usu.getAtividade());
                System.out.println(dd);
    break;
            case 3:
                double TDEE = CalcularTDEE.tdee(
                Usu.getPeso(),
                Usu.getAltura(),
                Usu.getIdade(),
                Usu.getSexo(),
                Usu.getAtividade());
                System.out.println("------- Tabela Gasto Energético Diário Total -------");
                System.out.printf("Seu TDEE é de %.2f kcal/dia%n", TDEE);
                System.out.println("------- Para obter Déficit calórico --------");
                double Deficit = TDEE - 300;
                System.out.printf("Seu Deficit é de %.2f kcal/dia%n", Deficit);
                System.out.println("------- Para obter Superávit calórico --------");
                double Superavit = TDEE + 200;
                System.out.printf("Seu superávit é de %.2f kcal/dia%n", Superavit);
    break;
            case 4:
                System.out.println("Obrigado por utilizar nosso sistema!!");
    break;
            }

        }   while(opcao != 4);
    }
}