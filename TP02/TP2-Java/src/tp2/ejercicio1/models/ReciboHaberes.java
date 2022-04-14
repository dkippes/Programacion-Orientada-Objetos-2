package tp2.ejercicio1.models;

public class ReciboHaberes {
    public String generarReciboHaberes(Empleado empleado) {
        return "ReciboHaberes{" +
                "\nnombreEmpleado='" + empleado.nombre + '\'' +
                ", \ndireccion='" + empleado.direccion + '\'' +
                ", \nsueldoBruto=" + empleado.calcularSueldoBruto() +
                ", \nsueldoNeto=" + empleado.calcularSueldoNetoRestante() +
                ", \ndesgloseConceptos='" + empleado.getConceptos() + '\'' +
                '}' + "\n";
    }
}
