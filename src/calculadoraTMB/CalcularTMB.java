package calculadoraTMB;

import login.mainLogin;
import login.login;

public class CalcularTMB { 

    public static double calcular(double peso, double altura, int idade, String sexo){
        double TMB = (10 * peso) + (6.25 * altura) - (5 - idade);

        if(sexo.equalsIgnoreCase("M")){
            return TMB + 5;
        }

        return TMB - 161;
    }
}
