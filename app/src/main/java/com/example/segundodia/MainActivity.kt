package com.example.segundodia

import android.R
import android.R.attr.label
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.segundodia.ui.theme.SegundoDiaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SegundoDiaTheme {

                Inicio()
                }
            }
        }
    }


@Composable
fun Inicio(){
    var texto1 by remember { mutableStateOf("") }
    var texto2 by remember { mutableStateOf("") }
    var texto3 by remember { mutableStateOf("") }
    var texto4 by remember { mutableStateOf("") }
    var texto5 by remember { mutableStateOf("") }

    Column() {
        Row() {
            //textField Sencillo
            TextField(value = texto1, onValueChange = { nuevoTexto -> texto1 = nuevoTexto },)
        }
    }
    Row(){
        //textField con label y placeHolder
        TextField(value=texto2,onValueChange = {texto2=it}, label = {Text("Nombre")},
            placeholder = {Text("Escribe tu nombre")})
    }
    Row(){
        //Keyboard Options
        TextField(value = texto3, label={Text("telefono")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone), onValueChange={ it -> texto3=it})
    }

    Row(){
        //OutlinedTextField
        OutlinedTextField(value=texto4,label={Text("Correo")}, onValueChange = {texto4=it})
    }

    Row(){
        //OutlinedTextField Con Icono
       OutlinedTextField(value = texto5, leadingIcon = {Icon(imageVector = Icons.Default.Email,
           contentDescription = "Email Icon")}, onValueChange = {texto5=it}, label={Text("Correo")},
           placeholder = {Text("Escribe tu correo")})
    }

}
