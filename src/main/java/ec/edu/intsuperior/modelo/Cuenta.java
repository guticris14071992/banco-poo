/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author cj_gu
 */
public class Cuenta {
    private double saldo;
    private String cedula;
    private String nombre;
    private String apellido;
    private String numcuenta;

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        this.saldo = saldo+valor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    @Override
    public String toString() {
        return getNumcuenta()+" "+getSaldo() ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
