package RedesSociais;

public class Facebook extends RedeSocial implements VideoConferencia{

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Facebook");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no Facebook");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postando comentário no Facebook");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtindo publicação no Facebook");
    }
    @Override
    public void fazStreaming() {
        System.out.println("Fazendo video chamada no Facebook");
    }
    
}
