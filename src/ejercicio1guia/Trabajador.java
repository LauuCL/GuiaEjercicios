/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1guia;

/**
 *
 * @author HP
 */
public class Trabajador {
    
    private int codigo;
    private String nombre;
    private String apellido;
    private double salarioMensual;

    public Trabajador() {
        
    }

    public Trabajador(int codigo, String nombre, String apellido, double salarioMensual) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
    
    public double salarioDiario(){
        double salario = salarioMensual/30;
        return salario;
    }

    @Override
    public String toString() {
        
        return "\nDATOS DEL TRABAJADOR\n"+
                
                "Codigo = " + codigo + "\nNombre = " + nombre + "\nApellido = " + apellido 
                + "\nSalario mensual = " + salarioMensual + "\nSalario diario = "+ salarioDiario();
    }
    
    
    
    
    
}
