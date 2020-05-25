/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancaentornos;

import java.util.ArrayList;
import java.util.Scanner;
import static proyectobancaentornos.ProyectoBancaEntornos.listaCuentas;

/**
 *
 * @author migue
 */
public class GestorBanco implements MetodosIntermedios{
static Scanner sc = new Scanner(System.in);
static String blue="\033[34m";

    @Override
    /**
     * Metodo a través del cual el gestor modifica los valores del cliente
     */
    public void modificarValores(Cliente cli) {
        System.out.println("Vamos a modificar sus datos Don/Doña: "+cli.getNombre());
        int opcion=menu();
        while (opcion != 6) {
            switch (opcion) {
                case 1:
                    System.out.println("Has decidido cambiar el nombre, el nombre actual es: "+cli.getNombre()+", introduzca el nuevo nombre: ");
                    String nuevoNombre=sc.next();
                    cli.setNombre(nuevoNombre);
                    System.out.println("Nombre cambiado con éxito, nombre actual: "+cli.getNombre());
                    break;
                case 2:
                    System.out.println("Has decidido cambiar el apellido, el apellido actual es: "+cli.getApellido()+", introduzca el nuevo apellido: ");
                    String nuevoApellido=sc.next();
                    cli.setApellido(nuevoApellido);
                    System.out.println("Apellido cambiado con éxito, apellido actual: "+cli.getApellido());
                    break;
                case 3:
                    System.out.println("Has decidido cambiar la direccion, la dirección actual es: "+cli.getDireccion()+", introduzca la nueva dirección: ");
                    String nuevaDireccion=sc.next();
                    cli.setDireccion(nuevaDireccion);
                    System.out.println("Direccion cambiada con éxito, dirección actual: "+cli.getDireccion());
                    break;
                case 4:
                    System.out.println("Has decidido cambiar la edad, la edad actual es: "+cli.getEdad()+", introduzca la nueva edad: ");
                    int nuevaEdad=sc.nextInt();
                    cli.setEdad(nuevaEdad);
                    System.out.println("Edad cambiada con éxito, edad actual: "+cli.getEdad());
                    break;
                case 5:
                    System.out.println("Has decidido cambiar el telefono, el telefono actual es: "+cli.getTelefono()+", introduzca el nuevo telefono: ");
                    int nuevoTelefono=sc.nextInt();
                    cli.setTelefono(nuevoTelefono);
                    System.out.println("Telefono cambiado con éxito, telefono actual: "+cli.getTelefono());
                    break;
                case 6:
                    System.out.println("Volviendo al menu principal");
            }
        opcion=menu();
        }
    }
    /**
     * Menu de modificar valores del cliente
     * @return retorna la opcion elegida por el cliente
     */
    public int menu(){
        System.out.println(blue+"***Ha pulsado en atención al cliente***");
        System.out.println(blue+"***Tienes alguna consulta que nos quiera realizar? Elija entre las siguientes opciones: ***");
        System.out.println(blue+"***1-Quiero cambiar el nombre del titular de la cuenta***");
        System.out.println(blue+"***2-Quiero cambiar el apellido del titular de la cuenta***");
        System.out.println(blue+"***3-Quiero cambiar la direccion***");
        System.out.println(blue+"***4-Quiero cambiar la edad***");
        System.out.println(blue+"***5-Quiero modificar el telefono***");
        System.out.println(blue+"***6-Volver al menu principal***");
        return (sc.nextInt());
    }
    /*
    @Override
    public void crearCuenta(ArrayList<Cliente> listaCuentas){
        System.out.println("Su opción ha sido crear una cuenta nueva");
        System.out.println("Necesitamos que introduzca ciertos datos");
        System.out.println("Nombre: ");
        String nom = sc.next();
        System.out.println("Primer Apellido: ");
        String apell = sc.next();
        System.out.println("Direccion: ");
        String dir = sc.next();
        System.out.println("Nif: ");
        String nif = sc.next();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        System.out.println("Telefono de contacto");
        int telefono = sc.nextInt();
        listaCuentas.add(new Cliente(nom, apell, dir, nif, edad, telefono, 0, (listaCuentas.size()+1)));
        System.out.println("Su cuenta de nombre " + nom + " y " + apell+ " se ha credo con éxito");
        System.out.println("Actualmente no dispone de saldo");
    }
    */
    }

