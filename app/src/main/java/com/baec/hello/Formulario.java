package com.baec.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        //CREAR VARIABLES DEL MISMO TIPO DEL LAYOUT
        Button btValidar = findViewById(R.id.btnvalidar);
        EditText edNombres, edApellidos, edCedula, edTelefono, edDireccion;
        edNombres=findViewById(R.id.txtnombre);
        edApellidos=findViewById(R.id.txtapellido);
        edCedula=findViewById(R.id.txtcedula);
        edTelefono=findViewById(R.id.txttelefono);
        edDireccion=findViewById(R.id.txtdireccion);

        btValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre=edNombres.getText().toString();
                String apellido=edApellidos.getText().toString();
                String cedula=edCedula.getText().toString();
                String telefono=edTelefono.getText().toString();
                String direccion=edDireccion.getText().toString();
                if(!nombre.isEmpty() && !apellido.isEmpty() && !cedula.isEmpty() && !telefono.isEmpty() && !direccion.isEmpty()){
                    Toast.makeText(Formulario.this,"SUBIENDO INFORMACION",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Formulario.this,"INGRESE DATOS",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}