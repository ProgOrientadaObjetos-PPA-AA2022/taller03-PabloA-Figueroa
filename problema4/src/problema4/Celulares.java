/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author SALA I
 */
public class Celulares {

    private String sistema;
    private String MAC;
    private String IMEI;
    private double tamaño;
    private double costo;
    private double Ivacosto;
    private double cfinal;

    public void establecerNombre(String c) {
        sistema = c;
    }

    public void establecerMAC(String c) {
        MAC = c;
    }

    public void establecerIMEI(String c) {
        IMEI = c;
    }

    public void establecerTamaño(double c) {
        tamaño = c;
    }

    public void establecerCostoIVA(double c) {
        Ivacosto = (costo *c)/100;
    }

    public void establecerCosto(double c) {
        costo = c;
    }

    public void calcularrCostoFinal() {
        cfinal = costo + Ivacosto;
    }

    // public void establecerValorFactura(){
    public String obtenerSistema() {
        return sistema;
    }

    public String obtenerMAC() {
        return MAC;
    }

    public String obtenerIMEI() {
        return IMEI;
    }

    public double obtenertamaño() {
        return tamaño;
    }

    public double obtenerCostos() {
        return costo;
    }

    public double obtenerCostosIVA() {
        return Ivacosto;
    }

    public double obtenerCostoFinal() {
        return cfinal;

    }

}
