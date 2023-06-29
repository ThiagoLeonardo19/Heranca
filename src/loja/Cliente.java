package loja;

public class Cliente extends Pessoa {
    private int id;

    public Cliente(int id, String nome, String dataDeNascimento) {
        super(nome, dataDeNascimento);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
