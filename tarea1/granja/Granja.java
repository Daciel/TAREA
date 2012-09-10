/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Granja;


/**
 *
 * @author Daciel Gonzalez
 */

public class Granja{
    
public static void main (String [] args ){


Gato gato=new Gato(); 
System.out.println("El nombre del gato es "+gato.quiensoy());
Perro perro=new Perro();
System.out.println("El nombre del perro es "+perro.quiensoy());
Gallina gallina=new Gallina();
System.out.println("El nombre de la gallina es "+gallina.quiensoy());

}
}