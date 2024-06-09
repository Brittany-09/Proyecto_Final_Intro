/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author Brittany López
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionClientes datos = new GestionClientes();
        Scanner entrada = new Scanner(System.in);

        datos.precargarCliente();
        datos.menu();
    }
}
