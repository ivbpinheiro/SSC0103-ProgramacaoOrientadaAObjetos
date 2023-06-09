from abc import ABC, abstractmethod
import re

class Funcionario(ABC):
    def __init__(self, nome, cpf, salario_base):
        self.nome = nome
        self.cpf = cpf
        self.salario_base = salario_base

    @abstractmethod
    def calculaSalario(self):
        pass

    @staticmethod
    def verificaCPF(strCPF):
            Soma = 0
            Resto = 0
            strCPF = re.sub(r"[.-]", "", strCPF)
            if len(strCPF) < 11:
                return False 
            if strCPF == "00000000000":
                return False
            for i in range(1, 10):
                Soma += int(strCPF[i-1]) * (11 - i)
            Resto = (Soma * 10) % 11
            if Resto == 10 or Resto == 11:
                Resto = 0
            if Resto != int(strCPF[9]):
                return False
            Soma = 0
            for i in range(1, 11):
                Soma += int(strCPF[i-1]) * (12 - i)
            Resto = (Soma * 10) % 11
            if Resto == 10 or Resto == 11:
                Resto = 0
            if Resto != int(strCPF[10]):
                return False
            return True