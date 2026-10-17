public class Calculos {

    //getters and setters
    private double n1;
    private double n2;

      /* 
    double n1;
    double n2;

    public double soma () {
        return this.n1 + this.n2
    }
   */
  
    public double soma (double n1, double n2){
        //retorna o resultado
    return n1 + n2;
}

// getter and setter
public double subtracao (double n1, double n2){
    //retorna o resultado
    return n1 - n2;
}

public double multiplicacao (double n1, double n2){
    //retorna o resultado
    return n1 * n2;
}

public double divisao (double n1, double n2){
    //retorna o resultado
    return n1 / n2;
}

public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

 public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }


}