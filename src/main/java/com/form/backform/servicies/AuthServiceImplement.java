package com.form.backform.servicies;

import com.form.backform.pojo.LoginReq;
import com.form.backform.responses.RespuestaLogin;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AuthServiceImplement implements AuthService{


    @Override
    public Mono<RespuestaLogin> login(LoginReq loginReq) {
        Mono<String> usuario = Mono.just("user123");

        return  usuario.map(
             usuario1 -> {
                 if (usuario1.equals(loginReq.getContrasenia())) {

                     return new RespuestaLogin("Usuario logeado correctamente");
                 }
                 return new RespuestaLogin("El usuario no se logeo");

             }
        );

    }
}
