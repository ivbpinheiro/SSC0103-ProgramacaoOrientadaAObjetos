from Funcionario import Funcionario

class Assistente(Funcionario):
    def __init__(self, nome, cpf, salario_base):
        super().__init__(nome, cpf, salario_base)        
        self.salario = salario_base
    
    def calculaSalario(self):
        return self.salario