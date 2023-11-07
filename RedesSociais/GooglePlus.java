package RedesSociais;

public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConferencia {


    @Override
    public void postarFoto() {
        System.out.println("Postando foto no GooglePlus");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no GooglePlus");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postando comentário no GooglePlus");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtindo publicação no GooglePlus");
    }
    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no GooglePlus");
    }
    @Override
    public void fazStreaming() {
        System.out.println("Fazendo video chamada no GooglePlus");
    }
}
