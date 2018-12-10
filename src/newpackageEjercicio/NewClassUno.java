/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackageEjercicio;

/**
 *
 * @author alumno
 */
public class NewClassUno {
    private int cuenta;
    private String nombre;
    private int saldo;
    private final dooble interes;

    public NewClassUno(int cuenta, String nombre, int saldo, dooble interes) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
        this.interes = interes;
    }

    private static class dooble {

        public dooble() {
        }
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
