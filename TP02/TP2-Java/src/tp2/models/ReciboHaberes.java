package tp2.models;

public class ReciboHaberes {
    private String nombreEmpleado;
    private String direccion;
    private Double sueldoBruto;
    private Double sueldoNeto;
    private String desgloseConceptos;

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public void setSueldoBruto(Double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }


    public void setSueldoNeto(Double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public void setDesgloseConceptos(String desgloseConceptos) {
        this.desgloseConceptos = desgloseConceptos;
    }

    @Override
    public String toString() {
        return "ReciboHaberes{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", direccion='" + direccion + '\'' +
                ", sueldoBruto=" + sueldoBruto +
                ", sueldoNeto=" + sueldoNeto +
                ", desgloseConceptos='" + desgloseConceptos + '\'' +
                '}';
    }
}
