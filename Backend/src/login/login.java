package login;

import java.util.Locale;
import java.util.Scanner;

import calculadoraTMB.CalcularTMB;
import usuario.mainUsuario;

public class login{
public static mainLogin cadastrar(Scanner sc){
    Locale.setDefault(Locale.US);

    mainLogin Usu = new mainLogin();

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

    //Esse bloco verifica se o nome foi iserido

    System.out.println("Digite sua idade: ");
    Usu.setIdade(sc.nextInt());

    if(Usu.getIdade() < 16){
        System.out.println("Idade para cadastro não permitida, necessário maior de 16!!");
    } else if(Usu.getIdade() > 15){ //O restante do cadastro é feito somente com a validação da idade
        System.out.println("Digite seu peso: ");
        Usu.setPeso(sc.nextDouble());

        do{
        if(Usu.getPeso() <= 10){
            System.out.println("ERRO!!");
            System.out.println("Digite novamente");
            Usu.setPeso(sc.nextDouble());  
        } 
    } while(Usu.getPeso() <= 0);//Caso o peso seja menor que zero, ele pede novamente

        System.out.println("Digite sua altura(cm)");
        Usu.setAltura(sc.nextDouble());
        do{
        if(Usu.getAltura() <= 50){
            System.out.println("ERRO!!");
            System.out.println("Digite novamente");
            Usu.setAltura(sc.nextDouble());
        } 
    } while(Usu.getAltura() <= 0);

    System.out.println("Digite seu sexo (M/F)");
    Usu.setSexo(sc.next());

    if(Usu.getSexo().equalsIgnoreCase("M")){
        System.out.println("Masculino");
    } else if(Usu.getSexo().equalsIgnoreCase("F")){
        System.out.println("Feminino");
    }
    
    System.out.println("-------------------------------------------------");
    System.out.println("Digite seu nivel de atividade fisica: ");
    System.out.println("----------------------------------------------------");
    System.out.println("Sedentario (pouco ou nenhum exercicio, trabalho sentado) - 1");
    System.out.println("Ligeiramente ativo (1 a 3 dias de exericio) - 2");
    System.out.println("Moderadamente ativo (3 a 5 dias de exericio) - 3");
    System.out.println("Muito ativo (6 a 7 dias de exercicio)- 4");
    System.out.println("Extremamente ativo (Treino pesado diario ou trabalho fisico intenso) - 5");
    Usu.setAtividade(sc.nextInt());
    }

    
    System.out.println("=====================");
    System.out.println("Usúario cadastrado!!");
    System.out.println("=====================");
    
    double resultado = CalcularTMB.calcular(
    Usu.getPeso(),
    Usu.getAltura(),
    Usu.getIdade(),
    Usu.getSexo()
);

    return Usu;

    }
}
