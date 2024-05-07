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
        if (edad > 0 ){
            this.Edad = edad;
            System.out.println("Edad establecida");
        }
        else{
            System.out.println("Ingrese una edad valida");
        }
    }

    public Integer getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public void calcularFechaNacimiento(){
        System.out.println("Su anio de nacimiento fue en el: " + (2024 - this.Edad));
    }
}
