public class Aluno {

    private final String nome;
    private final String sobrenome;
    private final Integer idade;
    private final String telefone;
    private final String endereco;

    protected Aluno(String nome, String sobrenome, Integer idade,
                      String telefone, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
}
