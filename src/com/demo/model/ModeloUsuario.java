package com.demo.model;

import com.demo.model.entity.Usuario;
import java.io.File;
import java.util.Formatter;

public class ModeloUsuario extends Model {

    String barra = File.separator;
    String CrearUbicacion = System.getProperty("user.dir") + barra + "DatosTXT" + barra;

    static public boolean LogIn(Usuario user) {
        boolean band = false;

        if (user.getEmail().compareTo("admin@gmail.com") == 0 && user.getClave().compareTo("123456") == 0) {
            band = true;
        } else {
            band = false;
        }
        return band;
    }

    static public long LogUp(Usuario user) {

        long status = 0;
        return status;
    }

    

}
