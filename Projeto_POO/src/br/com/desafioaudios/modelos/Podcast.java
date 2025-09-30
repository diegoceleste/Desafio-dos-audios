package br.com.desafioaudios.modelos;

public class Podcast extends Audio{

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() >= 3){
            return 9;
        } else if (this.getCurtidas() >= 2){
            return 5;
        } else {
            return 1;
        }

    }
}
