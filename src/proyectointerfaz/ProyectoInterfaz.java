/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointerfaz;

/**
 *
 * @author ADMINISTRATOR
 */
public class ProyectoInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente c = new Cliente("Eduardo", "1713850566001");
       Admin adm = new Admin("Administrador", "Select*2o21");
       System.out.println(c.imprimir());
       System.out.println(adm.imprimir());
       
      
       
    }
    
}
