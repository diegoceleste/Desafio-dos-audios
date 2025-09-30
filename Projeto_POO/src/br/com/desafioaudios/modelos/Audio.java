package br.com.desafioaudios.modelos;

public class Audio {
    private String nome;
    private int duracao;
    private int totalDeReproducao;
    private int curtidas;
    private int classificacao;


    public int getClassificacao() {
        return classificacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void reproduzir(){
        totalDeReproducao++;
    }

    public void curtir(){
        curtidas++;
    }

    public void getDetalhes(){
        System.out.printf("O nome da musica é: "+nome);
        System.out.printf("\nO tempo de duração em segundos é: "+duracao);
        System.out.printf("\nTotal de reproduções: "+totalDeReproducao);
        System.out.printf("\nO total de curtidas é: "+curtidas+" \n");
    }
}
