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
public class Cliente {

    //Variables 
    private String id;
    private String nombre;
    private String apellidos;
    private String dir;
    private String tel;
    private String correo;

    //Método constructor con parametros
    public Cliente(String id, String nombre, String apellidos, String dir, String tel, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dir = dir;
        this.tel = tel;
        this.correo = correo;
    }
    //Método constructor vacío

    public Cliente() {
    }

    //Método especial Acceso
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Método To String (Mostrar datos)
    @Override
    public String toString() {
        return "Cliente{" + "id = " + id + ", nombre = " + nombre + ", "
                + "apellidos = " + apellidos + ", dirección = " + dir + ", "
                + "teléfono = " + tel + ", correo eléctronico = " + correo + '}';
    }

}
