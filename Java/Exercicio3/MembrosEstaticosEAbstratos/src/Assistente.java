public class Assistente extends Funcionario {
    public Assistente(String nome, String CPF, double salarioBase) {
        super.setNome(nome);
        super.setCPF(CPF);
        super.setSalarioBase(salarioBase);
    }

    @Override
    public double calculaSalario() {
        return super.getSalarioBase();
    }
}
