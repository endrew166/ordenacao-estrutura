package iftm.estrutura;


public class Main {
    public static void main(String[] args) {
        
        int posicao = 5;   
        System.out.println(Fibo.fibonacci(posicao));

 
        int[] vetor = {1,2,3,4,6,7,5,12,17,20,23};
        

        
        for (int i = 0 ; i < vetor.length ;i++) {
        	   Ordenacao.insertionSort(vetor, 0, vetor.length - 1);
               //Ordenacao.selectionSort(vetor, 0, vetor.length - 1);
               //Ordenacao.bubbleSort(vetor, 0, vetor.length - 1);
              // Ordenacao.quickSort(vetor, 0, vetor.length - 1);
        	   System.out.print( vetor[i] + " ");
        }
        
        
    }
}
