import br.com.desafioaudios.modelos.Audio;
import br.com.desafioaudios.modelos.Musica;
import br.com.desafioaudios.modelos.Podcast;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String [] args){

        Musica musica1 = new Musica();
        musica1.setNome("A horse with no name");
        musica1.setDuracao(147);

        Musica musica2 = new Musica();
        musica2.setNome("Passo bem solto");
        musica2.setDuracao(241);

        Podcast podcast1 = new Podcast();
        podcast1.setNome("Primo Rico");
        podcast1.setDuracao(60);

        Podcast podcast2 = new Podcast();
        podcast2.setNome("Jovem Nerd");
        podcast2.setDuracao(90);

        String textoMenuInicial = """    
                ********************************            
                O que voce deseja ouvir hoje?
                1. Musicas.
                2. Podcasts
                3. Ver a classificação da biblioteca disponivel.
                ********************************
                """;

        String listaDeMusicas = """    
                ********************************            
                Estas são as musicas disponiveis:
                1. A horse with no name.
                2. Passo bem solto.
                0. Voltar!!!
                ********************************
                """;
        String opcoesDaMusica = """    
                ********************************            
                O que deseja fazer?
                1. Tocar a musica.
                2. Curtir a musica.
                3. Obter os detalhes da musica.
                0. Voltar!!!
                ********************************
                """;
        String listaDePodcast = """    
                ********************************            
                Estas são as musicas disponiveis:
                1. Primo Rico.
                2. Jovem Nerd.
                0. Voltar!!!
                ********************************
                """;
        String opcoesDoPodcast = """    
                ********************************            
                O que deseja fazer?
                1. Tocar o podcast.
                2. Curtir o podcast.
                3. Obter os detalhes do podcast.
                0. Voltar!!!
                ********************************
                """;


        Scanner scannerMenu = new Scanner(System.in);


        boolean booMenuInicial = true; //Usada para o menu inicial Musica/Podcast
        boolean booMenuAudio = true; //Usada para o menu da lista de musicas/Podcasts
        boolean booMenuAcoes = true; //Usada para o menu de ações do audio. Curtir/Reproduzir

        while (booMenuInicial){
            System.out.printf(textoMenuInicial);
            int opcaoMenu = scannerMenu.nextInt();

            //Neste SWITCH a pessoa esta escolhendo o que quer ouvir (Musica ou Podcast)
            switch (opcaoMenu){
                case 1: //Este acesso é para a lista das Musicas.
                    booMenuAudio = true; //Este true serve, para que sempre que tente entrar no menu, o loop a seguir funcione
                    while (booMenuAudio){
                        System.out.printf(listaDeMusicas);
                        opcaoMenu = scannerMenu.nextInt();
                        //Neste SWITCH a pessoa esta escolhendo qual das musicas quer acessar.
                        switch (opcaoMenu){
                            case 1:
                                booMenuAcoes = true; //Esta mudança é necessario para caso saia e volte a este menu.
                                //Neste SWITCH o user escolhe o que vai fazer nesta musica.
                                while (booMenuAcoes){
                                    //É necessario que o Scanner e o texto fiquem dentro do loop para evitar
                                    //que a opção escolhida pelo user fique se repetindo.
                                    System.out.printf(opcoesDaMusica);
                                    opcaoMenu = scannerMenu.nextInt();
                                    switch (opcaoMenu){
                                        case 1:
                                            musica1.reproduzir();
                                            System.out.printf("Tocando A horse with no name...\n");
                                            break;

                                        case 2:
                                            musica1.curtir();
                                            System.out.printf("Você curtiu esta musica!\n");
                                            break;

                                        case 3:
                                            musica1.getDetalhes();
                                            break;

                                        case 0:
                                            booMenuAcoes = false; //Volta um nivel no menu.
                                            break;

                                        default:
                                            System.out.printf("Opção invalida, tente novamente.");

                                    }

                                }
                                break;
                            case 2:
                            booMenuAcoes = true; //Esta mudança é necessario para caso saia e volte a este menu.
                                //Neste SWITCH o user escolhe o que vai fazer nesta musica.
                                while (booMenuAcoes){
                                    //É necessario que o Scanner e o texto fiquem dentro do loop para evitar
                                    //que a opção escolhida pelo user fique se repetindo.
                                    System.out.printf(opcoesDaMusica);
                                    opcaoMenu = scannerMenu.nextInt();
                                    switch (opcaoMenu){
                                        case 1:
                                            musica2.reproduzir();
                                            System.out.printf("Tocando Passo bem solto...\n");
                                            break;

                                        case 2:
                                            musica2.curtir();
                                            System.out.printf("Você curtiu esta musica!\n");
                                            break;

                                        case 3:
                                            musica2.getDetalhes();
                                            break;

                                        case 0:
                                            booMenuAcoes = false; //Volta um nivel no menu.
                                            break;

                                        default:
                                            System.out.printf("Opção invalida, tente novamente.");

                                    }

                                }
                                break;
                            case 0:
                                booMenuAudio = false;
                                break;

                            default:
                                System.out.printf("Opção invalisa, tente novamente.");
                        }
                    }
                    break;
                case 2: //Este acesso é para a lista dos Podcasts.
                    booMenuAudio = true; //Este true serve, para que sempre que tente entrar no menu, o loop a seguir funcione
                    while (booMenuAudio){
                        System.out.printf(listaDePodcast);
                        opcaoMenu = scannerMenu.nextInt();
                        //Neste SWITCH a pessoa esta escolhendo qual dos podcasts quer acessar.
                        switch (opcaoMenu){
                            case 1:
                                booMenuAcoes = true; //Esta mudança é necessario para caso saia e volte a este menu.
                                //Neste SWITCH o user escolhe o que vai fazer neste podcast.
                                while (booMenuAcoes){
                                    //É necessario que o Scanner e o texto fiquem dentro do loop para evitar
                                    //que a opção escolhida pelo user fique se repetindo.
                                    System.out.printf(opcoesDaMusica);
                                    opcaoMenu = scannerMenu.nextInt();
                                    switch (opcaoMenu){
                                        case 1:
                                            podcast1.reproduzir();
                                            System.out.printf("Tocando Primo Rico...\n");
                                            break;

                                        case 2:
                                            podcast1.curtir();
                                            System.out.printf("Você curtiu este podcast!\n");
                                            break;

                                        case 3:
                                            podcast1.getDetalhes();
                                            break;

                                        case 0:
                                            booMenuAcoes = false; //Volta um nivel no menu.
                                            break;

                                        default:
                                            System.out.printf("Opção invalida, tente novamente.");

                                    }

                                }
                                break;
                            case 2:
                                booMenuAcoes = true; //Esta mudança é necessario para caso saia e volte a este menu.
                                //Neste SWITCH o user escolhe o que vai fazer nesta musica.
                                while (booMenuAcoes){
                                    //É necessario que o Scanner e o texto fiquem dentro do loop para evitar
                                    //que a opção escolhida pelo user fique se repetindo.
                                    System.out.printf(opcoesDaMusica);
                                    opcaoMenu = scannerMenu.nextInt();
                                    switch (opcaoMenu){
                                        case 1:
                                            podcast2.reproduzir();
                                            System.out.printf("Tocando Jovem Nerd...\n");
                                            break;

                                        case 2:
                                            podcast2.curtir();
                                            System.out.printf("Você curtiu este podcast!\n");
                                            break;

                                        case 3:
                                            podcast2.getDetalhes();
                                            break;

                                        case 0:
                                            booMenuAcoes = false; //Volta um nivel no menu.
                                            break;

                                        default:
                                            System.out.printf("Opção invalida, tente novamente.");

                                    }

                                }
                                break;
                            case 0:
                                booMenuAudio = false;
                                break;

                            default:
                                System.out.printf("Opção invalisa, tente novamente.");
                        }
                    }
                    break;
                case 3: //Esta parte do codigo é um extra, para puxar a classificação dos conteudos.

                MinhasPreferidas preferidas = new MinhasPreferidas();
                preferidas.inclui(musica1);
                preferidas.inclui(musica2);
                preferidas.inclui(podcast1);
                preferidas.inclui(podcast2);
                    break;

            }
        }




    }
}