
package repaso;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Uno {

  
    public static void main(String[] args) {
        // TODO code application logic here
        ejercicio9();
    }
    public static void ejercicio1() {
        Scanner entrada = new Scanner(System.in);
        int num1,num2,suma,resta,resi;
        
        System.out.print("Digite un numero: ");
        num1=entrada.nextInt();
         System.out.print("Digite un numero: ");
        num2=entrada.nextInt();
        
        suma=num1+num2;
        resta=num1-num2;
        resi=num1%num2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("el residuo es: "+resi);
    }
    public static void ejercicio2 () {
         Scanner entrada = new Scanner(System.in);
         int num;
         
         System.out.println("1.Humano\n2.Musgo\n3.Arquebacteria\n4.ascomiceto\n5.Algas");
         System.out.print("Marca un numero para saber el reino de estos seres vivos: ");
         num=entrada.nextInt();
         
         if(num==1){
             System.out.println("Pertenece al reino animal.");
         }else if(num==2){
             System.out.println("Pertenece al reino vegetal.");
         }else if(num==3){
             System.out.println("Pertenece al reino monera.");
         }else if(num==4){
             System.out.println("Pertenece al reino fungi.");
         }else if(num==5){
             System.out.println("Pertenece al reino protoctista.");
         }else{
             System.out.println("la opcion que escribio no es valida");
         }
    }
    public static void ejercicio3 () {
        int num;
         
         num=Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero de 1 al 7"));
         
        
             switch(num){
                 case 1:
                     JOptionPane.showMessageDialog(null, "La nota en esa posicion es Do"); 
                             
                     break;
                 case 2:
                     JOptionPane.showMessageDialog(null, "La nota en esa posicion es Re");
                     
                     break;
                 case 3:
                     JOptionPane.showMessageDialog(null, "La nota en esa posicion es Mi");
                     
                     break;
                 case 4:
                     JOptionPane.showMessageDialog(null, "La nota en esa posicion es Fa");
                     
                     break;
                  case 5:
                      JOptionPane.showMessageDialog(null,"La nota en esa posicion es Sol" );
                     
                     break;
                  case 6:
                      JOptionPane.showMessageDialog(null,"La nota en esa posicion es La" );
                     
                     break;
                  case 7:
                      JOptionPane.showMessageDialog(null, "La nota en esa posicion es Si");
                     
                     break;
                   default:
                       JOptionPane.showMessageDialog(null, "Error");
                           
             }
       
        
    }
    public static void ejercicio4 () {
        int num;
         
         num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
         
         
        for(int i=0;i<=num;i++){
            JOptionPane.showMessageDialog(null,i+" ");
        }
         
    }
    public static void ejercicio5 () {
        int num;
         
         num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
         
         
        for(int i=0;i<=num;i+=3){
            JOptionPane.showMessageDialog(null,i+" ");
        }
        
    }
    public static void ejercicio6 () {
        int num;
         
         num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
         
         if(num%2==0){
              JOptionPane.showMessageDialog(null,"El numero "+num+" es par");
         }else{
             JOptionPane.showMessageDialog(null,"El numero "+num+" es impar");
         }
        
    }
    public static void ejercicio7 () {
        int num,resul,a=0,b=1;
         num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
         while(a<num){
            JOptionPane.showMessageDialog(null,a); 
            resul=a+b;
            a=b;
            b=resul;
         }
          
        
    }
    public static void ejercicio8 () {
        int a,num1,num2,num3;
        a=1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        if(a==num1){
                    JOptionPane.showMessageDialog(null,"Acceso permitido");
                    System.exit(0);
                }else
                    JOptionPane.showMessageDialog(null,"Acceso denegado");
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog("intentos restantes 2\n Digite un numero:"));
        if(a==num2){
                    JOptionPane.showMessageDialog(null,"Acceso permitido");
                    System.exit(0);
                }else
                    JOptionPane.showMessageDialog(null,"Acceso denegado");
        
        num3 = Integer.parseInt(JOptionPane.showInputDialog("intentos restantes 1\n Digite un numero:"));
                if(a==num3){
                    JOptionPane.showMessageDialog(null,"Acceso permitido");
                    System.exit(0);
                }else
                    JOptionPane.showMessageDialog(null,"Clave bloqueada");
        
        
    }
    public static void ejercicio9() {
        int num,lado,area;
          
         num=Integer.parseInt(JOptionPane.showInputDialog("Digite numero de cuadrados que le quiere hallar el area: "));
         
         for(int i=0;i<num;i++){
          
          lado=Integer.parseInt(JOptionPane.showInputDialog("Cuadrado N°"+(i+1)+"\nDigite algun lado del cuadrado: "));
          
          area=lado*lado;
           JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+area);
           
           
           }
         
         
       
       }
    }

