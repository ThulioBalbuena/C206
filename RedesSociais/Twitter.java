package RedesSociais;

public class Twitter extends RedeSocial implements Compartilhamento{
    
    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Twitter");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no Twitter");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postando comentário no Twitter");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtindo publicação no Twitter");
    }
    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Twitter");
    }
}