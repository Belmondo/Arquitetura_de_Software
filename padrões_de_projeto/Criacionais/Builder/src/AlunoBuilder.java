public class AlunoBuilder {

    private String nome;
    private String sobrenome;
    private Integer idade;
    private String telefone;
    private String endereco;

    public AlunoBuilder() {
    }

    public AlunoBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public AlunoBuilder comSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public AlunoBuilder comIdade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public AlunoBuilder comTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public AlunoBuilder comEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public Aluno toAluno() throws Exception {
        validarUsuario();
        return new Aluno(nome, sobrenome, idade, telefone, endereco);
    }

    private void validarUsuario() throws Exception {

        if(nome == null || nome.isEmpty()) {
            throw new Exception();
        }
        if(sobrenome == null || sobrenome.isEmpty()) {
            throw new Exception();
        }
        if(idade < 18)
            throw new Exception();
    }
}
