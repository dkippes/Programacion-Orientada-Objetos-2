package tp2.ejercicio2.models;

import java.util.Date;

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
    public String getConceptos() {
        return "Sueldo Basico: " + this.sueldoBasico +
                " || Gastos Administrativos Contractuales: " + gastosAdministrativosContractuales() + "\n";
    }

    private Double gastosAdministrativosContractuales() {
        return 50D;
    }
}
