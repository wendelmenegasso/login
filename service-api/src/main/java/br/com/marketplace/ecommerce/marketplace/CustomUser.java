package br.com.marketplace.ecommerce.marketplace;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * A custom user representation.
 *
 * @author Rob Winch
 */
@Getter
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class CustomUser {

    private final long id;

    private final String email;

    private String nome;

    private String senha;

    private String perfil;

    private String token;

//    @JsonCreator
//    public CustomUser(long id, String email, String password) {
//        this.id = id;
//        this.email = email;
//        this.senha = password;
//    }

    public CustomUser(long id,String nome, String email, String senha, String perfil) {

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;

    }

    public void setToken(String token){
        this.token = token;
    }

}
