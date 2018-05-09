package com.example.ricardo_dell.proyectomovil

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
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
    }
}

