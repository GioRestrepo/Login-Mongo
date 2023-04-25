package com.form.backform.controllers;


import com.form.backform.pojo.LoginReq;
import com.form.backform.responses.RespuestaLogin;
import com.form.backform.servicies.AuthServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class AuthController {

    @Autowired
    private AuthServiceImplement authServiceImplement;

    @PostMapping ("/login")
    public Mono<RespuestaLogin> login(@RequestBody LoginReq loginReq){

        Mono<RespuestaLogin> logeoExitoso = authServiceImplement.login(loginReq);

        return  logeoExitoso;
    }
}
