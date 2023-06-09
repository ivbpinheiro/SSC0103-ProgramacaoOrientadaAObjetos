from Funcionario import Funcionario
from Gerente import Gerente
from Assistente import Assistente
from Vendedor import Vendedor

def main():
    dados_funcionarios = [
        # O primeiro CPF é inválido propositalmente
        {"tipo": "Gerente", "nome": "Marcio", "cpf": "42854101845", "salario": 3000.0},
        {"tipo": "Assistente", "nome": "Eduardo", "cpf": "605.174.250-68", "salario": 2000.0},
        {"tipo": "Vendedor", "nome": "Delamaro", "cpf": "54643343001", "salario": 2500.0, "comissao": 500.0},
        {"tipo": "Vendedor", "nome": "Marcio Eduardo Delamaro", "cpf": "172.244.850-47", "salario": 2500.0, "comissao": 750.0}
    ]

    funcionarios = []    
    
    for dados in dados_funcionarios:
        tipo = dados["tipo"]
        nome = dados["nome"]
        cpf = dados["cpf"]
        salario = dados["salario"]

        if tipo.lower() == "gerente":
            funcionario = Gerente(nome, cpf, salario)
        elif tipo.lower() == "assistente":
            funcionario = Assistente(nome, cpf, salario)
        elif tipo.lower() == "vendedor":
            comissao = dados["comissao"]
            funcionario = Vendedor(nome, cpf, salario, comissao)
        else:
            print("Tipo de funcionário inválido. Tente novamente.")
            continue

        funcionarios.append(funcionario)    

    folha_salarial = 0.0
    for funcionario in funcionarios:
        folha_salarial += funcionario.calculaSalario()
    
    print("Folha salarial total e: R$", folha_salarial)

    for funcionario in funcionarios:
        verifica_cpf = Funcionario.verificaCPF(funcionario.cpf)
        if verifica_cpf:
            print("CPF valido:", funcionario.cpf)
        else:
            print("CPF invalido:", funcionario.cpf)

if __name__ == "__main__":
    main()