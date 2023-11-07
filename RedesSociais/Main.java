package RedesSociais;

    public class Main {
        public static void main(String[] args) {

            Twitter twitter = new Twitter();
            GooglePlus googlePlus = new GooglePlus();
            Instagram instagram = new Instagram();
            Facebook facebook = new Facebook();

            facebook.senha = "123456";
            twitter.senha = "767554";
            googlePlus.senha = "245235";
            instagram.senha = "634636";

            facebook.numAmigos = 100;
            twitter.numAmigos = 200;
            googlePlus.numAmigos = 300;
            instagram.numAmigos = 400;

            RedeSocial [] redesSociais = new RedeSocial[2];
            redesSociais[0] = twitter;
            redesSociais[1] = facebook;
            Usuario usuario = new Usuario(redesSociais);

            usuario.setNome("João");
            usuario.setEmail("joaozin@alonemail.com");

            System.out.println(usuario.getNome("João")+" abriu o twitter: ");
            ((Twitter) usuario.getRedesSociais()[0]).postarFoto();
            ((Twitter) usuario.getRedesSociais()[0]).curtirPublicacao();
            ((Twitter) usuario.getRedesSociais()[0]).compartilhar();
            System.out.println(usuario.getNome("João")+" abriu o facebook: ");
            ((Facebook) usuario.getRedesSociais()[1]).postarVideo();
            ((Facebook) usuario.getRedesSociais()[1]).postarComentario();
            ((Facebook) usuario.getRedesSociais()[1]).fazStreaming();
            





        }       
    
}
