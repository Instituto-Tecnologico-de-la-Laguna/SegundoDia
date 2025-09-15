package com.example.segundodia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
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


                }

            }
        }
    }
}


@Composable
fun TextView(texto:String) {
    Text(text=texto,
        fontSize = 40.sp,
        fontWeight = FontWeight.Bold,
        color=Color.Black)
}

@Composable
fun Space(espacio:Int){
    Spacer(modifier=Modifier.height(height = espacio.dp))
}

@Composable
fun MainButton(name:String,backColor:Color,color:Color,onClick:()-> Unit){
    Button(onClick=onClick,
        colors= ButtonDefaults.buttonColors(
            contentColor = color,
            containerColor = backColor
        )){
        Text(text=name)
    }

}










