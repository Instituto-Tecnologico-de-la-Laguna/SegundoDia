package com.example.segundodia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

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
                    GreetingText(
                        "Jose Angel Palomo Perez",
                        "22130822"
                    )
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String,clase:String ,modifier: Modifier = Modifier) {
    Column(

    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Text(
            text = "Angel Palomo",
            fontSize = 30.sp
        )
        Text(
            text = "$clase",
            fontSize = 30.sp

        )
    }
    Column(
        content={
            Text("Hola Mundo")
            Text("Expresion en Content")
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SegundoDiaTheme {
        Greeting("Android","Desarrollo Android")
    }
}

@Composable
fun GreetingText(message:String,from:String, modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = message,
            fontSize = 70.sp,
            lineHeight = 70.sp,
            textAlign = TextAlign.Center,
            color = Color(45, 113, 214)
        )
        Text(
            text = from,
            fontSize = 35.sp,
            color = Color(245, 73, 39)
        )
    }


}

