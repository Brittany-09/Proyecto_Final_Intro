/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author Brittany López
 */
public class Inventario {

    //Variables
    private String cod;
    private String nombre;
    private String des;
    private String prec;
    private String cant;

    //Método constructor con parametros
    public Inventario(String cod, String nombre, String des, String prec, String cant) {
        this.cod = cod;
        this.nombre = nombre;
        this.des = des;
        this.prec = prec;
        this.cant = cant;
    }

    //Método constructor sin parametros
    public Inventario() {
    }

    //Métodos de acceso
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getPrec() {
        return prec;
    }

    public void setPrec(String prec) {
        this.prec = prec;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    //To String- Mostrar datos
    @Override
    public String toString() {
        return "Inventario{" + "cod=" + cod + ", nombre=" + nombre + ", des="
                + des + ", prec=" + prec + ", cant=" + cant + '}';
    }

    //Mostrar datos
    public void mostrarDatos() {
        System.out.println("Registro de productos: ");
        System.out.println("cod: " + cod);
        System.out.println("Nombre: " + nombre);
        System.out.println("des: " + des);
        System.out.println("prec: " + prec + " " + "\n");
        System.out.println("cant: " + cant);
    }
}
