package br.com.desafioaudios.modelos;

public class Musica extends Audio{

    @Override
    public int getClassificacao() {
        if(this.getTotalDeReproducao() >= 3){
            return 9;
        } else if (this.getTotalDeReproducao() >= 2){
            return 5;
        } else {
            return 1;
        }
    }
}
