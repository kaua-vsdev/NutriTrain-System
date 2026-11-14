package Treinos;
 import java.util.Scanner;

 public class Rotina_treinos{
 public static void main(String []args){
        Scanner sc = new Scanner(System.in);

       main_Rotina_treinos RT = new main_Rotina_treinos();

        System.out.println("Qual tipo de treino você irá fazer?");
        System.out.println("1 - Musculação");
        System.out.println("2 - atividades mistas ou aerobicos");
        RT.setEscolha(sc.nextInt());
        RT.getEscolha();

        System.out.println("");
        System.out.println("==== Escolha tipo de treino ====");
        if(RT.escolha == 1){
              System.out.println("Qual treino você irá realizar? ");
              System.out.println("1 - Full Body");
              System.out.println("2 - ABC");
              RT.setMusc(sc.nextInt());
              System.out.println("\n========================================");
              System.out.println("  TREINO FULL BODY (SEGUNDA A SEXTA)    ");
              System.out.println("========================================");
              RT.fullbody = (sc.nextInt());
              RT.getMusc();
              if(RT.musc == 2){
              RT.ABC = sc.nextInt();
              RT.getMusc();
              }
       }else if(RT.escolha == 2){
              System.out.println("Qual treino você irá realizar? ");
              System.out.println("1 - RML");
              System.out.println("2 - Explosivo");
              RT.setExercicio_cardio(sc.nextInt());
        }







       }
}