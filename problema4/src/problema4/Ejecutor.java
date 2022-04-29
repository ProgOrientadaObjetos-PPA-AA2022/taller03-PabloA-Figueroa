/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

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
        cel.calcularrCostoFinal();
        cel.establecerCostoIVA(13);
        
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
    }
    
}
