package calculadoraTMB;

import login.mainLogin;
import usuario.usuario;

public class CalcularTMB {
    public static double calculatormifflinstjeor(double peso, double altura, int idade, String sexo){
       if(sexo.equalsIgnoreCase("M")){
        return (10 * peso) + (6.25 * altura) - (5 * idade) + 5;
       } 
       return 0.0;
    }
}
