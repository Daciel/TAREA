/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.de.numero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Daciel Gonzalez
 */
public class ListaDeNumero {

public static void main(String[]args) throws IOException {
    int a;
    int b;
    BufferedReader c;
    c=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Cuantos numeros va  a ingresar :");
      a=Integer.parseInt(c.readLine());
      System.out.println("Usted ingresara " + a + " numeros");
          int numeros[]= new int[a];
          System.out.println("Ingrese los numeros :"  );
          for(b=0;b<a;b++){
               numeros[b]=Integer.parseInt(c.readLine()); }

          for(b=0;b<a;b++)                                           {

              int menor=b;
                   for(int j=b+1;j<a;j++)     {
                       if(numeros[j]<numeros[menor])      {
                       menor=j;}
                                              }
                  if(a!=menor){
                       int aux =numeros[b];
                       numeros[b]=numeros[menor];
                       numeros[menor] = aux;}



                                                                          }
          System.out.println("Los numeros de menor a mayor son :");
          for(int k=0; k<b;k++)

            System.out.print(numeros[k] + "  ");
    }

   }
   
      
    

