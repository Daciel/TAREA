/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero.automatico;

/**
 *
 * @author Daciel Gonzalez
 */
public class Usuario {
    public String nombre;
    public String apellido;
    public int ahorros;
    public int clave; 
    public int idtarjeta;
    public int idmarca;
    public int intentos;
 public Usuario(String n,String a,int ah,int c,int id,int mc,int i)  {
     nombre=n;
     apellido=a;
     ahorros=ah;
     clave=c;
     idtarjeta=id;
     idmarca=mc;
     intentos=i;
 }
}
