public class Persona {
    private String Nombre;
    private Integer Edad;
    private Integer FechaNacimiento;

    public Persona(String nombre, Integer edad, Integer fechaNacimiento) {
        Nombre = nombre;
        Edad = edad;
        FechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Integer getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}
