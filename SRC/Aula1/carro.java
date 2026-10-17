public class carro {
    String marca = "BYD";
    String modelo = "Seal";
    String ano = "2024";

    public String marca() {
        return marca;
    }

    public String modelo() {
        return modelo;
    }

    public String ano() {
        return ano;
    }

    public static void main(String[] args) {
        carro c = new carro();
        System.out.println(c.marca());
        System.out.println(c.modelo());
        System.out.println(c.ano());
    }
}

