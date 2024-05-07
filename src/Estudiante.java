public class Estudiante extends Persona{
    private Integer Grado;

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
