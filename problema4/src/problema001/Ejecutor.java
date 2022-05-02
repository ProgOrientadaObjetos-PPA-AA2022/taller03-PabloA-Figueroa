/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema001;

import problema002.Celulares;

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
        Celulares cel = new Celulares(); 
        cel.establecerNombre("IOS 13");
        cel.establecerTamaño(12.5); 
        cel.establecerCosto(1542);
        cel.establecerIMEI("13-sda-3123");
        cel.establecerMAC("00:1e:c2:9e:28:6b");
        cel.establecerCostoIVA(13);
        cel.calcularrCostoFinal();
        
        
        System.out.printf("""
                          Equipos Celulares 
                          Nombre: %s
                          Tamaño: %.2f
                          Costo Inicial: %.2f 
                          Direccion IMEI: %s
                          Direccion MAC: %s
                          IVA del Costo inical: %.2f
                          Costo Final: %.2f 
                          
                          
                          """,
                cel.obtenerSistema(),cel.obtenertamaño(),cel.obtenerCostos(),cel.obtenerIMEI(),
                cel.obtenerMAC(),cel.obtenerCostosIVA(),cel.obtenerCostoFinal());
        
        Celulares cel2 = new Celulares(); 
        cel2.establecerNombre("Android 15");
        cel2.establecerTamaño(15.5); 
        cel2.establecerCosto(856);
        cel2.establecerIMEI("147-adaa-74583");
        cel2.establecerMAC("87:5d:c2:23f:89:0f");
        cel2.establecerCostoIVA(12);
        cel2.calcularrCostoFinal();
        
        
        System.out.printf("""
                          
                          Equipos Celulares 2
                          Nombre: %s
                          Tamaño: %.2f
                          Costo Inicial: %.2f 
                          Direccion IMEI: %s
                          Direccion MAC: %s
                          IVA del Costo inical: %.2f
                          Costo Final: %.2f 
                          
                          
                          """,
                cel2.obtenerSistema(),cel2.obtenertamaño(),cel2.obtenerCostos(),cel2.obtenerIMEI(),
                cel2.obtenerMAC(),cel2.obtenerCostosIVA(),cel2.obtenerCostoFinal());
    }
    
}
