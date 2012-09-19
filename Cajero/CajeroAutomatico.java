/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero.automatico;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Daciel Gonzalez
 */
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    int a,b,c,d=2,inicio=7,e[]={2000,1000,500,200,100},f=100000,g,x,c2=0,salida=5,xc,contador=0,contador1=0,contador2=0,contador3=0,contador4=0; 
    int intento=0,limite=0, retrincion=0; 
    
      BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
      Usuario julio=new Usuario("Julio","Sosa",50000,4567,7894,1,0);
      Usuario Daciel=new Usuario("Daciel","Gonzalez",250000,1268,1234,2,0);
      Usuario Sara=new Usuario("Sara","Pierre",15000,3698,2589,3,0);
      Usuario Massiel=new Usuario("Massiel","Cabrera",10000,1936,1564,4,0);
      Usuario Juan=new Usuario("Juan","Duarte",30000,1111,2222,5,0);
   
      while(inicio!=1){
              
     System.out.println("*********BIENVENIDO AL CAJERO AUTOMATICO ITLA**********\n");
     System.out.println("Elija la marca de su tarjeta\n1:Visa\n2:Mastercard\n3:Maestro\n4:American Express\n5:Otras");
      a=Integer.parseInt(sc.readLine());
      while(a<1||a>5){
      System.out.println("Elije una las opciones anteriores");
      a=Integer.parseInt(sc.readLine());
      }
      if (a==julio.idmarca){
          Daciel=julio;}
      else if(a==Sara.idmarca){
              Daciel=Sara;}
      else if(a==Massiel.idmarca){
              Daciel=Massiel;}
      else if(a==Juan.idmarca){
              Daciel=Juan;}
       else if(a==Daciel.idmarca){
              Daciel=Daciel;}
      System.out.println("Digite su numero de tarjeta"); 
      b=Integer.parseInt(sc.readLine());
      System.out.println("\nDigite su Contraseña"); 
      c=Integer.parseInt(sc.readLine());
     
      while((b!=Daciel.idtarjeta) || (c!=Daciel.clave)){
      System.out.println("Su numero de tarjeta o contraña esta incorrecta\n"); 
      System.out.println("Digite de nuevo su numero de tarjeta"); 
      b=Integer.parseInt(sc.readLine());
      System.out.println("\nDigite de nuevo su Contraseña"); 
      c=Integer.parseInt(sc.readLine());
      d--;
      
      if(d==0){
      System.out.println("Ha exedido el numero de intentos, su tarjeta ha sido retenida\n\n ");
      break;
      }}
     
      salida=1;
      while(salida!=2||(inicio==0)){
      if ((b==Daciel.idtarjeta) && (c==Daciel.clave)){
      System.out.printf("Bienvenido(a) %s %s \n",Daciel.nombre,Daciel.apellido);
      System.out.println("Que transaccion desea realizar\n1:Consultar balance\n2:Retirar efectivo\n3:Consultar el balance en cajero");
      g=Integer.parseInt(sc.readLine());
      
      
      switch(g){
          case 1:
        System.out.printf("su balance actual es %d\n Su balance disponible es %d",Daciel.ahorros,Daciel.ahorros-100);
        break;
          case 2: 
       if ((e[0]>Daciel.ahorros-100)||(e[1]>Daciel.ahorros-100)||(e[2]>Daciel.ahorros-100)||(e[3]>Daciel.ahorros-100)||(e[3]>Daciel.ahorros-100)||(f==0)||limite==20000){
           System.out.println("Trasaccion invalida");
           if(limite==20000){
        System.out.println("usted ha exedido el limite de retiro por dia");
           }}
       
       else{ 
      System.out.println("Que cantidad deceas retirar\n");
      System.out.println("Elija el monto a retirar\n1:100\n2:200\n3:500\n4:1000\n5:2000\n6:otras");
      xc=Integer.parseInt(sc.readLine());
      while(xc<0 || xc>6){
      System.out.println("Por favor elige una las opciones anteriores");
      xc=Integer.parseInt(sc.readLine());}
      switch(xc){
          
          case 1:
          Daciel.ahorros-=e[4];
          f-=e[4];
          limite+=e[4];
          contador4+=1;
          System.out.printf("Sale un billete de %d",e[4]);
          break;
          case 2:
          Daciel.ahorros-=e[3];
           f-=e[3];
           limite+=e[3];
           contador3+=1;
          System.out.printf("Sale un billete de %d",e[3]);
          break;
          case 3:
          Daciel.ahorros-=e[2];
           f-=e[2];
           limite+=e[2];
           contador2+=1;
          System.out.printf("Sale un billete de %d",e[2]);
          break;
          case 4:
          Daciel.ahorros-=e[1];
          contador1+=1;
           f-=e[1];
           limite+=e[1];
          System.out.printf("Sale un billete de %d",e[1]);
          break; 
          case 5:
          Daciel.ahorros-=e[0];
          contador+=1;
           f-=e[0];
            limite+=e[0];
          System.out.printf("Sale un billete de %d",e[0]);
          break; 
          case 6:
          System.out.println("\nDigite la cantidad que desea retirar");
          x=Integer.parseInt(sc.readLine());
          
          if ((x<100)||(x%10!=0)||(x>Daciel.ahorros-100)||(x>20000)||(x>f)){
              System.out.println("Trasaccion invalida");
          }
          if (a==5&&x>2000){
               System.out.println("Esta cuenta no es local\nSu retiro no puede exeder de 2000");
               retrincion=1;
          }
          else if ((x>=100)&&(x%10==0)&&(x<Daciel.ahorros-100)&&(retrincion!=1&&x<f)){
          limite+=x;
          Daciel.ahorros-=x;
          f-=x;
          c2=0;
           while(x!=0){
               if(e[c2]==2000){contador+=1;}
               if(e[c2]==1000){contador1+=1;}
               if(e[c2]==500){contador2+=1;}
               if(e[c2]==200){contador3+=1;}
               if(e[c2]==200){contador4+=1;}
          if ((e[0]==100)&&(e[1]==100)&&(e[2]==100)&&(e[3]==100)){contador4+=1;}
               if(x>=e[c2]){
                  x-=e[c2];
                  
               System.out.printf("Sale 1 Billete de %d\n",e[c2]);
           }
          if (x<e[c2]){
              c2++;
          }
          
          
          
          if (contador==20){e[0]=1000; }
          if(contador1==30){ e[0]=500;e[1]=500;}
          if (contador2==20){e[0]=200;e[1]=200;e[2]=200;}
          if (contador3==50){e[0]=100;e[1]=100;e[2]=100;e[3]=100;}
         
          
           }
           
          }
          break;
             
          }}
          break;    
          case 3:
          System.out.printf("El Balance en el cajero es %d\n",f);
          System.out.printf("Hay %d/20 billetes de 2000\n",contador);
          System.out.printf("Hay %d/30 billetes de 1000\n",contador1);
          System.out.printf("Hay %d/20 billetes de 500\n",contador2); 
          System.out.printf("Hay %d/50 billetes de 200\n",contador3);
          System.out.printf("Hay %d/100 billetes de 100\n",contador4);
          break;
      }
      
      }
      System.out.println("\nDesea realizar otra transaccion\n1:Si\n2:No");
      salida=Integer.parseInt(sc.readLine());
      while(salida<0||salida>2){
      System.out.println("Elieja una de las opciones anteriores");
      salida=Integer.parseInt(sc.readLine());
      }} 
      if(salida==2){
        inicio=5;  
      System.out.println("Gracias por utilizar este cajero\n\ncargando...\n\n");}
      }}}