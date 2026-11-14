import java.util.Locale;
import java.util.Scanner;

public class Objetivo_alimentar {
   public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
   
    mainAlimen MA = new mainAlimen();

    System.out.println("==== DIGITE SEUS DADOS ====");
    System.out.println("Digite seu peso: ");
    MA.setPeso(sc.nextDouble());
    System.out.println("");
    System.out.println("Digite sua altura (em cm): ");
    MA.setAltura(sc.nextDouble());
    System.out.println("");
    System.out.println("Digite sua idade: ");
    MA.setIdade(sc.nextInt());
    do{
    System.out.println("1. Masculino 2.Feminino");
    System.out.println("Digite seu sexo: ");
    MA.setSexo(sc.nextInt());
    if(MA.getSexo() > 2){
      System.out.println("Sexo biologico não reconhecido");
    }
    }while(MA.getSexo() > 2);
    System.out.println("1. Sedentario 2.Levemente ativo 3.Moderadamente ativo 4. Muito ativo 5. Extremamente ativo");
    System.out.println("Digite seu nivel de atividade fisica: ");
    MA.setNiv_atv_fis(sc.nextInt());
    System.out.println("1. Manter peso 2. Cutting 3. Bulking");
    System.out.println("Digite seu objetivo: ");
    MA.setObjetivo(sc.nextInt());

    System.out.println("==== TMB ====");
    System.out.println("Seu TMB é: " + MA.getTMB());

    System.out.println("==== GET ====");
    System.out.println("seu GET é: " + MA.getTDEE());

    System.out.println("==== Objetivo ====");
    System.out.println(MA.getObj());

sc.close();
   } 
}
