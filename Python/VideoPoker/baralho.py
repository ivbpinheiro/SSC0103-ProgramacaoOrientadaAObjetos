import random

class Baralho(object):
    def __init__(self):
        self.__naipes = ["♥", "♠", "♦", "♣"]
        self.__simbolos = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
        self.baralho = []

        for naipe in self.__naipes:
            for simbolo in self.__simbolos:
                self.baralho.append(Carta(naipe, simbolo))

        self.embaralhar()

    def __str__(self):
        s = ""
        for a in range(0, 52, 13):
            for i in range(5):
                base = i * 8
                for c in range(a, a + 13):
                    p = str(self.baralho[c])
                    s += p[base:base+7]
                    s += "    "
                s += "\n"
        return s

    def getRodada(self, n=5):
        rodada = []
        for _ in range(n):
            rodada.append(self.baralho.pop(0))
        return rodada

    def pegarCarta(self):
        return self.baralho.pop(0)

    def embaralhar(self):
        self.baralho = random.sample(self.baralho, len(self.baralho))



def main():
    # OBS: usar um terminal com um tamanho de pelo menos 143 x 22 para visualizar o baralho inteiro
    baralho = Baralho()
    print(len(baralho.baralho))
    print(baralho)
    return 0

if __name__ == "__main__":
    main()

class Carta(object):
    def __init__(self, naipe, simbolo):
        self.naipe = naipe
        self.simbolo = simbolo

    def __str__(self):
        simbolo = self.getSimboloString()
        naipe = self.getNaipe()
        s = "+-----+\n|     |\n| " + simbolo + " " + naipe + " |\n|     |\n+-----+\n"
        return s

    def getNaipe(self):
        return self.naipe

    def getSimbolo(self):
        return self.simbolo

    def getSimboloString(self):
        if self.simbolo == 14:
            return "A"
        elif self.simbolo == 13:
            return "K"
        elif self.simbolo == 12:
            return "Q"
        elif self.simbolo == 11:
            return "J"
        else:
            return str(self.simbolo)
