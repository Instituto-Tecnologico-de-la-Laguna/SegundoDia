package com.example.segundodia

import android.graphics.Color
import android.os.Bundle
import android.os.Message
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.unit.dp
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

    Column(modifier = Modifier.fillMaxSize().padding(10.dp,30.dp,10.dp, 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row() {
            TextField(
                value = texto1, onValueChange = { nuevoTexto -> texto1 = nuevoTexto }
            )
        }
        Row {
            TextField(
                value=texto2,
                onValueChange = {texto2=it},
                label = {Text(text="Nombre")},
                placeholder = {Text(text="Escribre tu nombre")}
            )
        }
        Row(){
            TextField(
                value=texto3,
                label={Text(text="Telefono")},
                keyboardOptions =
                        KeyboardOptions(keyboardType = KeyboardType.Phone),
                onValueChange = {it->
                    texto3 = it
                }
            )
        }

        Row(){
            OutlinedTextField(
                value=texto4,
                label={Text(text="Correo")},
                onValueChange = {texto4=it}
            )
        }

        Row() {
            //OutlinedTextField con icono
            OutlinedTextField(
                value=texto5,
                leadingIcon = { Icon(imageVector =
                    Icons.Default.Email, contentDescription = "Email Icon" )},
                onValueChange = {texto5=it},
                    label={Text(text="Correo")},
                    placeholder = {Text(text="Escribe tu correo")
                }
            )
        }


    }
}


@Preview(showBackground = true)
@Composable
fun Botones(){
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Row(){
            Button(onClick = {/*TODO*/}) {
                Text(text="Boton simple")
            }
        }
        Row {
            Button(onClick = {/*TODO*/},
                colors = ButtonDefaults.buttonColors()) {
                Text(text="Boton con color")
            }
        }
    }
}
