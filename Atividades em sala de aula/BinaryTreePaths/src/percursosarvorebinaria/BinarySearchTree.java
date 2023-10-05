
package percursosarvorebinaria;

/**
 *
 * @author Gabriel Pegoraro
 */
public class BinarySearchTree<T extends Comparable<T>>{
    Node raiz = null;
    
    public void add(T newNode){
        Node<T> newNo = new Node<T>(newNode);
        raiz = inserir(raiz, newNo);
    }

    private Node<T> inserir(Node<T> raiz, Node<T> newNode) {
        
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
}
