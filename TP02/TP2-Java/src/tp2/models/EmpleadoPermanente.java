package tp2.models;

import java.util.Date;

public class EmpleadoPermanente extends Empleado {
    private Integer cantidadHijos;
    private Date antiguedad;

    public EmpleadoPermanente(String nombre, String direccion, Boolean estadoCivil, Date fechaNacimiento, Double sueldoBasico, Integer cantidadHijos, Date antiguedad) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.cantidadHijos = cantidadHijos;
        this.antiguedad = antiguedad;
    }

    @Override
    public Double calcularSueldoBruto() {
        return this.sueldoBasico + asignacionPorHijo() + asignacionPorConyuge() + antiguedad();
    }

    @Override
    public Double calcularRetenciones() {
        return obraSocial() + aportesJubilatorios();
    }

    private Double asignacionPorHijo() {
        return (this.cantidadHijos * 150D);
    }

    private Double asignacionPorConyuge() {
        return super.estadoCivil ? 100D : 0D;
    }

    private Integer antiguedad() {
        Date today = new Date();
        return Math.toIntExact(today.getYear() - this.antiguedad.getYear());
    }

    private Double obraSocial() {
        return (calcularSueldoBruto() * 0.1) + (this.cantidadHijos * 20);
    }

    private Double aportesJubilatorios() {
        return (calcularSueldoBruto() * 0.15);
    }

    public String getConceptos() {
        return "Sueldo Basico: " + this.sueldoBasico +
                " || Asignacion por hijo: " + asignacionPorHijo() +
                " || Asignacion por conyuge: " + asignacionPorConyuge() +
                " || Antiguedad: " + antiguedad() +
                " || Obra Social: " + obraSocial() +
                " || Aportes Jubilatorios: " + aportesJubilatorios();
    }
}
