# Desafio-dos-audios
Neste desafio, o objetivo era a utilização dos conhecimentos adquiridos até este ponto. 

ESTRUTURA DAS CLASSES:
Modelos:
Foi utilizado uma superclasse com nome Audio para base de todos os tipos de conteúdos que teriam nesta biblioteca musical.
A partir desta classe foi feita a classe Musica, e a Podcast. É possível adicionar outros campos para ambas, deixando mais completas e com informações de tipos diferentes nestas duas classes.
A estrutura foi pensada para que em processos futuros outros tipos de audio sejam adicionados, ou outros tipos de mídias diferentes de apenas audio.

Sistemas/Objetos:
Dentro da classe Main, foi adicionado de forma manual os objetos de musicas (musica1 e musica2), e podcast(podcast1 e podcast2), para que o projeto tenha já algum conteúdo no inicio de seu processamento.
A classe MinhasPreferidas foi feita para classificar as musicas/podcasts da biblioteca, de acordo com suas métricas de forma individual. Dentro das musicas, esta classificação herdada, vira um método onde o número de repetições é o que define uma nota que pode ser 1, 5 ou 9. E dentro dos podcasts, por serem audios onde a repetição é menos comum, o critério para classificação é o numero de curtidas em cada objeto, podendo ter uma nota igual a musica, 1, 5 ou 9. A partir desta classificação, MinhasPreferencias utiliza estes números para classificar os audios com os mesmos termos, independente do tipo de audio que é, desde que a nota para tal classificação seja atingida.
1 = "é considerado sucesso absoluto e preferido por todos!"
5 = "também é um dos que todo mundo está curtindo"
9 = "não está muito bem classificada."

ESTRUTURA:
Até o momento deste exercício, o conhecimento adquirido e utilizado foi de Condicionais (If/Else e Switch) para a tomada de decisões na navegação do menu, seja avançando, voltando para o menu anterior ou até mesmo para escolher quando executar um método para contabilizar uma "Curtida", ou "Reprodução" dos audios mencionados.
Além da tomada de decisão foi utilizado loop (While) para manter os acessos aos menus, enquanto o usuário não solicitar acesso a um menu a frente/anterior, o menu deve aparecer, ao escolher uma opção que executa um método, o mesmo é executado e quando finalizado o menu volta a aparecer, para que a execução do programa não chegue em um fim por falta de opções para interação.
Um controle de estados foi inserido dentro destes Whiles, para que quando um menu seja exibido para o usuario, uma variavel do tipo booleana é validada, permitindo a permanência a aquele menu, ao selecionar a opção de voltar, a variável muda para falso e o menu retrocede para o estágio anterior/opções anteriores. Neste ponto ao voltar o menu, e depois acessar o mesmo novamente, o estado muda para verdadeiro novamente, permitindo que o usuário fique no menu.

Esta é uma primeira versão deste desafio, onde pude controlar a máquina de estados, e principalmente interagir com as escolhas do usuário, para uma próxima versão do projeto a implementação de Array para adicionar e gerenciar estes áudios deve ser incluído.
