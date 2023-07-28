/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasorts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriel Pegoraro
 */
public class JavaSorts {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tamanho;
        System.out.println("Tamanho do vetor: ");
        tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        
        System.out.println("Dados vetor: ");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
            vetor2[i] = vetor[i];
        }// fim for
        
        System.out.println("Vetor original ");
        printArray(vetor);
        
        BubbleSort.bSorteCrescente(vetor);
        System.out.println("\nVetor ordenado Crescente ");
        printArray(vetor);
        
        BubbleSort.bSorteDecrescente(vetor2);
        System.out.println("\nVetor ordenado Decrescente ");
        printArray(vetor2);
    }
    
    public static void printArray(int array[]){
       for(int i = 0; i < array.length; i++){
           System.out.print(array[i] + "| ");
       }//fim printArray
        
    }
    
}
