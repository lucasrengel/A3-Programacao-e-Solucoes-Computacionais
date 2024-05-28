package modelo;

public class Amigo {

    private int id;
    private String nome;
    private String telefone;

    public Amigo() {
    }
    
    //construtor sem id por causa do auto incremental
    public Amigo(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public Amigo(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "id: " + id + ", nome: " + nome + ", telefone: " + telefone;
    }

}
