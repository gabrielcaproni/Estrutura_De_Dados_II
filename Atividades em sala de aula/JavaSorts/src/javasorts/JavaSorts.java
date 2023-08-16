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
    
    static int menuEntrada(){
        Scanner scanner = new Scanner(System.in);
        
        int op;
        System.out.println("1- Gerar dados");
        System.out.println("2- Entrar com dados");
        op = scanner.nextInt();
        
        return op;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random rand = new Random();
        int tamanho;
        int op;
        System.out.println("Tamanho do vetor: ");
        tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        op = menuEntrada();
        switch(op){
            
            case 1: for(int i = 0; i < vetor.length - 1; i++){
                        vetor[i] = rand.nextInt(100);
                    }
                    break;
            
            case 2: System.out.println("Dados vetor: ");
                for(int i = 0; i < vetor.length - 1; i++){
                    vetor[i] = scanner.nextInt();
            }// fim for
                
                break;
        }
        
        System.out.println("Vetor original ");
        printArray(vetor);
        
        SelectionSort.sSortComentado(vetor);
        System.out.println("\nVetor ordenado ");
        printArray(vetor);
        
        BubbleSort.bSorteComentado(vetor);
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
