import baralho as brl

class Rodada(object):
    def __init__(self, baralho):
        self.aposta = 0
        self.rodada = baralho.getRodada()

    def __str__(self):
        s = ""
        for i in range(5):
            base = i * 8
            for c in self.rodada:
                p = str(c)
                s += p[base:base + 7]
                s += "    "
            s += "\n"
        return s

    def getRodada(self):
        return self.rodada

    def trocarCartas(self, baralho):
        troca = input(
            "Insira quais cartas deseja trocar separadas por espaço, caso não queira trocar, apenas pressione ENTER\n").split()

        troca = [int(t) - 1 for t in troca if t.isdigit() and int(t) <= len(self.rodada)]
        for i in troca:
            self.rodada[i] = baralho.pegarCarta()

    def add(self, saldo):
        copiaRodada = sorted(self.rodada, key=lambda c: c.getSimbolo())
        comb, multiplicador = Rodada.combinacoes(copiaRodada)

        if comb:
            saldo += self.aposta * multiplicador
            print(f"Parabéns! Você fez uma {comb}!")
        else:
            saldo -= self.aposta
            print("Infelizmente você não conseguiu fazer nenhuma combinação :(")
        return saldo

    def setAposta(self, saldo, aposta):
        if saldo < aposta:
            print("Faça uma aposta menor ou igual ao seu saldo")
        else:
            self.aposta = aposta

    @staticmethod
    def ordena(rodada):
        return sorted(rodada, key=lambda c: c.getSimbolo())

    @staticmethod
    def combinacoes(rodada):
        simbolos = [c.getSimbolo() for c in rodada]
        naipes = [c.getNaipe() for c in rodada]

        if Rodada.royalStraightFlush(simbolos, naipes):
            return "Royal Straight Flush", 200
        elif Rodada.straightFlush(simbolos, naipes):
            return "Straight Flush", 100
        elif Rodada.quadra(simbolos):
            return "Quadra", 50
        elif Rodada.fullHand(simbolos):
            return "Full Hand", 20
        elif Rodada.flush(naipes):
            return "Flush", 10
        elif Rodada.straight(simbolos):
            return "Straight", 5
        elif Rodada.trinca(simbolos):
            return "Trinca", 2
        elif Rodada.doisPares(simbolos):
            return "Dois Pares", 1
        else:
            return None, 0

    @staticmethod
    def royalStraightFlush(simbolos, naipes):
        return sorted(simbolos) == [10, 11, 12, 13, 14] and len(set(naipes)) == 1

    @staticmethod
    def straightFlush(simbolos, naipes):
        return Rodada.straight(simbolos) and Rodada.flush(naipes)

    @staticmethod
    def quadra(simbolos):
        return simbolos[0] == simbolos[3] or simbolos[1] == simbolos[4]

    @staticmethod
    def fullHand(simbolos):
        return (simbolos[0] == simbolos[2] and simbolos[3] == simbolos[4]) or (simbolos[0] == simbolos[1] and simbolos[2] == simbolos[4])

    @staticmethod
    def flush(naipes):
        return len(set(naipes)) == 1

    @staticmethod
    def straight(simbolos):
        return simbolos == list(range(simbolos[0], simbolos[0] + 5))

    @staticmethod
    def trinca(simbolos):
        return simbolos[0] == simbolos[2] or simbolos[2] == simbolos[4]

    @staticmethod
    def doisPares(simbolos):
        return len(set(simbolos)) == 3


def main():
    baralho = brl.Baralho()
    rodada = Rodada(baralho)
    rodada.setAposta(20)

    print(rodada)

    rodada.trocarCartas(baralho)
    print(rodada)
    rodada.trocarCartas(baralho)
    print(rodada)

    saldo = 100
    saldo = rodada.add(saldo)
    print(f"Saldo: {saldo}")

    return


if __name__ == "__main__":
    main()
