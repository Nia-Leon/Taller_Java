public class Gerente extends Empleado2{
    private float Bono;

    public Gerente(String Nombre, float SalarioBasico) {
        super(Nombre, SalarioBasico);
    }

    public float getBono() {
        return Bono;
    }

    public void setBono(float bono) {
        Bono = bono;
    }

    public float CalcularSalario(){
        return super.CalcularSalario() + Bono;
    }
}

