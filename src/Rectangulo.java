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

    public void calcularArea(){
        System.out.println("El area de este rectangulo es de: \n" + (this.Base*this.Altura) + "cm^2");
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este rectangulo es de: \n" + (this.Base*2+this.Altura*2)+"cm");
    }
}
