public class Vendedor extends Empleado2{
    private float Comision;

    public Vendedor(String nombre, float salarioBasico) {
        super(nombre, salarioBasico);
    }
    public float CalcularSalario(){
        return super.CalcularSalario() + Comision;
    }
}
