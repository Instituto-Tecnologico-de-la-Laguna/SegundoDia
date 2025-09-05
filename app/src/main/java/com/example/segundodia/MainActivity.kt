package com.example.segundodia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email

//libreria para los botones
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Icon
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

//se requieren par el textfield
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.segundodia.ui.theme.SegundoDiaTheme
import com.example.segundodia.ui.theme.SegundoDiaTheme

//para los botones
import android.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.ui.res.painterResource
import androidx.compose.ui.graphics.RectangleShape

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
                    Botones();

                }

            }
        }
    }
}

@Composable
fun Botones(){
    //para limitar el tamano de las cosas se agrega una columna
    //y para agregar mas se meten en rows
    Column(modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.padding(20.dp,90.dp,20.dp,20.dp))
        { Button(onClick = {})
        {
            Text("Boton Simple")
        }
        }

        Row() {
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(Color.Red) ) {
                Text("Boton con color")
            }
        }

        Row(){
            Button(onClick = {}) {
                Text("Boton",color = Color.Red)
                Text("Colores",color = Color.Yellow)
            }
        }
        Row(){
            Button(onClick = {}){
                Image(painter = painterResource(id = R.drawable.ic_menu_camera),
                    contentDescription = "")
                Text("Camara")
            }
        }
        Row() {
            Button(onClick = {}, shape = RectangleShape) {
            Text("Botón con rectángulo")
            }
        }
        Row() {
            Button(onClick = {}, shape = RoundedCornerShape(40.dp)) {
            Text("Botón redondeado")
            }
        }
        Row() {
            Button(onClick = {}, shape = CutCornerShape(40.dp)) {
            Text("Terminación recta")
            }
        }
        Row() {
            Button(
                onClick = {}, border = BorderStroke(2.dp, Color.Black),
                colors = ButtonDefaults.outlinedButtonColors(Color.Red)
            ) {
                Text("Botón con borde")
            }
        }
        Row() {
            Button(onClick = {}, elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            )) {
                Text("Botón con elevación")
            }
        }
            }
}