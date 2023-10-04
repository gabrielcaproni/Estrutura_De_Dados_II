
package percursosarvorebinaria;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Node< T extends Comparable<T>>{
    T dado;
    
    Node<T> esquerda;
    Node<T> direita;
    
    public Node(T novoDado){
        this.dado = novoDado;
        this.esquerda = null;
        this.direita = null;
    }
}
