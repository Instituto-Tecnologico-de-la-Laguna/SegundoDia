package com.example.segundodia

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

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
                        Greeting(
                        )
                }

            }
        }
    }
}

@Composable
fun Greeting() {
    val context= LocalContext.current
    var texto by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(){
            OutlinedTextField(
                value=texto,
                label={Text("Nombre")},
                onValueChange ={texto=it}
            )
        }
        Row(
            Modifier.align(Alignment.CenterHorizontally)
        ){
            OutlinedButton(onClick = { /*TODO*/
                Toast.makeText(
                    context, //val context= LocalContext.current
                    texto, 
                    
                    Toast.LENGTH_LONG
                ).show()
            }) {
                Text(text = "Enviar")
            }
        }
    }
}


