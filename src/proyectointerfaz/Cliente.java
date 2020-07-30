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
public class Cliente implements Imprimable{
    
    private String ruc;
    private String nombre;

    public Cliente(String ruc, String nombre) {
        this.ruc = ruc;
        this.nombre = nombre;
    }

   

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String imprimir() {
        return this.nombre + "-"+this.ruc;
    }
    
    
}
