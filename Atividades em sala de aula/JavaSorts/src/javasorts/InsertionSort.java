package javasorts;

import java.util.Scanner;

/**
 *
 * @author Gabriel Pegoraro
 */
public class InsertionSort {
    
    public static long compara = 0, deslocamento = 0;
    
    private static void insert(int array[], int i){
        
        int eleito = array[i];
        int comp = i - 1;
        
        while(comp >= 0 && eleito < array[comp]){
            compara++;
            array[comp + 1] = array[comp];// deslocando
            deslocamento++;
            comp--;
        }//fim while
        
        compara++;
        // iserindo eleito na posição de comparação
        array[comp + 1] = eleito;
        
    }// fim função insert
    
    public static void iSort(int array[]){
        
        for(int i = 1; i < array.length; i++){
            insert(array, i);
        }
    }
    
    private static void insertComentado(int array[], int i){
        Scanner scanner = new Scanner(System.in);
        
        int eleito = array[i];
        int comp = i - 1;
        
        System.out.println("Eleito: " + eleito);// mostrar eleito
        while(comp >= 0 && eleito < array[comp]){
            System.out.println("Comparando");
            System.out.println("v["+comp+"] = " + array[comp]);
            array[comp + 1] = array[comp];// deslocando
            comp--;
            JavaSorts.printArray(array);
            scanner.nextLine();
        }//fim while
        
        // iserindo eleito na posição de comparação
        System.out.println("Inserindo eleito indice: " + (comp + 1));
        array[comp + 1] = eleito;
        JavaSorts.printArray(array);
        scanner.nextLine();
        
    }// fim função insertComentado
    
     public static void iSortComentado(int array[]){
        
        for(int i = 1; i < array.length; i++){
            System.out.println("Fase " + i);
            insertComentado(array, i);
        }
    }
}