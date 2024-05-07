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

    public void calcularArea(){
        System.out.println("El area de este circulo es de: \n" + (3.14*this.Radio*this.Radio) + "cm^2");
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este circulo es de: \n" + (2*3.14*this.Radio)+"cm");
    }
}
