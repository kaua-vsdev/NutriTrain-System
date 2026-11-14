import java.util.Scanner;
import java.util.Locale;

public class login {
    
    public boolean realizarLogin(Scanner sc) {
        Locale.setDefault(Locale.US);
        int entrada;
        String email;
        int senha = 0;
        String nome;
        
        System.out.println("1 - Login");
        System.out.println("2 - Abrir conta");
        System.out.println("");
        System.out.print("Deseja realizar login ou abrir uma conta: ");
        
        do {
            entrada = sc.nextInt();

            if (entrada == 1) { // Já tem conta
                System.out.println("");
                System.out.print("Digite seu nome: ");
                nome = sc.next();
                System.out.print("Digite seu e-mail: ");
                email = sc.next();
                System.out.print("Digite sua senha: ");
                senha = sc.nextInt();
                return true; // Login bem-sucedido

            } else if (entrada == 2) { // Não possui conta
                System.out.println("");
                System.out.print("Digite seu nome: ");
                nome = sc.next();
                System.out.print("Digite seu e-mail: ");
                email = sc.next();
                System.out.print("Idade: ");
                int idade = sc.nextInt();

                if (idade < 16) { 
                    System.out.println("");
                    System.out.println("Autorização dos pais: ");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    int autorizo = sc.nextInt();
                    if (autorizo == 1) {
                        System.out.print("Crie uma senha: ");
                        senha = sc.nextInt();
                        return true;
                    } else if (autorizo == 2) {
                        System.out.println("Acesso recusado");
                        return false;
                    }
                } else if (idade >= 18) {
                    System.out.print("Crie uma senha: ");
                    senha = sc.nextInt();
                    return true;
                }
            } 
            
            if (entrada < 1 || entrada > 2) {
                System.out.print("Opção inválida! Digite 1 ou 2: ");
            }
        } while (entrada < 1 || entrada > 2);
        
        return false;
    }
}