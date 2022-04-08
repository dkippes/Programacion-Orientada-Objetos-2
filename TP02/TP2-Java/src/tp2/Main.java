package tp2;

import tp2.models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Java", "12543546");
        Empleado empleadoPermanente1 = new EmpleadoPermanente("Juan", "Calle falsa 123", true, parseDate("1995-06-05"),5000D, 2, parseDate("2019-12-26"));
        Empleado empleadoPermanente2 = new EmpleadoPermanente("Pedro", "Calle tulia 654", false, parseDate("1976-11-21"),7500D, 2, parseDate("2000-05-05"));
        Empleado empleadoTemporal1 = new EmpleadoTemporal("Cacho", "Calle sucia 900", true, parseDate("1996-11-11"),1500D, parseDate("2021-12-05"), 48);
        empresa.addEmpleado(empleadoPermanente1)
                .addEmpleado(empleadoPermanente2)
                .addEmpleado(empleadoTemporal1);

        System.out.println("***********Empleado Permanente 1***********");
        System.out.println("empleadoPermanente1.calcularEdad() = " + empleadoPermanente1.calcularEdad());
        System.out.println("empleadoPermanente1.calcularSueldoBruto() = " + empleadoPermanente1.calcularSueldoBruto());
        System.out.println("empleadoPermanente1.calcularRetenciones() = " + empleadoPermanente1.calcularRetenciones());
        System.out.println("empleadoPermanente1.calcularSueldoNetoRestante() = " + empleadoPermanente1.calcularSueldoNetoRestante());

        System.out.println("\n***********Empleado Permanente 2***********");
        System.out.println("empleadoPermanente2.calcularEdad() = " + empleadoPermanente2.calcularEdad());
        System.out.println("empleadoPermanente2.calcularSueldoBruto() = " + empleadoPermanente2.calcularSueldoBruto());
        System.out.println("empleadoPermanente2.calcularRetenciones() = " + empleadoPermanente2.calcularRetenciones());
        System.out.println("empleadoPermanente2.calcularSueldoNetoRestante() = " + empleadoPermanente2.calcularSueldoNetoRestante());

        System.out.println("\n***********Empleado Temporal 1***********");
        System.out.println("empleadoTemporal1.calcularEdad() = " + empleadoTemporal1.calcularEdad());
        System.out.println("empleadoTemporal1.calcularSueldoBruto() = " + empleadoTemporal1.calcularSueldoBruto());
        System.out.println("empleadoTemporal1.calcularRetenciones() = " + empleadoTemporal1.calcularRetenciones());
        System.out.println("empleadoTemporal1.calcularSueldoNetoRestante() = " + empleadoTemporal1.calcularSueldoNetoRestante());

        System.out.println("\n***********Empresa***********");
        System.out.println("empresa.calcularMontoTotalSueldosBruto() = " + empresa.calcularMontoTotalSueldosBruto());
        System.out.println("empresa.calcularMontoTotalRetenciones() = " + empresa.calcularMontoTotalRetenciones());
        System.out.println("empresa.calcularMontoTotalSueldosNeto() = " + empresa.calcularMontoTotalSueldosNeto());

        System.out.println("\n***********Empresa Liquidacion de sueldo***********");
        empresa.liquidacionSueldos();
        empresa.getReciboHaberes().forEach(System.out::println);

    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
