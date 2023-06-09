public class Vendedor extends Funcionario{
    private double comissao = 0;
    public Vendedor(String nome, String CPF, double salarioBase, double comissao) {
        super.setNome(nome);
        super.setCPF(CPF);
        super.setSalarioBase(salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        return super.getSalarioBase() + this.comissao;
    }
}
