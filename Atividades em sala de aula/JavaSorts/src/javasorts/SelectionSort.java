package javasorts;

import java.util.Scanner;

/**
 *
 * @author Gabriel Pegoraro
 */
public class SelectionSort {
    
    private static int indexMinArray(int array[], int posAtual){
        
        int k = posAtual; // K é o indice do menor 
        
        for(int i = posAtual + 1; i < array.length; i++){
            if(array[i] < array[k]){
                k = i;
            }
        }//fim for
        return k;
        
    }//fim função indexMinArray
    
    public static void sSort(int array[]){
        
        for(int i = 0; i < array.length-1; i++){
            int k = indexMinArray(array, i);
            
            // trocar os valores de i com k
            
            int temp = array[i];
            array[i] = array[k];
            array[k] = temp;
            
        }
    }// fim função sSort
    
     public static void sSortComentado(int array[]){
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < array.length-1; i++){
            System.out.println("Fase " + i);
            int k = indexMinArray(array, i);
            System.out.println("Atual: " + array[i] + " Trocando com menor valor: " + array[k]);
            scanner.nextLine();// Pausa 
            
            // trocar os valores de i com k
            
            int temp = array[i];
            array[i] = array[k];
            array[k] = temp;
            JavaSorts.printArray(array);
            scanner.nextLine();// Pausa
        }
    }// fim função sSort
}
