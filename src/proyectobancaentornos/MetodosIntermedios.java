/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancaentornos;

import java.util.ArrayList;

/**
 *
 * @author migue
 */
public interface MetodosIntermedios {
    /**
     * Metodo modificarValores que usaremos en la clase GestorBanco
     * @param cli le metemos el cliente que quiere cambiar sus valores para que el gestor pueda trabajar
     */
    public void modificarValores(Cliente cli);
    //public void crearCuenta(ArrayList<Cliente> listaCuentas);
}
