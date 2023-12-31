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
    
    static int menuBusca(){
        Scanner scanner = new Scanner(System.in);
        
        int opBusca;
        
        System.out.println("\n\n1 - Busca linear");
        System.out.println("2 - Busca binária");
        System.out.println("0 - Sair\n");
        opBusca = scanner.nextInt();
        
        return opBusca;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        int tamanho, valorBusca;
        int op;
        int opAlgoritmo;
        long tempoInicial, tempoFinal;
        
        System.out.println("Tamanho do vetor: ");
        tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        op = menuEntrada();
        opAlgoritmo = menuAlgoritmo();
        
        
        switch(op){
            
            case 1: for(int i = 0; i < vetor.length - 1; i++){
                        vetor[i] = rand.nextInt(100);
                    }
                    for(int i = 0; i < vetor2.length - 1; i++){
                        vetor2[i] = rand.nextInt(100);
                    }
                    break;
            
            case 2: System.out.println("Dados vetor: ");
                for(int i = 0; i < vetor.length - 1; i++){
                    vetor[i] = scanner.nextInt();
                }
                for(int i = 0; i < vetor2.length - 1; i++){
                    vetor2[i] = scanner.nextInt();
                }
                
                break;
        }

//-----------------------------------------------------------------
        // BUBLLESORT
        
        switch(opAlgoritmo){
            case 1: System.out.println("\nVetor Original ");
                printArray(vetor);
                
                tempoInicial = System.currentTimeMillis();
                BubbleSort.bSort(vetor);
                tempoFinal = System.currentTimeMillis();
                System.out.println("\nComparações: " + BubbleSort.compara + " \nTrocas: " + BubbleSort.troca  + " \nTempo: " + (tempoFinal - tempoInicial));
                
                /*System.out.println("\nVetor ordenado Decrescente ");
                printArray(vetor2);
                tempoInicial = System.currentTimeMillis();
                BubbleSort.bSortDesc(vetor2);
                tempoFinal = System.currentTimeMillis();
                System.out.println("Comparações: " + BubbleSort.compara + " Tempo: " + (tempoFinal - tempoInicial));*/
                
                break;
        
//-----------------------------------------------------------------        
        // SELECTIONSORT
        
            case 2: System.out.println("Vetor original ");
                printArray(vetor);
                
                tempoInicial = System.currentTimeMillis();
                SelectionSort.sSort(vetor);
                tempoFinal = System.currentTimeMillis();
                System.out.println("\nComparações: " + SelectionSort.compara + " \nTrocas: " + SelectionSort.troca  + " \nTempo: " + (tempoFinal - tempoInicial));
                               
                break;
       
//-----------------------------------------------------------------
        // INSERTIONSORT
                
        
            case 3: System.out.println("Vetor original ");
                printArray(vetor);
                
                tempoInicial = System.currentTimeMillis();
                InsertionSort.iSort(vetor);
                tempoFinal = System.currentTimeMillis();
                System.out.println("\nComparações: " + InsertionSort.compara + " \nDeslocamentos: " + InsertionSort.deslocamento  + " \nTempo: " + (tempoFinal - tempoInicial));
                    
                break;
        }
        
        System.out.println("Vetor Ordenado\n");
        printArray(vetor);
         int opBusca;
        do{
            opBusca= menuBusca();
        switch(opBusca){
            
            case 1: System.out.println("\nValor: ");
                valorBusca = scanner.nextInt();
                if(Search.buscaLinear(vetor, valorBusca)){
                    System.out.println("Encontrado");
                }else{
                    System.out.println("Inexistente");
                }
                System.out.println("Comparações busca linear: " + Search.compLinear);
                break;
                
            case 2: System.out.println("\nValor: ");
                valorBusca = scanner.nextInt();
                if(Search.buscaBinariaComentada(vetor, valorBusca)){
                    System.out.println("Encontrado");
                }else{
                    System.out.println("Inexistente");
                }
                System.out.println("Comparações busca binária: " + Search.compBinaria);
                break;
        }
        
        }while(opBusca != 0);
    }    
        
    public static void printArray(int array[]){
    
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + "| ");
    }//fim printArray
    
    public static void printIntervalo(int array[], int ini, int fim){
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + "| ");
    }//fim printArray
}