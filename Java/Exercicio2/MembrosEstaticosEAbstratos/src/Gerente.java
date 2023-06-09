public class Gerente extends Funcionario {
    public Gerente(String nome, String CPF, double salarioBase) {
        super.setNome(nome);
        super.setCPF(CPF);
        super.setSalarioBase(salarioBase);
    }

    @Override
    public double calculaSalario() {
        return  super.getSalarioBase()*2;
    }
}
