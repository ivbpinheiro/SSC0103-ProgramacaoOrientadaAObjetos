class Adivinha:
    def __init__(self):
        self.number_password = 0
        self.init = 0
        self.final = self.number_password
        self.game_init()

    def game_init(self):
        print("Forneca um valor para N e pense num numero nesse intervalo (de 0 a N). A maquina vai adivinhar qual o numero que o usuario pensou")
        self.number_password = int(input("Digite um numero inteiro: "))
        print("Pense num numero no intervalo de 0 a", self.number_password)
        print("A maquina vai gerar um numero no intervalo definido e voce deve dizer se o numero escolhido e maior (digitando 'maior'), menor (digitando 'menor') que o numero gerado ou igual (digitando 'igual')")
        self.final = self.number_password
        print(self.final)
        self.game_start()

    def game_start(self):
        gameOn = True
        while gameOn:
            hit = (int)((self.init + self.final) / 2)
            number_response = input("O número é maior, menor ou igual a " + str(hit) + "?")
            while number_response.lower() not in ['maior', 'menor', 'igual']:
                number_response = input("Por favor, digite 'maior', 'menor' ou 'igual': ")
            if number_response.lower() == 'maior':
                self.init = hit + 1
            elif number_response.lower() == 'menor':
                self.final = hit - 1
            else:
                print("Acertei,O número é " + str(hit) + ".")
                gameOn = False


def main():
    game_on = Adivinha()   

if __name__ == "__main__":
    main()
