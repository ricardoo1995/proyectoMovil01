package com.example.ricardo_dell.proyectomovil

class Usuario constructor(var uNombre: String,
                          var uCedula: String,
                          var uCargo: String) {

    override fun toString(): String {
        return "$uNombre $uCedula $uCargo"
    }
}

