public class Estudiante extends Persona{
    private Integer Grado;

    public Estudiante(String nombre, Integer edad, Integer fechaNacimiento, Integer grado) {
        super(nombre, edad, fechaNacimiento);
        Grado = grado;
    }

    public Integer getGrado() {
        return Grado;
    }

    public void setGrado(Integer grado) {
        Grado = grado;
    }

    @Override
    public void mensaje(){
        super.mensaje();
        System.out.print(" , Mi grado es: " + this.Grado);
    }
}
