package javasorts;

import java.util.Scanner;

/**
 *
 * @author Gabriel Pegoraro
 */
public class BubbleSort {
    
    public static void bSort(int array[]) {
        int n = array.length;
        int temp;
        for(int fase = 1; fase < n; fase++) {
            boolean trocaFase = false;

            for(int comp = 0; comp < n - fase; comp++) {
                if(array[comp] > array[comp + 1]) {
                    temp = array[comp];
                    array[comp] = array[comp + 1];
                    array[comp + 1] = temp;
                    trocaFase = true;
                }
            }

            if(!trocaFase) {
                return;
            }
        }
    }
    
    public static void bSortComentado(int array[]) {
        Scanner scanner = new Scanner(System.in);
        int n = array.length;
        int temp;

        for(int fase = 1; fase < n; fase++) {
            System.out.println("Fase: " + fase);
            JavaSorts.printArray(array);
            scanner.nextLine();
            boolean trocaFase = false;

            for(int comp = 0; comp < n - fase; comp++) {
                //System.out.println("Comparacao: " + (comp + 1));
                System.out.println("Comparando: " + array[comp] + " e " + array[comp+1]);
                if(array[comp] > array[comp + 1]) {
                    temp = array[comp];
                    array[comp] = array[comp + 1];
                    array[comp + 1] = temp;
                    trocaFase = true;
                }
            }

            if(!trocaFase) {
                return;
            }
        }
    }

    public static void bSortDesc(int array[]) {
        Scanner scanner = new Scanner(System.in);
        int n = array.length;
        int temp;

        for(int fase = 1; fase < n; fase++) {
            System.out.println("Fase: " + fase);
            JavaSorts.printArray(array);
            scanner.nextLine();
            boolean trocaFase = false;

            for(int comp = 0; comp < n - fase; comp++) {
                //System.out.println("Comparacao: " + (comp + 1));
                System.out.println("Comparando: " + array[comp] + " e " + array[comp+1]);
                if(array[comp] < array[comp + 1]) {
                    temp = array[comp];
                    array[comp] = array[comp + 1];
                    array[comp + 1] = temp;
                    trocaFase = true;
                }
            }

            if(!trocaFase) {
                return;
            }
        }
    }
        
}