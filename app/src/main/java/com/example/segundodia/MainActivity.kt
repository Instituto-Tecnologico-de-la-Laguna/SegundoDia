package com.example.segundodia

import android.R.attr.content
import android.R.id.content
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
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
                    val focusManager = LocalFocusManager.current
                    val items = listOf(
                        Color.Green,
                        Color.Green,
                        Color.White,
                        Color.White,
                        Color.Black,
                        Color.White,
                        Color.White,
                        Color.Red,
                        Color.Red
                    )
                    MainScreen(items)
                }
            }
        }
    }
}



@Composable
fun  MainScreen(items: List<Color>){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Row() {
            Image(
                painter = painterResource(id = R.drawable.ds2_sxsw2025_screenshots013),
                contentDescription = null

            )
        }
        Row() {
            Texto(texto = "Text1",Color.Black, colorLetra = Color.Red)
            Spacer(modifier = Modifier.padding(10.dp))
            Texto(texto = "Text2",Color.Black, colorLetra = Color.Red)
        }
        Spacer(modifier = Modifier.padding(20.dp))
        LazyRow(){
            items(items.size){ index ->
                for (item in items){
                    Circulo(item)
                }

            }
        }
    }
}

@Composable
fun Texto(texto: String, fondo: Color, colorLetra: Color){
    Text(
        text = texto,
        color=colorLetra,
        fontSize = 40.sp,
        modifier = Modifier.background(fondo),
    )
}

@Composable
fun Circulo(color:Color){
    Box(modifier = Modifier.background(color, shape = CircleShape).size(70.dp).padding(10.dp)){

    }
}