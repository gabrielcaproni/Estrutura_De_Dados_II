
package percursosarvorebinaria;

/**
 *
 * @author Gabriel Pegoraro
 */
public class BinarySearchTree<T extends Comparable<T>>{
    Node raiz = null;
    
    public void add(T novoNode){
        Node<T> novoNo = new Node<T>(novoNode);
        raiz = inserir(raiz, novoNo);
    }

    private Node<T> inserir(Node<T> raiz, Node<T> novoNode) {
        
    }
}
