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
    
    static int menuAlgoritmo(){
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        
        System.out.println("1- Bublle sort");
        System.out.println("2- Selection sort");
        System.out.println("3- Insertion sort");
        opcao = scanner.nextInt();
        
        return opcao;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        int tamanho;
        int op;
        int opDecrescente;
        int opAlgoritmo;
        
        System.out.println("Tamanho do vetor: ");
        tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        op = menuEntrada();
        opAlgoritmo = menuAlgoritmo();
        opDecrescente = menuEntrada();
        
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
        
        switch(opDecrescente){
            
            case 1: for(int i = 0; i < vetor2.length - 1; i++){
                        vetor2[i] = rand.nextInt(100);
                    }
                    break;
            
            case 2: System.out.println("Dados vetor: ");
                for(int i = 0; i < vetor2.length - 1; i++){
                    vetor2[i] = scanner.nextInt();
            }// fim for
                
                break;
        }

//-----------------------------------------------------------------
        // BUBLLESORT
        
        switch(opAlgoritmo){
            case 1: BubbleSort.bSortComentado(vetor);
                System.out.println("\nVetor ordenado Crescente ");
                printArray(vetor);
        
                BubbleSort.bSortDesc(vetor2);
                System.out.println("\nVetor ordenado Decrescente ");
                printArray(vetor2);
                
                break;
        
//-----------------------------------------------------------------        
        // SELECTIONSORT
        
            case 2: System.out.println("Vetor original ");
                printArray(vetor);
        
                SelectionSort.sSortComentado(vetor);
                System.out.println("\nVetor ordenado ");
                printArray(vetor);
                
                break;
       
//-----------------------------------------------------------------
        // INSERTIONSORT
        
            case 3: System.out.println("Vetor original ");
                printArray(vetor);
        
                InsertionSort.iSortComentado(vetor);
                System.out.println("\nVetor ordenado ");
                printArray(vetor);
        
                break;
        } 
    }    
        
    public static void printArray(int array[]){
    
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + "| ");
    }//fim printArray
}