package com.example.segundodia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.segundodia.ui.theme.SegundoDiaTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SegundoDiaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   Inicio()
                }

            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Inicio(){
    var texto1 by remember { mutableStateOf("") }
    var texto2 by remember { mutableStateOf("") }
    var texto3 by remember { mutableStateOf("") }
    var texto4 by remember { mutableStateOf("") }
    var texto5 by remember { mutableStateOf("") }
    Column(modifier=Modifier
        .fillMaxSize()
        .padding(10.dp,30.dp,10.dp,10.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Row(modifier=Modifier.padding(30.dp)){
            //TextField Sencillo
            TextField(

                value = texto1, onValueChange = { nuevoTexto ->
                    texto1 = nuevoTexto
                }
            )
        }
        Row(modifier=Modifier.padding(0.dp,0.dp,0.dp,30.dp)){
            // TextField con Label and PlaceHolder
            TextField(
                value=texto2,
                onValueChange ={texto2=it},
                label={Text("Nombre")},
                placeholder={Text("Escribe tu nombre")}
            )
        }
        Row(modifier=Modifier.padding(0.dp,0.dp,0.dp,30.dp)){
            //KeyBoard Options
            TextField(
                value=texto3,
                label={Text("Telefono")},
                keyboardOptions=
                    KeyboardOptions(keyboardType = KeyboardType.Phone),
                onValueChange ={it->
                    texto3=it
                }
            )
        }
        Row(modifier=Modifier.padding(0.dp,0.dp,0.dp,30.dp)){
            OutlinedTextField(
                value=texto4,
                label={Text("Correo")},
                onValueChange ={texto4=it}
            )
        }
        Row(){
            //OutlinedTextField con Icono
            OutlinedTextField(
                value=texto5,
                leadingIcon={Icon(imageVector =
                    Icons.Default.Email,contentDescription = "Email Icon")},
                onValueChange ={texto5=it},
                label={Text("Correo")},
                placeholder={Text("Escribe tu correo")}
            )
        }
    }
}



