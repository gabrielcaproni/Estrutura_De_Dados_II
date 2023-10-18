
package percursosarvorebinaria;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Pokemon implements Comparable<Pokemon>{
    private int id;
    private String nome;
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
            return " Nome:"+this.nome+
                      " ID:"+this.id;
    }

    @Override
    public int compareTo(Pokemon outro) {
        return Integer.compare
           (this.id, outro.id);
    }
    
    @Override
    public boolean equals(Object novoObjeto){
        if(this == novoObjeto)
            return true;
        if(novoObjeto == null || this.getClass() != novoObjeto.getClass())
            return false;
        Pokemon outroPokemon = (Pokemon) novoObjeto;
        return this.id == outroPokemon.id;
    }
}
