/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete001;

import paquete002.Terreno;

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
        Terreno trr = new Terreno();
        trr.establecerAncho(200);
        trr.establecerLargo(100);
        trr.establecerValorMetroCuadrado(500);
        trr.calcularArea();
        trr.calcularCostoTerreno();

        System.out.printf("""
                          Costo de Terreno
                          Ancho de Terreno %.2f
                          Largo del Terreno: %.2f
                          Area del terreno: %.2f
                          Costo del metro cuadrado: %.2f
                          Costo total del terreno: %.2f
                          """,
                trr.obtenerAncho(), trr.obtenerLargo(),
                trr.ObtenerArea(), trr.obtenerValorMetroCuadrado(), trr.ObtenerCostoTerreno());
        
        Terreno trr3 = new Terreno();
        
        trr3.establecerAncho(8700);
        trr3.establecerLargo(4500);
        trr3.establecerValorMetroCuadrado(2500);
        trr3.calcularArea();
        trr3.calcularCostoTerreno();

        System.out.printf("""
                          
                          Costo de Terreno
                          Ancho de Terreno %.2f
                          Largo del Terreno: %.2f
                          Area del terreno: %.2f
                          Costo del metro cuadrado: %.2f
                          Costo total del terreno: %.2f
                          """,
                trr3.obtenerAncho(), trr3.obtenerLargo(),
                trr3.ObtenerArea(), trr3.obtenerValorMetroCuadrado(), trr3.ObtenerCostoTerreno());

    }
}
