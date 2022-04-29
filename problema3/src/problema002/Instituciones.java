/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema002;

/**
 *
 * @author SALA I
 */
public class Instituciones {

    private String nombre;
    private String tipo;
    private double numeroA;
    private double numeroD;
    private int numeroS;
    private double gastos;
    private double presupuesto;

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerTipo(String c) {
        tipo = c;
    }

    public void establecerNumeroAlumnos(double c) {
        numeroA = c;
    }

    public void establecerNumeroDocentes(double c) {
        numeroD = c;
    }

    public void establecerNumeroSedes(int c) {
        numeroS = c;
    }

    public void establecerGastosxEstudiantes(double c) {
        gastos = c;
    }

    // public void establecerValorFactura(){
    public void calcularPresupuesto() {
        presupuesto = numeroA * gastos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerNumeroAlumnos() {
        return numeroA;
    }

    public double obtenerNuemroDocentes() {
        return numeroD;
    }

    public int obtenerNuemroSedes() {
        return numeroS;
    }

    public double obtenerGastos() {
        return gastos;

    }
    public double obtenerPresupuesto() {
        return presupuesto;

    }
    
}
