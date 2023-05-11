public class Main {
    public static void main(String[] args) throws Exception {
        AlunoBuilder alunoBuilder = new AlunoBuilder();

        alunoBuilder.comNome("Belmondo").comSobrenome("Rodrigues").comIdade(30).comEndereco("Rua XYZ").comTelefone("9999999999");

        Aluno aluno1 = alunoBuilder.toAluno();

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getEndereco());


    }
}