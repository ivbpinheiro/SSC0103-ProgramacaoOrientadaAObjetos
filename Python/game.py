class Adivinha:
    def __init__(self):
        self.number_password = 0
        self.init = 0
        self.final = self.number_password
        self.gameOn = True
        self.game_init()

    def game_init(self):
        print("Bem vindx, esse é o Jogo De Senha!")
        print("Forneca um valor inteiro para N e pense num numero nesse intervalo (de 0 a N). A maquina vai adivinhar qual o numero que o usuario pensou")
        self.number_password = int(input("Digite um numero inteiro: "))
        print("Pense num numero no intervalo de 0 a", self.number_password)
        print("A maquina vai gerar um numero no intervalo definido e voce deve dizer se o numero escolhido e maior (digitando 1), menor (digitando 0) que o numero gerado ou igual (digitando 2)")
        self.final = self.number_password
        self.game_start()

    def game_start(self):
        counter = 0        
        while self.gameOn:
            guess_num = (int)((self.init + self.final) / 2)
            response = input("O número é maior, menor ou igual a " + str(guess_num) + "?")
            
            if response.isdigit():
                response_num = int(response)
            else:
                response_num = -1
                
            if response_num == 1:
                self.init = guess_num + 1
            elif response_num == 0:
                self.final = guess_num - 1
            elif response_num == 2:
                print("Parabéns! O numero e: " + str(guess_num) + " A máquina acertou em " + str(counter) + " tentativas!")
                self.gameOn = False
            elif response_num == -1:
                print("Por favor, digite 0, 1 ou 2.")
            else:
                print("Algo deu errado!")
                counter -= 1
                                
            counter += 1


def main():
    game_on = Adivinha()   

if __name__ == "__main__":
    main()
