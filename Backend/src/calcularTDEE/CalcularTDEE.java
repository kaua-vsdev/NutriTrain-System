package calcularTDEE;

import calculadoraTMB.CalcularTMB;

public class CalcularTDEE {

    public static double tdee(double peso, double altura, int idade, String sexo, int atividade) {
        double tmb = CalcularTMB.calcular(peso, altura, idade, sexo);

        switch (atividade) {
            case 1: return tmb * 1.2; //Pouco ou nenhum exercício, trabalho sentado
            case 2: return tmb * 1.375;//Exercício leve 1 a 3 dias por semana
            case 3: return tmb * 1.55;//Exercício moderado 3 a 5 dias por semana
            case 4: return tmb * 1.725;//Exercício pesado 6 a 7 dias por semana
            case 5: return tmb * 1.9;//Treino muito pesado/diário ou trabalho físico intenso
            default: return tmb;
        }

        


    }
}