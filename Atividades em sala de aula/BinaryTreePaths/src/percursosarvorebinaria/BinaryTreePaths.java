
package percursosarvorebinaria;

/**
 *
 * @author Gabriel Pegoraro
 */
public class BinaryTreePaths {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.add(new Aluno(30, "Athos"));
        tree.add(new Aluno(15, "Ryan"));
        tree.add(new Aluno(50, "Luiz"));
        tree.add(new Aluno(40, "Guilherme"));
        tree.add(new Aluno(45, "Andre"));
        
//        tree.add(30);
//        tree.add(15);
//        tree.add(50);
//        tree.add(40);
//        tree.add(45);
        
        System.out.println("Pre ordem");
        tree.preOrder();
        System.out.println("\nEm ordem");
        tree.inOrder();
        System.out.println("\nPos ordem");
        tree.posOrder();
    }
    
}
