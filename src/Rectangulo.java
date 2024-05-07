public class Rectangulo extends FiguraGeometrica{
    private float Base;
    private float Altura;

    public Rectangulo(String nombreFigura, String colorFigura, float base, float altura) {
        super(nombreFigura, colorFigura);
        Base = base;
        Altura = altura;
    }

    public float getBase() {
        return Base;
    }

    public void setBase(float base) {
        Base = base;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float altura) {
        Altura = altura;
    }
}
