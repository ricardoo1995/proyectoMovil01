package com.example.ricardo_dell.proyectomovil

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import kotlinx.android.synthetic.main.activity_crear_usuario.*
import kotlinx.android.synthetic.main.activity_main.*

class crear_usuario() : AppCompatActivity(), Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_usuario)
        boton_crear_Usuario.setOnClickListener { view: View -> crearUsuario() }
    }

    fun crearUsuario() {
        val uNombre = uNombre.text.toString()
        val uCedula = uCedula.text.toString()
        val uCargo = uCargo.text.toString()
        Factory.usuarios.add(Usuario(uNombre, uCedula, uCargo))
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<crear_usuario> {
        override fun createFromParcel(parcel: Parcel): crear_usuario {
            return crear_usuario(parcel)
        }

        override fun newArray(size: Int): Array<crear_usuario?> {
            return arrayOfNulls(size)
        }
    }
}