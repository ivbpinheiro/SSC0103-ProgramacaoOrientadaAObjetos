import java.util.Objects;
import static java.lang.Integer.parseInt;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public abstract class Funcionario {
    private String nome;

    private String CPF;

    private double salarioBase;

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    protected void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    protected void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    static boolean verificaCPF(String strCPF){
        strCPF = strCPF.replaceAll("[.-]", "");
        int Soma = 0;
        int Resto;
        if (Objects.equals(strCPF, "00000000000")) return false;
        for (int i = 1; i <= 9; i++) {
            Soma = Soma + parseInt(strCPF.substring(i-1, i)) * (11 - i);
        }
        Resto = (Soma * 10) % 11;
        if ((Resto == 10) || (Resto == 11))  Resto = 0;
        if (Resto != parseInt(strCPF.substring(9, 10)) ) return false;
        Soma = 0;
        for (int i = 1; i <= 10; i++) Soma = Soma + parseInt(strCPF.substring(i-1, i)) * (12 - i);
        Resto = (Soma * 10) % 11;
        if ((Resto == 10) || (Resto == 11))  Resto = 0;
        if (Resto != parseInt(strCPF.substring(10, 11) ) ) return false;
        return true;
    }
    public abstract double calculaSalario();

    @Override
    public String toString(){
        return "O funcionario é: " + this.getNome() + " O CPF é: " + this.getCPF() + " O Salário é: " + this.calculaSalario() + " |\n";
    }
}
