package com.example.ricardo_dell.proyectomovil

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){


    private  var editCodigo: EditText?= null
    private  var editNombre: EditText?= null
    private  var editPrecio: EditText?= null
    private  var editDescripcion: EditText?= null



    private var pCodigo: String?= null
    private var pNombre: String?= null
    private var pPrecio = 0
    private var pDescripcion: String?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editCodigo = findViewById(R.id.editText_Codigo)
        editNombre = findViewById(R.id.editText_Nombre)
        editPrecio = findViewById(R.id.editText_Precio)
        editDescripcion = findViewById(R.id.editText_Descripcion)
        //Obtener datos ingresados


        boton_crear_Usuario
                .setOnClickListener { view: View ->
                    irAActividadCrearUsuario()
                }


    }


    fun irAActividadCrearUsuario() {
        val intent = Intent(this, crear_usuario::class.java)
        startActivity(intent)
    }
}

