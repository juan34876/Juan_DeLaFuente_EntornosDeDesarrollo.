// java version juan 2.0
package maven;

public class jb_Circulo {

    private int id;
    private double radio;
    private String color;

    // el constructor por defecto
    public jb_Circulo() {
        this.radio = 0.0;
        this.color = "desconocido";
    }

    // el constructor con todos los argumentos
    public jb_Circulo(double radio, String color) {
        this.radio = 3;
        this.color = "Verde";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = 3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = "verde";
    }

    @Override
    public String toString() {
        return "jb_Circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
    }
}
