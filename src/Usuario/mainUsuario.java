package usuario;

import java.util.Scanner;
import login.login;
import login.mainLogin;
import calculadoraTMB.CalcularTMB;
import dados.mainDados;

public class mainUsuario {
        public static void main(String []args){
        Scanner sc = new Scanner(System.in);


        mainLogin Usu = login.cadastrar(sc);
        
        if(Usu == null){
            return;
        }
        int opcao;
        do{
            System.out.println("1 - Verificar TMB");
            System.out.println("2 - Verificar dados do Usúario");
            System.out.println("3 - Sair");

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
                double dd = mainDados.Dados(
                Usu.getNome(),
                Usu.getPeso(),
                Usu.getAltura(),
                Usu.getIdade());
                System.out.println(dd);
    break;
            }

        }   while(opcao != 3);
    }
}