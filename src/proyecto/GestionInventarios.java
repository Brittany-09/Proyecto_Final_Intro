/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Brittany López
 */
public class GestionInventarios {

    private ArrayList<Inventario> inventarios = new ArrayList<>();

    public void registrarProductos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el código del producto");
        String cod = entrada.nextLine();

        for (Inventario inventario : inventarios) {
            if (inventario.getCod().equals(cod)) {
                System.out.println("El código ya se encuentra registrado");
                //menu();
            }
        }
        System.out.println("Ingrese el nombre del producto");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese la descripción del producto");
        String des = entrada.nextLine();

        System.out.println("Ingrese el precio del producto");
        String prec = entrada.nextLine();

        System.out.println("Ingrese las cantidades del producto");
        String cant = entrada.nextLine();

        Inventario cliente = new Inventario(cod, nombre, des, prec, cant);

        inventarios.add(cliente);
        //menu();
    }

}
