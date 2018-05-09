package com.example.ricardo_dell.proyectomovil

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), TextWatcher {


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
        editCodigo?.addTextChangedListener(this)
        editNombre?.addTextChangedListener(this)
        editPrecio?.addTextChangedListener(this)
        editDescripcion?.addTextChangedListener(this)

    }
    override fun afterTextChanged(s: Editable?) {

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
       Toast.makeText(this, s.toString(),Toast.LENGTH_SHORT).show()
    }
}

