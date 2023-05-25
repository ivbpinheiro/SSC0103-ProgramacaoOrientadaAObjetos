from baralho import *
from rodada import *

def exibir_rodada(rodada):
    print(rodada)
    print("  (1)        (2)        (3)        (4)        (5)")

def realizar_rodada(saldo):
    if saldo == 0:
        print("Seu saldo acabou, fim de jogo :(")
        return 0

    baralho = Baralho()
    rodada = Rodada(baralho)

    print("Saldo atual: " + str(saldo))

    while True:
        aposta = input("Digite o valor da aposta, ou 'out' para sair do jogo\n")
        if aposta == "out":
            print("Você finalizou o jogo com {:d} de saldo".format(saldo))
            return -150        
        aposta = int(aposta)
        rodada.setAposta(saldo, aposta)
        exibir_rodada(rodada)
        rodada.trocarCartas(baralho)
        exibir_rodada(rodada)
        rodada.trocarCartas(baralho)
        exibir_rodada(rodada)
        saldo = rodada.add(saldo)
        if aposta <= 0:
            break
    return saldo

saldo = 200
while True:
    saldo = realizar_rodada(saldo)
    if saldo == 0 or saldo == -150:
        break
