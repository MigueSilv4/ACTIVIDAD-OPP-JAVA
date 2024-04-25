/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import modelo.Cliente;

/**
 *
 * @author silva
 */
public class ControladorCliente {
    public void controlarAccion (ActionEvent evento, Cliente unCliente){
        String accion = evento.getActionCommand();
        switch (accion){
            case "Insertar":
                unCliente.insertar();
            break;
            case "Modificar":
                unCliente.modificar();
            break;
            case "Eliminar":
                unCliente.eliminar();
                break;
                
            }
                    
        }
}
    

