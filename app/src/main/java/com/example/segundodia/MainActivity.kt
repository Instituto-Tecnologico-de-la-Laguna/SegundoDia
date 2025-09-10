package com.example.segundodia

import android.R
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import android.os.Bundle
import androidx.compose.foundation.layout.Column
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.segundodia.ui.theme.SegundoDiaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface (modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ){
                Inicio()
                //Botones()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Inicio() {
    var texto by remember { mutableStateOf("") }
    var texto2 by remember { mutableStateOf("") }
    var texto3 by remember { mutableStateOf("") }
    var texto4 by remember { mutableStateOf("") }
    var texto5 by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.
        fillMaxSize().
        padding(10.dp, 10.dp, 10.dp, 30.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Row (
            modifier = Modifier.
            padding(30.dp)
        ) {
            //TextField sencillo
            TextField(
                value = texto,
                onValueChange = { nuevoTexto -> texto = nuevoTexto },
            )
        }
        Row (
            modifier = Modifier.
            padding(0.dp, 0.dp, 0.dp, 30.dp)
        ) {
            //TextField con Label y Placeholder
            TextField(
                value = texto2,
                onValueChange = { texto2 = it },
                label = { Text("Nombre") },
                placeholder = { Text("Escriba su nombre") }
            )
        }
        Row (
            modifier = Modifier.
            padding(0.dp, 0.dp, 0.dp, 30.dp)
        ) {
            //Keyboard Options
            TextField(
                value = texto3,
                onValueChange = { it -> texto3 = it },
                label = { Text("Telefono") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
            )
        }
        Row (
            modifier = Modifier.
            padding(0.dp, 0.dp, 0.dp, 30.dp)
        ){
            OutlinedTextField(
                value = texto4,
                label = { Text("Correo") },
                onValueChange = { texto4 = it },
            )
        }
        Row (
           modifier = Modifier.
            padding(0.dp, 0.dp, 0.dp, 30.dp)
        ){
            //OutlinedTextField con Icono
            OutlinedTextField(
                value = texto5,
                leadingIcon = { Icon(imageVector = Icons.Default.Email , contentDescription = "Email Icon") },
                onValueChange = { texto5 = it },
                label = { Text("Correo") },
                placeholder = { Text("Escriba su correo") }
            )
        }
    }
}

/*@Preview(showBackground = true)
@Composable
fun Botones(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Row(modifier = Modifier.padding(20.dp)){
            Button(onClick = {/*TODO*/}
            ){
                Text("Boton con Color")
            }
        }

        Row(){
            Button(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(Color.Red)
            ) {
                Text("Boton con Color")
            }
        }

        Row(){
            Button(onClick = {/*TODO*/})
            {
                Text("Boton", color = Color.Red)
                Text("Colors", color = Color.Yellow)
            }
        }

        Row(){
            Button(onClick = {/*TODO*/}) {
                Image(painter = painterResource(id = R.drawable.ic_dialog_map),
                    contentDescription = "")
            }
        }

        Row(){
            Button(onClick = {/*TODO*/}, shape = RectangleShape) {
                Text("Boton con rectangulo")
            }
        }

        Row(){
            Button(onClick = {/*TODO*/},
                shape = RoundedCornerShape(40.dp)){
                Text("Boton Redondeado")
            }
        }

        Row(){
            Button(onClick = {/*TODO*/},
                shape = CutCornerShape(40.dp)){
                Text("Terminacion Recta")
            }
        }

        Row(){
            Button(onClick = {/*TODO*/},
                border = BorderStroke(2.dp, Color.Black),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)
            ){
                Text("Boton con Borde")
            }
        }

        Row(){
            Button(onClick = {/*TODO*/},
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 15.dp,
                    disabledElevation = 0.dp
                )) {
                Text("Boton con elevacion")
            }
        }
    }

}*/