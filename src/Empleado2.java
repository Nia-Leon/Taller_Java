public class Empleado2 {
    private String Nombre;
    private float SalarioBasico;

    public Empleado2(String nombre, float salarioBasico) {
        Nombre = nombre;
        SalarioBasico = salarioBasico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public float getSalarioBasico() {
        return SalarioBasico;
    }

    public void setSalarioBasico(float salarioBasico) {
        SalarioBasico = salarioBasico;
    }
}
