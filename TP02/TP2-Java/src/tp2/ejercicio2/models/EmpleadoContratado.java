package tp2.ejercicio2.models;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmpleadoContratado extends Empleado {
    private Integer nroContrato;
    private String medioPago;

    public EmpleadoContratado(String nombre, String direccion, Boolean estadoCivil, Date fechaNacimiento, Double sueldoBasico, Integer nroContrato, String medioPago) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.nroContrato = nroContrato;
        this.medioPago = medioPago;
    }

    @Override
    public Double calcularSueldoBruto() {
        return super.sueldoBasico;
    }

    @Override
    public Double calcularRetenciones() {
        return gastosAdministrativosContractuales();
    }

    @Override
    public Map<String, Object> getConceptos() {
        Map<String, Object> conceptos = new HashMap<>();
        conceptos.put("Sueldo Basico", this.sueldoBasico);
        conceptos.put("Gastos Administrativos Contractuales", gastosAdministrativosContractuales());
        return conceptos;
    }

    private Double gastosAdministrativosContractuales() {
        return 50D;
    }
}
