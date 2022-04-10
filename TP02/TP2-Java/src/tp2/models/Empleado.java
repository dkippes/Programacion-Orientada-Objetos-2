package tp2.models;

import java.util.Date;

public abstract class Empleado {
    protected String nombre;
    protected String direccion;
    protected Boolean estadoCivil;
    protected Date fechaNacimiento;
    protected Double sueldoBasico;

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

    public abstract Double calcularSueldoBruto();

    public abstract Double calcularRetenciones();

    public Double calcularSueldoNetoRestante() {
        return calcularSueldoBruto() - calcularRetenciones();
    }

    public abstract String getConceptos();

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
