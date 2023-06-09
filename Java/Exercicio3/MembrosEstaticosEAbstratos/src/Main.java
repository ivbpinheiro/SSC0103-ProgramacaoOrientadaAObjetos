import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Gerente gGeneric = new Gerente("Gerente" + String.valueOf(i),"97538900012", 4500.58 + i);
            Vendedor vGeneric = new Vendedor("Vendedor" + String.valueOf(i),"172.244.850-47", 3500.73 + i, 100 * i);
            Assistente aGeneric = new Assistente("Assistente" + String.valueOf(i),"91827876034", 2600.31 + i);
            listaDeFuncionarios.add(gGeneric);
            listaDeFuncionarios.add(vGeneric);
            listaDeFuncionarios.add(aGeneric);
        }
        System.out.println(listaDeFuncionarios);
        for (Funcionario func : listaDeFuncionarios) {
            if(Funcionario.verificaCPF(func.getCPF())){
                System.out.println("O CPF é válido e é: " + func.getCPF());
            } else {
                System.out.println("O CPF é inválido");
            }

        }
        double folhaSalarial = 0;
        for (Funcionario func : listaDeFuncionarios) {
            folhaSalarial = folhaSalarial + func.getSalarioBase();
        }
        System.out.println("A folha salarial é R$: " + (new DecimalFormat("#.###").format(folhaSalarial)));
    }
}