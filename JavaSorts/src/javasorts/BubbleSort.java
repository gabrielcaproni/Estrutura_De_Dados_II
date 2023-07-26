/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasorts;

import java.util.Scanner;

/**
 *
 * @author Gabriel Pegoraro
 */
public class BubbleSort {
    public static void bSorte(int array[]){
        for(int fase = 1; fase < array.length; fase++){
            for(int comp = 0; comp < array.length - fase; comp++){
                if(array[comp] > array[comp+1]){
                    int temp = array[comp];
                    array[comp] = array[comp+1];
                    array[comp+1] = temp;
                }//fim if 
            }//fim for comp
        }//fim for fase
    }
    
    public static void bSorteComentado(int array[]){
        Scanner scanner = new Scanner(System.in);
        boolean troca;
        do{
           troca = false;
        for(int fase = 1; fase < array.length; fase++){
            System.out.println("Fase: " + fase);//
            JavaSorts.printArray(array);//
            scanner.nextLine(); // pause
            
            for(int comp = 0; comp < array.length - fase; comp++){
                System.out.println("Comparando " + array[comp] + " com " + array[comp+1]);//
                
                if(array[comp] > array[comp+1]){
                    troca = true;
                    System.out.println("Trocou");//
                    int temp = array[comp];
                    array[comp] = array[comp+1];
                    array[comp+1] = temp;
                }//fim if 
            }//fim for comp
        }//fim for fase
        
    }
        while(troca);
}//fim classe
}
