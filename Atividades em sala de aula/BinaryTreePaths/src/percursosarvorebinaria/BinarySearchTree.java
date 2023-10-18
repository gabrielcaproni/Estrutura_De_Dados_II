
package percursosarvorebinaria;

import javax.swing.JTextArea;

/**
 *
 * @author Gabriel Pegoraro
 */
public class BinarySearchTree<T extends Comparable<T>>{
    Node raiz = null;
    int cont;
    
    public int add(T newNode){
        Node<T> newNo = new Node<T>(newNode);
        raiz = inserir(raiz, newNo);
        return cont;
    }

    private Node<T> inserir(Node<T> raiz, Node<T> newNode) {
        cont++;
        if(raiz == null){
            return newNode;
        }
        if(newNode.dado.compareTo(raiz.dado) >= 0){
            raiz.direita = inserir(raiz.direita, newNode);
        }else{
            raiz.esquerda = inserir(raiz.esquerda, newNode);
        }
        
        return raiz;
    }
    
    public T buscar(T dadoBusca){
        return (T)buscar(raiz, dadoBusca);
    }
    private T buscar(Node<T> raiz, T dadoBusca){
        if(raiz == null)
            return null;
        if(raiz.dado.equals(dadoBusca))
            return raiz.dado;
        if(dadoBusca.compareTo(raiz.dado) < 0)
            return buscar(raiz.esquerda, dadoBusca);
        else
            return buscar(raiz.direita, dadoBusca);
    }
    
    public void preOrder(){
        preOrder(raiz);
    }
    
    private void preOrder(Node<T> raiz){
        
        if(raiz != null){
            System.out.print(raiz.dado + " ");
            preOrder(raiz.esquerda);
            preOrder(raiz.direita);
        }
    }
    
    public void inOrder(){
        inOrder(raiz);
    }
    
    private void inOrder(Node<T> raiz){
        if(raiz != null){
            inOrder(raiz.esquerda);
            System.out.print(raiz.dado + " ");
            inOrder(raiz.direita);
        }
    }
    
    public void posOrder(){
        posOrder(raiz);
    }
    
    private void posOrder(Node<T> raiz){
        
        if(raiz != null){
            posOrder(raiz.esquerda);
            posOrder(raiz.direita);
            System.out.print(raiz.dado + " ");
        }
    }
    
    public void preOrder(JTextArea listMostraDados){
        preOrder(raiz, listMostraDados);
        listMostraDados.append("\n");
    }
    
    private void preOrder(Node<T> raiz, JTextArea listMostraDados){
        
        if(raiz != null){
            listMostraDados.append(raiz.dado + "|");
            preOrder(raiz.esquerda, listMostraDados);
            preOrder(raiz.direita, listMostraDados);
        }
    }
}
