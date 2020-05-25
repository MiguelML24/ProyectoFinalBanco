/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancaentornos;

/**
 *
 * @author migue
 */
public class Cliente {
    //Definimos sus atributos
    
    private String nombre;
    private String apellido;
    private String direccion;
    private String nif;
    private int telefono;
    private int edad;
    private double saldo;
    private int numCuenta;
    
    String green="\033[32m";
    String red="\033[31m";
    //Ahora definimos su constructor
    
    public Cliente(String nom, String ape, String dir, String nif, int tel, int edad, double sal, int numC) {
        this.nombre = nom;
        this.apellido = ape;
        this.direccion = dir;
        this.nif = nif;
        this.telefono = tel;
        this.edad = edad;
        this.saldo = sal;
        this.numCuenta = numC;
    }
    //Metodos utilizados
    
    /**
     * Metodo de ingresar saldo
     * @param c Metemos como parametro el dinero que que queremos ingresar
     */
    public void ingresar(double c){
        this.saldo=this.saldo+c;
        System.out.println(green+"El saldo que te queda después del ingreso es de: "+this.saldo);
    
    }
    /**
     * Metodo de retirar saldo
     * @param c Metemos como parámetro el dinero que le queremos retirar
     */
    public void retirar(double c){
        //Para poder retirar el dinero solicitado tenemos que comprobar si tiene suficiente saldo
        if (c>this.saldo) {
            System.out.println(red+"No dispone de suficiente saldo para relizar dicha operación");
        }
        else{
            System.out.println("Se puede realizar la operación sin problemas");
            this.saldo=this.saldo-c;
            System.out.println(green+"El saldo que te queda después de la retirada de dinero es de: "+this.saldo);
        }      
    }

    /**
     * Metodo para mostar el Saldo que tiene el usuario
     */
    public void mostrarSaldo(){
        System.out.println(green+"Este es el saldo del que usted dispone en este momento: "+this.saldo);
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
     * Metodo toString de la clase Cliente que imprime los datos del cliente
     * @return devuelve los datos del cliente
     */
    @Override
    public String toString() {
        return "Cuenta con datos{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", nif=" + nif + ", telefono=" + telefono + ", edad=" + edad + ", saldo=" + saldo + ", numCuenta=" + numCuenta+ '}';
    }
    
    
}
