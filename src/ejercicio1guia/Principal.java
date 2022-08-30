/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1guia;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Digite el codigo del trabajador: ");
        int codigo = lector.nextInt();
        
        System.out.println("Digite el nombre del trabajador: ");
        String nombre = lector.next();
               
        System.out.println("Digite el apellido del trabajador: ");
        String apellido = lector.next();
        
        System.out.println("Digite el salario mensual del trabajador: ");
        double salarioMen = lector.nextInt();
        
        Trabajador trab1 = new Trabajador();
        
        trab1.setCodigo(codigo);
        trab1.setNombre(nombre);
        trab1.setApellido(apellido);
        trab1.setSalarioMensual(salarioMen);
        
        System.out.println(trab1.toString());
        
    }
    
}
