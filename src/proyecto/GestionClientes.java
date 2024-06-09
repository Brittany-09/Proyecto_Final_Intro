/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Brittany López
 */
public class GestionClientes {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    //Precargar ejemplos de 5 clientes 
    public void precargarCliente() {
        clientes.add(new Cliente("604520879", "Sara", "Rodríguez Campos", "Pueblo Cívil", "87546914", "sara12@gmail.com"));
        clientes.add(new Cliente("702990228", "Brittany", "López Bustos", "Bella Vista", "87834383", "brittay09@gmail.com"));
        clientes.add(new Cliente("20485069", "Nathalie", "Carmona Sossa", "Río Claro", "71458963", "nathalie45@gmail.com"));
        clientes.add(new Cliente("115748963", "Ricardo", "Carrillo Anchia", "Km 3", "89147532", "ricardo90@gmail.com"));
        clientes.add(new Cliente("604520879", "Diego", "Rodríguez Campos", "Pueblo Cívil", "87546914", "diego15@gmail.com"));
    }

    //Ingreso del cliente
    public void registrarCliente() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cédula del cliente");
        String id = entrada.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                System.out.println("La cédula ya se encuentra registrada");
                menu();
            }
        }
        System.out.println("Ingrese el nombre del cliente");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese los apellidos del cliente");
        String apellidos = entrada.nextLine();

        System.out.println("Ingrese la dirección del cliente");
        String dir = entrada.nextLine();

        System.out.println("Ingrese el teléfono del cliente");
        String tel = entrada.nextLine();

        System.out.println("Ingrese el correo electrónico del cliente");
        String correo = entrada.nextLine();

        Cliente cliente = new Cliente(id, nombre, apellidos, dir, tel,
                correo);

        clientes.add(cliente);
        menu();
    }

    //Mostrar al cliente
    private void mostrarCliente() {

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        menu();
    }

    //Buscar al cliente
    private void buscarCliente() {

    }

    //Eliminar al cliente
    private void eliminarCliente() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar la cedula a buscar");
        String id = entrada.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                //eliminar el registro
                clientes.remove(cliente);
                System.out.println("REGISTRO SE ELIMINÓ CORRECTAMENTE");
                menu();
            }
        }
        System.out.println("No se encontró una persona con el ID " + id);
    }

    public void menu() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int opcionBusqueda;
        opcion = 0;
        System.out.println(" --------- Menu de opciones ---------");
        System.out.println("1- Ingresar cliente");
        System.out.println("2- Mostrar clientes");
        System.out.println("3- Buscar Clientes");
        System.out.println("4- Eliminar cliente");
        System.out.println("5- Modificar cliente");
        System.out.println("6- Histoiral de compras del cliente");
        System.out.println("7- Salir al menú principal");
        System.out.println("-------------------------------------");
        System.out.println("Digite una opcion");
        opcion = entrada.nextInt();
        entrada.nextLine();// Leer y descartar la línea vacía pendiente - PARA EVITAR SALTOS
        switch (opcion) {
            case 1:
                registrarCliente();
                break;
            case 2:
                mostrarCliente();
                break;
            case 3:
                buscarCliente();
            case 4:
                eliminarCliente();
            case 5:
                System.exit(0);

            default:
                System.out.println("Opción invalida");
        }
        entrada.close();

    }
}
