import br.com.desafioaudios.modelos.Audio;


public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getNome() + " é considerado sucesso absoluto e preferido por todos!" );
        } else if (audio.getClassificacao() >= 5){
            System.out.println(audio.getNome() + " tambem é um dos que todo mundo esta curtindo");
        } else {
            System.out.println(audio.getNome() + " não esta muito bem classificada.");
        }

    }

}


