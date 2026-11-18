package calcularTDEE;

import calculadoraTMB.CalcularTMB;

public class CalcularTDEE {

    public static double tdee(double peso, double altura, int idade, String sexo, int atividade) {
        double tmb = CalcularTMB.calcular(peso, altura, idade, sexo);

        switch (atividade) {
            case 1: return tmb * 1.2;    // sedentário
            case 2: return tmb * 1.375;  // atividade leve
            case 3: return tmb * 1.55;   // atividade moderada
            case 4: return tmb * 1.725;  // atividade intensa
            case 5: return tmb * 1.9;    // atividade muito intensa
            default: return tmb;         // valor inválido
        }
    }
}