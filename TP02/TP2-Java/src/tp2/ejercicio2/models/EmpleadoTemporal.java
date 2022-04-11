package tp2.ejercicio2.models;

import java.util.Date;

public class EmpleadoTemporal extends Empleado {
    private Date fechaFinDesignacion;
    private Integer cantidadHorasExtras;

    public EmpleadoTemporal(String nombre, String direccion, Boolean estadoCivil, Date fechaNacimiento, Double sueldoBasico, Date fechaFinDesignacion, Integer cantidadHorasExtras) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.fechaFinDesignacion = fechaFinDesignacion;
        this.cantidadHorasExtras = cantidadHorasExtras;
    }

    @Override
    public Double calcularSueldoBruto() {
        return sueldoBasico();
    }

    @Override
    public Double calcularRetenciones() {
        return obraSocial() + aportesJubilatorios();
    }

    private Double applyIfHas50Years() {
        Date today = new Date();
        int anios = Math.toIntExact(today.getYear() - super.fechaNacimiento.getYear());
        return anios >= 50 ? 25D : 0;
    }

    private Double sueldoBasico() {
        return this.sueldoBasico + (this.cantidadHorasExtras * 40D);
    }

    private Double obraSocial() {
        return 0.1 * calcularSueldoBruto() + applyIfHas50Years();
    }

    private Double aportesJubilatorios() {
        return (calcularSueldoBruto() * 0.1) + (this.cantidadHorasExtras * 5);
    }

    public String getConceptos() {
        return "Sueldo Basico: " + sueldoBasico() +
                " || Obra Social: " + obraSocial() +
                " || Aportes Jubilatorios: " + aportesJubilatorios() + "\n";
    }
}
