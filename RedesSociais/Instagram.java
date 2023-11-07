package RedesSociais;

public class Instagram extends RedeSocial{

    @Override   
    public void postarFoto() {
        System.out.println("Postando foto no Instagram");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no Instagram");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postando comentário no Instagram");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtindo publicação no Instagram");
    }
}
