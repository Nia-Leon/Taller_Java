public class Circulo extends FiguraGeometrica{
    private float Radio;

    public Circulo(String nombreFigura, String colorFigura, float radio) {
        super(nombreFigura, colorFigura);
        Radio = radio;
    }

    public float getRadio() {
        return Radio;
    }

    public void setRadio(float radio) {
        Radio = radio;
    }
}
