package com.demo.controller;

import com.demo.model.entity.Usuario;
import com.demo.model.ModeloUsuario;

public class ControllerLogin extends Controller {

    public ControllerLogin() {

    }

    public boolean LogIn(String usuario, String clave) {
        boolean band = false;
        Usuario user = new Usuario(usuario, clave);
        band = ModeloUsuario.LogIn(user);
        return band;
    }

    public long LogUp() {
        long status = 0;
        return status;
    }

    public long RecuperarClave(String usuario, String clave, String repetirclave) {
        long status = 0;
        Usuario user = new Usuario(usuario, clave, repetirclave);
        status = ModeloUsuario.LogUp(user);

        return status;
    }
}
