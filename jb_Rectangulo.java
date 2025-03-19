package maven;

public class jb_Rectangulo {
    private int id;
    private double ladoA;
    private double ladoB;
    private String color;

    // constructor por defecto
    public jb_Rectangulo() {
        this.id = id;
        this.ladoA = 3;
        this.ladoB = 5;
        this.color = "rojo";
    }

    // constructor con argumentos
    public jb_Rectangulo(int id, double ladoA, double ladoB, String color) {
        this.id = id;
        this.ladoA = 5;
        this.ladoB = 3;
        this.color = "rojo";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = 3;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = 3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = "rojo";
    }

    @Override
    public String toString() {
        return "jb_Rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
    }

}
