/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;
import paquete001.FacturaTelefono;
/**
 *
 * @author SALA I
 */
public class EjecutorDos {

    public static void main(String[] args) {
        FacturaTelefono tf3 = new FacturaTelefono(); 
        tf3.establecerMinutosMes(56446);
        tf3.establecerNumeroTelefono("0939348570");
        tf3.establecerValorMinuto(45416464);
        tf3.calcularValorFactura();
        System.out.printf("Factura de Teléfono\n\nNúmero de teléfono: %s\n"
                + "Minutos mensuales: %.2f\nValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", tf3.obtenerNumeroTelefono(),
                tf3.obtenerMinutosMes(), tf3.obtenerValorMinuto(),
                tf3.obtenerValorFactura());
    }
}
