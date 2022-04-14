package tp2.ejercicio1.models;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ReciboHaberes {
    private String nombreEmpleado;
    private String direccion;
    private Date fechaEmision;
    private Double sueldoBruto;
    private Double sueldoNeto;
    private Map<String, Object> conceptos;

    public ReciboHaberes generarReciboHaberes(Empleado empleado) {
        this.nombreEmpleado = empleado.nombre;
        this.direccion = empleado.direccion;
        this.fechaEmision = new Date();
        this.sueldoBruto = empleado.calcularSueldoBruto();
        this.sueldoNeto = empleado.calcularSueldoNetoRestante();
        this.conceptos = empleado.getConceptos();
        return this;
    }
}
