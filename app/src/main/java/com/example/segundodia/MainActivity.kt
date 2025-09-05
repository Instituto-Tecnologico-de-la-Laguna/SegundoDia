package com.example.segundodia


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import android.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


import com.example.segundodia.ui.theme.SegundoDiaTheme

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
                   Botones()
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Botones() {
    Column(
        modifier = Modifier
            .fillMaxWidth(1f),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.padding(20.dp)) {
            Button(onClick = { /*TODO*/ }
            ) {
                Text("Boton Simple")
            }
        }

        Row() {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Red)
            ) {
                Text("Boton con Color")
            }
        }
        Row() {
            Button(onClick = { /*TODO*/ }) {
                Text("Boton ", color = Color.Red)
                Text("Colores", color = Color.Yellow)
            }
        }
        Row() {
            Button(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_menu_camera),
                    contentDescription = ""
                )
                Text("Camara")
            }
        }
        Row() {
            Button(onClick = { /*TODO*/ },
                shape = RectangleShape) {
                Text("Boton con Rectangulo")
            }
        }
        Row(){
            Button(onClick = { /*TODO*/ },
                shape= RoundedCornerShape(40.dp)){
                Text("Boton Redondeado")
            }
        }
        Row(){
            Button(onClick = { /*TODO*/ },
                shape=CutCornerShape(20.dp))
            {
                Text("Terminacion Recta")
            }
        }
        Row(){
            Button(
                onClick = { /*TODO*/ },
                border = BorderStroke(3.dp, Color.Black),
                colors =
                    ButtonDefaults.outlinedButtonColors
                        (contentColor = Color.Red)){
                Text("Boton con Borde")
            }
        }
        Row() {
            Button(
                onClick = { /*TODO*/ },
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 15.dp,
                    disabledElevation = 0.dp
                )
            ) {
                Text("Boton con Elevacion")
            }
        }
    }
}
