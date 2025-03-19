package maven;

public class Main {

    public static void main(String[] args) {

        // Instanciamos un cuadrado y un círculo
        jb_Circulo circulo1 = new jb_Circulo(3, "verde");
        jb_Rectangulo rectangulo1 = new jb_Rectangulo();

        // Calcula área cuadrado LadoA * LadoB
        double ladoA = rectangulo1.getLadoA();
        double ladoB = rectangulo1.getLadoB();
        double area1 = ladoA * ladoB;
        System.out.println("Area cuadrado: " + area1);

        // Calcula área círculo pi * R^2
        double radio1 = circulo1.getRadio();
        double area2 = radio1 * 3.14;
        System.out.println("Area circulo: " + area2);

        // Diferencia entre áreas de cuadrado y círculo
        double diferencia = area1 - area2;
        System.out.println("Diferencia áreas: " + diferencia);

        // Imprimir datos
        System.out.println("rectangulo: " + rectangulo1);
        System.out.println("Circulo: " + circulo1);
        System.out.println("Diferencia: " + diferencia);
    }
}

// clase cuadrado
class Rectangulo {
    private double lado;

    // constructor
    public Rectangulo(double lado) {
        this.lado = lado;
    }

    // getter y setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // método toString
    @Override
    public String toString() {
        return "Rectangulo{lado=" + lado + "}";
    }
}
