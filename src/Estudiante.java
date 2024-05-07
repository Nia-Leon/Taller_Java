public class Estudiante extends Persona implements Trabajador{
    private Integer Grado;

    public Estudiante(String nombre, Integer edad, Integer fechaNacimiento, Integer grado) {
        super(nombre, edad, fechaNacimiento);
        Grado = grado;
    }
    public void realizarTarea(){
        System.out.println("Realizando tarea escolar");
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
