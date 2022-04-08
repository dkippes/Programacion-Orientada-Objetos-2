package tp2.models;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String cuit;
    private List<Empleado> empleados;
    private List<ReciboHaberes> reciboHaberes;

    public Empresa() {
        this.empleados = new ArrayList<>();
        this.reciboHaberes = new ArrayList<>();
    }

    public Empresa(String nombre, String cuit) {
        this();
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public Empresa addEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
        return this;
    }

    public Double calcularMontoTotalSueldosNeto() {
        return empleados.stream()
                .map(Empleado::calcularSueldoNetoRestante)
                .reduce(0D, Double::sum);
    }

    public Double calcularMontoTotalSueldosBruto() {
        return empleados.stream()
                .map(Empleado::calcularSueldoBruto)
                .reduce(0D, Double::sum);
    }

    public Double calcularMontoTotalRetenciones() {
        return empleados.stream()
                .map(Empleado::calcularRetenciones)
                .reduce(0D, Double::sum);
    }

    public void liquidacionSueldos() {
        for (Empleado e: empleados) {
            ReciboHaberes reciboHaberes = new ReciboHaberes();
            reciboHaberes.setNombreEmpleado(e.getNombre());
            reciboHaberes.setDireccion(e.getDireccion());
            reciboHaberes.setSueldoBruto(e.calcularSueldoBruto());
            reciboHaberes.setSueldoNeto(e.calcularSueldoNetoRestante());
            reciboHaberes.setDesgloseConceptos(e.getConceptos());
            this.reciboHaberes.add(reciboHaberes);
        }
    }

    public List<ReciboHaberes> getReciboHaberes() {
        return reciboHaberes;
    }
}