package tp2.models;

import java.util.Date;

public class Empleado {
    protected String nombre;
    protected String direccion;
    protected Boolean estadoCivil;
    protected Date fechaNacimiento;
    protected Double sueldoBasico;

    public Empleado() {
    }

    public Empleado(String nombre, String direccion, Boolean estadoCivil, Date fechaNacimiento, Double sueldoBasico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBasico = sueldoBasico;
    }

    public Integer calcularEdad() {
        Date today = new Date();
        return (today.getYear() - fechaNacimiento.getYear());
    }

    public Double calcularSueldoBruto() {
        return null;
    }

    public Double calcularRetenciones() {
        return null;
    }

    public Double calcularSueldoNetoRestante() {
        return calcularSueldoBruto() - calcularRetenciones();
    }

    public String getConceptos() {
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
