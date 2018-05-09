package com.example.ricardo_dell.proyectomovil

class Factory {
    companion object {
        var usuarios:ArrayList<Usuario> = ArrayList()

        init {
            usuarios.add(Usuario("Ricardo", "1722730650", "Gerente"))

        }

    }
}