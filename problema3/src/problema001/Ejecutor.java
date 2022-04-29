/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema001;

import problema002.Instituciones;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Instituciones esc = new Instituciones() ;
        esc.establecerNombre("Dolorosa");
        esc.establecerNumeroAlumnos(121456);
        esc.establecerNumeroDocentes(45);
        esc.establecerNumeroSedes(4);
        esc.establecerTipo("Publica");
        esc.establecerGastosxEstudiantes(458);
        esc.calcularPresupuesto();
        
        System.out.printf("""
                          Instituciones Educativas 
                          Nombre: %s
                          Tipo: %s
                          Numero de Alunmos: %.2f 
                          Numero de Docentes: %.2f 
                          Numero de Sedes: %d
                          Gastos por Estudiantes: %.2f 
                          Presupuesto: %.2f
                          
                          """,
                esc.obtenerNombre(),esc.obtenerTipo(), esc.obtenerNumeroAlumnos(),
                esc.obtenerNuemroDocentes(),esc.obtenerNuemroSedes(),esc.obtenerGastos(),
                esc.obtenerPresupuesto());
        
        Instituciones esc2 = new Instituciones() ;
        esc2.establecerNombre("Inmaculada");
        esc2.establecerNumeroAlumnos(1754);
        esc2.establecerNumeroDocentes(58);
        esc2.establecerNumeroSedes(8);
        esc2.establecerTipo("Privada");
        esc2.establecerGastosxEstudiantes(20);
        esc2.calcularPresupuesto();
        
        System.out.printf("""
                          
                          Instituciones Educativas 2
                          Nombre: %s
                          Tipo: %s
                          Numero de Alunmos: %.2f 
                          Numero de Docentes: %.2f 
                          Numero de Sedes: %d
                          Gastos por Estudiantes: %.2f 
                          Presupuesto: %.2f
                          
                          """,
                esc2.obtenerNombre(),esc2.obtenerTipo(), esc2.obtenerNumeroAlumnos(),
                esc2.obtenerNuemroDocentes(),esc2.obtenerNuemroSedes(),esc2.obtenerGastos(),
                esc2.obtenerPresupuesto());
    }
        
    }
    
    

