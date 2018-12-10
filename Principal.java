
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *    Roberto Valdez Vazquez 18550731
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        


        Scanner input = new Scanner (System.in);
        int num;

        int cont=2;
        boolean primo=true;
        
        System.out.println("Introduzca un número entero Positivo");
            num=input.nextInt();
            
           while((primo)&&(cont<(num/2))){
                cont++;

                if((num%cont)==0){
                   primo=false;
               }
            }
            if(primo){
                System.out.println(num+" Tu numero es un número primo");
            }else{
                System.out.println(num+" Tu numero no es un número primo");
            }
    }
    
}
