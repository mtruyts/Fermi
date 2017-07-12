# Fermi

Escreva um aplicativo que executa o jogo de Fermi.

São gerados três dígitos aleatórios distintos entre 0 e 9. Estes dígitos são atribuídos ás posições
1, 2 e 3. O objetivo do jogo é que jogador adivinhe os dígitos nas três posições corretamente e
no menor número de tentativas.
Para cada palpite, o jogador fornece três dígitos para as posições 1, 2 e 3. O programa responde
com uma dica que consiste de Fermi, Pico ou Nano.

 Se o dígito adivinhado para uma dada posição está correto, então a resposta é Fermi.

 Se o dígito adivinhado para uma dada posição está em uma posição diferente, a resposta
é Pico.

 Se o dígito adivinhado para uma determinada posição não corresponde a nenhum dos três
dígitos, então a resposta é Nano.

Aqui estão exemplos de respostas para os três dégitos secretos 6, 5 e 8 nas posições 1, 2 e 3,
respectivamente:

Chute       Dica           Explicação
1 2 5 Nano Nano Pico  Valor 5 correto em posição errada.
8 5 3 Pico Fermi Nano Valor 5 correto em posição certa. Valor 8 correto em posição errada.
5 8 6 Pico Pico Pico  Todos corretos em posições erradas.

Observe que se as dicas como acima são dadas, o jogador pode dizer qual número não corresponde.
Por exemplo, dada a dica para a segunda suposição, podemos dizer que 3 não é um dos némeros secretos. Para evitar isso, 
forneça dicas em uma ordem aleatória ou em ordem alfabética (por exemplo, será Fermi Nano Pico em vez de Pico Fermi Nano 
para a segunda resposta). Jogue jogos repetidamente até que o jogador queira parar. Depois de cada jogo, exibir o número 
de suposições feitas.
