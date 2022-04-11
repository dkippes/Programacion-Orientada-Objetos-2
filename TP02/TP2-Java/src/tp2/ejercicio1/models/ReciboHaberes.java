package tp2.ejercicio1.models;

public class ReciboHaberes {
    private Empleado empleado;

    public ReciboHaberes(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "ReciboHaberes{" +
                "\nnombreEmpleado='" + empleado.nombre + '\'' +
                ", \ndireccion='" + empleado.direccion + '\'' +
                ", \nsueldoBruto=" + empleado.calcularSueldoBruto() +
                ", \nsueldoNeto=" + empleado.calcularSueldoNetoRestante() +
                ", \ndesgloseConceptos='" + empleado.getConceptos() + '\'' +
                '}' + "\n";
    }
}
