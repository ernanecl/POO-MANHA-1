package exercicio1;

public class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void fazAniversario(){
        idade = idade+1;
    }

    @Override
    public String toString() {
        return "nome: " + nome +" | idade: " + idade + "\n";
    }
}
