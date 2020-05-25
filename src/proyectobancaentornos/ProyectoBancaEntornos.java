/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancaentornos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class ProyectoBancaEntornos {
    static ArrayList<Cliente> listaCuentas = new ArrayList();
    static Scanner sc =new Scanner(System.in);
    static GestorBanco empleado1=new GestorBanco();
    static int numCuenta;
    //Estilo del programa
    static String blue="\033[34m";
    static String green="\033[32m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Programa de distintas utilidades para un banco
        
        //Declaramos los clientes iniciales y el posible Gestor
        listaCuentas.add(new Cliente("Roberto", "Rodriguez", "Murcia", "78954621X", 645698568, 18, 5500, 1));
        listaCuentas.add(new Cliente("Felipe", "Garcia", "Barcelona", "15423689C", 687415632, 22, 3000, 2));
        listaCuentas.add(new Cliente("María", "Martinez", "Cadiz", "85647596Z", 612356895, 40, 3500, 3));
        listaCuentas.add(new Cliente("Roberto", "Fernandez", "Malaga", "57486596N", 641236589, 32, 200, 4));
        listaCuentas.add(new Cliente("Mario", "Gutierrez", "Getafe", "25636525P", 64578965, 27, 700, 5));
        listaCuentas.add(new Cliente("Alberto", "Jimenez", "Parla", "78541236L", 67896541, 62, 35000, 6));
        
        //Comienzo del programa
        int opcion=menuPrincipal();
        while(opcion!=0){
            switch(opcion){
                case 1:
                    System.out.println("Para poder realizar operaciones debes ingresar en tu cuenta, por favor introduzca tu numero de cuenta: ");
                    numCuenta=sc.nextInt();
                    entrarCuenta(numCuenta);
                    int opcion2=menuOperaciones();
                    while(opcion2!=0){
                        switch(opcion2){
                            case 1:
                                ingresar();
                                break;
                            case 2:
                                retirar();
                                break;
                            case 3:
                                mostrarSaldo();
                                break;
                            case 4:
                                modificarDatos();
                                break; 
                            default:
                                System.out.println("Valor introducido no es correcto, vuelva a introducir un valor del 0 al 4");
                                break;
                        }
                        opcion2=menuOperaciones();
                    }
                    break;
                case 2:
                    mostrarCuentas();
                    break;
                case 3: 
                    crearCuenta();
                    break;
                default:
                    System.out.println("Valor introducido incorrecto, vuelva a introducir un numero válido [0 al 3]");
            }
            opcion=menuPrincipal();
        }
        System.out.println("Gracias por haber confiado en nosotros, esperemos que pase un buen dia");
    }
    /**
     * Menu principal del banco
     * @return opcion del menu elegida por el usuario
     */
    public static int menuPrincipal() {
        System.out.println(blue+"***BUENOS DÍAS, BIENVENID@ A LA APLICACIÓN DEL BANCO DE ENTORNOS***");
        System.out.println(blue+"***Marque la opción que desee realizar ***");
        System.out.println(blue+"***1-Realizar distintas operaciones***");
        System.out.println(blue+"***2-Mostrar las cuentas existentes en el sistema***");
        System.out.println(blue+"***3-Crear cuenta(le pondremos en contacto con nuestro gestor)***");
        System.out.println(blue+"***0-Salir de la aplicación***");
        return (sc.nextInt());
    }
    
    /**
     * Metodo para ingresar en la cuenta
     * @param numCuenta le metemos el numero ingresado por el usuario
     */
    public static void entrarCuenta(int numCuenta){
        int contador = 0;
        while (contador!=1){
        for (int i = 0; i < listaCuentas.size(); i++) {
            if (numCuenta == listaCuentas.get(i).getNumCuenta()) {
                contador++;
            }
        }
        if (contador==1) {
                System.out.println("Cuenta encontrada");
                System.out.println("Has accedido al sistema con éxito");
            }
        else{
             System.out.println("Cuenta no encontrada");
             System.out.println("Vuelva a introducir el numero de cuenta");
             numCuenta=sc.nextInt();
            }       
        }
    }
    /**
     * Menu para realizar operaciones
     * @return opcion del menu elegida por el usuario
     */
    public static int menuOperaciones(){
        System.out.println(blue+"***Indique a continuación la operación que desee realizar***");
        System.out.println(blue+"***1-Ingresar saldo***");
        System.out.println(blue+"***2-Retirar saldo***");
        System.out.println(blue+"***3-Consultar saldo***");
        System.out.println(blue+"***4-Necesito la ayuda de un gestor, para modificar datos***");
        System.out.println(blue+"***0-Volver al menu de inicio***");
        return (sc.nextInt());
    }
    /**
     * Metodo para modificar datos que combinaremos con la clase gestorBanco
     */
    public static void modificarDatos(){
        for (int i = 0; i < listaCuentas.size(); i++) {
            if(listaCuentas.get(i).getNumCuenta() == numCuenta){
            empleado1.modificarValores(listaCuentas.get(i));    
            }
        }
    }
    /**
     * Metodo para ingresar dinero que combinaremos con la de la claseCliente
     */
    public static void ingresar() {
        System.out.println("La opción elegida es ingresar dinero");
        System.out.println("Introduzce la cantidad que quiera ingresar en su cuenta");
        int ingreso = sc.nextInt();
        for (int i = 0; i < listaCuentas.size(); i++) {
            if (listaCuentas.get(i).getNumCuenta() == numCuenta) {
                listaCuentas.get(i).ingresar(ingreso);       
                break;
            }
        }
    }
    /**
     * Metodo para retirar dinero que combinaremos con la de la claseCliente
     */
    public static void retirar() {
        boolean retirar = false;
        System.out.println("La opción elegida es retirar dinero");
        System.out.println("Introduce la cantidad de dinero que quiera retirar de su cuenta");
        int dinero = sc.nextInt();
        for (int i = 0; i < listaCuentas.size() && !retirar; i++) {
            if (listaCuentas.get(i).getNumCuenta() == numCuenta) {
                listaCuentas.get(i).retirar(dinero);
                break;
            }
        }
    }
    /**
     * * Metodo para mostrarsaldo que combinaremos con la de la claseCliente
     */
    public static void mostrarSaldo(){
        System.out.println("Ha dedicido consultar tu saldo");
        for (int i = 0; i < listaCuentas.size(); i++) {
            if (listaCuentas.get(i).getNumCuenta() == numCuenta) {
                listaCuentas.get(i).mostrarSaldo();
            }
        }
    }
    /**
     * Metodo para mostrar las cuentas existentes en el sistema
     */
    public static void mostrarCuentas(){
        System.out.println("Estas son las cuentas actualmente registradas en el sistema: ");
        for (int i = 0; i < listaCuentas.size(); i++) {
            System.out.println(listaCuentas.get(i));
        }
    }
    /**
     * Metodo para  crear cuentas
     */
    public static void crearCuenta(){
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
        System.out.println("Su cuenta de nombre " + nom + " y apellido: " + apell+ " se ha credo con éxito");
        System.out.println("Actualmente no dispone de saldo");  
    }
    /*
    public static void crearCuenta(){
        empleado1.crearCuenta(ArrayList <String> listaCuentas);  
    }
    */
    }