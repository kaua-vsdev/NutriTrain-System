public class mainAlimen {

    double peso;
    double altura;
    int sexo;
    int idade;
    int niv_atv_fis;
    int objetivo;
    double TMB = 0.0;

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getSexo() {
        return sexo;
    }
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getNiv_atv_fis(){
        return niv_atv_fis;
    }

    public void setNiv_atv_fis(int niv_atv_fis) {
        this.niv_atv_fis = niv_atv_fis;
    }
    public int getObjetivo() {
        return objetivo;
    }
    public void setObjetivo(int objetivo) {
        this.objetivo = objetivo;
    }

  public double getTMB(){ //Estou calculando o TMB (Taxa metabolica basal)
    if(sexo == 1){
    TMB = (10 * getPeso()) + (6.25 * getAltura()) - (5  * getIdade()) + 5;
    } else if(sexo == 2){
    TMB = (10 * getPeso()) + (6.25 * getAltura()) - (5 * getIdade()) - 161;
    }
    return TMB;
}

public void setTMB(double TMB){
    this.TMB = TMB;
}

double TDEE = 0.0;

public double getTDEE(){//Calculando o gasto energetico total
    switch (niv_atv_fis) {
        case 1:
        TDEE = TMB * 1.2;
            break;
        case 2:
        TDEE = TMB * 1.375;
            break;
        case 3:
        TDEE = TMB * 1.55;
            break;
        case 4:
        TDEE = TMB * 1.725;
            break;
        case 5:
        TDEE = TMB * 1.9;
            break;
        default:
            System.out.println("ERRO!! informação não consta em sistema");
            break;
    }
    return TDEE;
}

public void setTDEE(double TDEE){
    this.TDEE = TDEE;
}

double Obj = 0.0;
public double getObj(){ //Calculando o quanto de caloria preciso ingerir para meu objetivo
    if(objetivo == 1){
    Obj = TDEE;
    System.out.println("Objetivo manter o peso");
    }else if(objetivo == 2){
    Obj = TDEE - 400;
    System.out.println("Objetivo perder peso");
    } else if(objetivo == 3){
        Obj = TDEE + 400;
        System.out.println("Objetivo ganhar peso");
    }

    return Obj;
} 
}