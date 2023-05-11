public class Funcionario_Builder {

    private final String nome;


    private final String sobrenome;
    private final Integer idade;
    private final String telefone;
    private final String endereco;
    private final String cargo;
    private final double salario;

    protected Funcionario_Builder(String nome, String sobrenome, Integer idade,
                                  String telefone, String endereco, String cargo, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cargo = cargo;
        this.salario = salario;
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

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}
