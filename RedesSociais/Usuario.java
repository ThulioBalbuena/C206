package RedesSociais;

public class Usuario {
    private String nome;
    private String email;
    private RedeSocial [] redesSociais;

    public RedeSocial [] getRedesSociais(){
        return this.redesSociais;
    }

    public Usuario(RedeSocial [] redesSociais){
        this.redesSociais = redesSociais;
    }
    
    public String getNome(String nome){
        return this.nome;
    }

    public String getEmail(String email){
        return this.email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
