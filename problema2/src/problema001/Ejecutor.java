/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema001;

import problema002.EquivalenteHora;

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
        EquivalenteHora hora = new EquivalenteHora();
        hora.establecerHoras(50);
        hora.calcularSegundos();
        hora.calcularMinutos();
        hora.calcularDias();

        System.out.printf("""
                          Convertidor de Tiempo
                          Nuemro en Horas: %.2f
                          Numero en Segundos: %.2f segundos
                          Numero en Minutos: %.2f minutos
                          Numero en Dias: %.2f dias 
                          """,
                hora.obtenerHoras(), hora.obtenerSegundos(), hora.obtenerMinutos(), hora.obtenerDias());

        EquivalenteHora hora3 = new EquivalenteHora();
        hora3.establecerHoras(48);
        hora3.calcularSegundos();
        hora3.calcularMinutos();
        hora3.calcularDias();

        System.out.printf("""
                          
                          Convertidor de Tiempo
                          Nuemro en Horas: %.2f
                          Numero en Segundos: %.2f segundos
                          Numero en Minutos: %.2f minutos
                          Numero en Dias: %.2f dias 
                          """,
                hora3.obtenerHoras(), hora3.obtenerSegundos(), hora3.obtenerMinutos(), hora3.obtenerDias());
    }

}
