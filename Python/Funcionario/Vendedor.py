from Funcionario import Funcionario

class Vendedor(Funcionario):
    def __init__(self, nome, cpf, salario_base, comissao):
        super().__init__(nome, cpf, salario_base)
        self.comissao = comissao
        self.salario = salario_base

    def calculaSalario(self):
        return self.salario + self.comissao